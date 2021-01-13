package com.gtmap.fundsupervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.dto.ZjjgxyZhxxDto;
import com.gtmap.fundsupervision.entity.*;
import com.gtmap.fundsupervision.myenum.ShiFouEnum;
import com.gtmap.fundsupervision.myenum.YouXiaoXingEnum;
import com.gtmap.fundsupervision.myenum.ZhuTiLeiBieEnum;
import com.gtmap.fundsupervision.myenum.ZjjgxyZtEnum;
import com.gtmap.fundsupervision.service.*;
import com.gtmap.fundsupervision.utils.UuidUtil;
import com.gtmap.fundsupervision.utils.ZjlbUtil;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.JkmxjlVo;
import com.gtmap.fundsupervision.vo.ZjjgxVo;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/18
 * @description 资金监管箱
 */

@Service
public class ZjjgxServiceImpl implements ZjjgxService {

    @Autowired
    private FcjyClfMmhtService fcjyClfMmhtService;

    @Autowired
    private FcjyClfJjhtService fcjyClfJjhtService;

    @Autowired
    private FcjyCyztCyqyjbxxService fcjyCyztCyqyjbxxService;

    @Autowired
    private FcjyClfZjjgxyService fcjyClfZjjgxyService;

    @Autowired
    private FcjyClfZjjghtService fcjyClfZjjghtService;

    @Autowired
    private FcjyClfZjjghtZtService fcjyClfZjjghtZtService;

    @Autowired
    private FcjyClfZjjgzhService fcjyClfZjjgzhService;

    @Autowired
    private FcjyClfZjjgrzjlService fcjyClfZjjgrzjlService;

    @Autowired
    private FcjyClfZjjgczjlService fcjyClfZjjgczjlService;

    @Autowired
    private FcjyCyztCyryjbxxService fcjyCyztCyryjbxxService;

    @Autowired
    private FcjyClfZjjgxyBljdService fcjyClfZjjgxyBljdService;

    /**
     * @description 获取资金监管箱页面展示数据
     * @return
     */
    @Override
    public DataVo<ZjjgxVo> getData(String searchDjbh,String searchXybh,String searchHtbh,Integer page,Integer limit) {
        //封装DataVo<ZjjgxVo>数据
        DataVo<ZjjgxVo> zjjgxVoDataVo = new DataVo<>();
        zjjgxVoDataVo.setCode(0);
        zjjgxVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);
        //查询资金监管数据
        List<ZjjgxVo> allData = fcjyClfZjjgxyService.getZjjgxVo(searchDjbh,searchXybh,searchHtbh);

        //协议状态 根据资金监管协议状态zt工具类判断
        for (ZjjgxVo zjjgxVo : allData){
            if (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxVo.getSfcx()) || ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxVo.getSfcx())){
                zjjgxVo.setSfcx("是");
            }else {
                zjjgxVo.setSfcx("否");
            }
        }

        //进行pageInfo包装
        PageInfo<ZjjgxVo> pageInfo = new PageInfo<>(allData);
        List<ZjjgxVo> list = pageInfo.getList();

        zjjgxVoDataVo.setCount((int)pageInfo.getTotal());
        zjjgxVoDataVo.setData(list);

        //返回数据
        return zjjgxVoDataVo;
    }

    /**
     * 资金监管协议保存
     * @param zjjgxyDto
     */
    @Transactional
    @Override
    public void saveZjjgxy(ZjjgxyDto zjjgxyDto) {
        //根据合同编号获取存量房买卖合同
        FcjyClfMmhtEntity clfMmhtByHtbh = fcjyClfMmhtService.findClfMmhtByHtbh(zjjgxyDto.getHtbh());

        //根据合同id获取存量房买卖合同房屋权属概况
//        FcjyClfMmhtFwqsgkEntity fwqsgkByHtid = fcjyClfMmhtService.findFwqsgkByHtid(clfMmhtByHtbh.getHtid());

        //根据合同编号获取存量房买卖合同主体
        List<FcjyClfMmhtZtEntity> mmhtZtByHtbhList = fcjyClfMmhtService.findMmhtZtByHtbh(zjjgxyDto.getHtbh());
        FcjyClfMmhtZtEntity fcjyClfMmhtZtEntityBuy = new FcjyClfMmhtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfMmhtZtEntity fcjyClfMmhtZtEntitySale = new FcjyClfMmhtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfMmhtZtEntity fcjyClfMmhtZtEntity : mmhtZtByHtbhList){
            //存量房买卖合同主体-买受人
            if (ZhuTiLeiBieEnum.BUY.getCode().equals(fcjyClfMmhtZtEntity.getZtlb())){
                fcjyClfMmhtZtEntityBuy = fcjyClfMmhtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if (ZhuTiLeiBieEnum.SALE.getCode().equals(fcjyClfMmhtZtEntity.getZtlb())){
                fcjyClfMmhtZtEntitySale = fcjyClfMmhtZtEntity;
            }
        }

        //根据户编号查询存量房经纪合同
        FcjyClfJjhtEntity jjhtByHbh = fcjyClfJjhtService.findJjhtByHbh(clfMmhtByHtbh.getHbh());

        //根据企业编号查询企业基本信息
        FcjyCyztCyqyjbxxEntity cyqyjbxxByQybh = fcjyCyztCyqyjbxxService.findCyqyjbxxByQybh(jjhtByHbh.getFdcjjjgbh());

        //根据合同id获取存量房买卖房价款及支付方式
        FcjyClfMmhtCjjgfkfsEntity cjjgfkfsByHtid = fcjyClfMmhtService.findCjjgfkfsByHtid(clfMmhtByHtbh.getHtid());

        //根据合同id获取存量房买卖合同房屋交付
        FcjyClfMmhtFwjfEntity fwjfByHtid = fcjyClfMmhtService.findFwjfByHtid(clfMmhtByHtbh.getHtid());

        //查询从业人员信息
        FcjyCyztCyryjbxxEntity cyryjbxxByRyid = fcjyCyztCyryjbxxService.findCyryjbxxByRyid(jjhtByHbh.getFdcjjrbh());

        //资金监管协议数据-begin
        FcjyClfZjjgxyEntity fcjyClfZjjgxyEntity = new FcjyClfZjjgxyEntity();
        fcjyClfZjjgxyEntity.setJgid(zjjgxyDto.getXybh()); //监管id
        fcjyClfZjjgxyEntity.setJgbh((long)Integer.parseInt(zjjgxyDto.getDjbh())); //监管编号-页面的登记编号
        fcjyClfZjjgxyEntity.setJgfwjgbh(jjhtByHbh.getFdcjjjgbh()); //监管服务机构编号
        fcjyClfZjjgxyEntity.setJgfwjgmc(cyqyjbxxByQybh.getQymc()); //监管服务机构名称
        fcjyClfZjjgxyEntity.setJgfwrybh(jjhtByHbh.getFdcjjrbh()); //监管服务人员编号
        fcjyClfZjjgxyEntity.setHbzl(clfMmhtByHtbh.getHtbz()); //货币种类
        fcjyClfZjjgxyEntity.setHtzje(cjjgfkfsByHtid.getMmfjk()); //合同总金额
//        //从存量房买卖房价款及支付方式进行查询
//        if ("0".equals(cjjgfkfsByHtid.getSfzjjg())){ //不进行资金监管
//            fcjyClfZjjgxyEntity.setZjgje(0l);
//        }else if ("1".equals(cjjgfkfsByHtid.getSfzjjg())){ //进行资金监管
//            fcjyClfZjjgxyEntity.setZjgje(cjjgfkfsByHtid.getZjjgje()); //总监管金额
//        }
        fcjyClfZjjgxyEntity.setZjgje(Double.parseDouble(zjjgxyDto.getJgzje())); //总监管金额-从页面获取的监管资金额
        fcjyClfZjjgxyEntity.setMsrzyzjje(cjjgfkfsByHtid.getYcxfkjgje()); //买受人自有资金金额
        fcjyClfZjjgxyEntity.setMsrdkje(cjjgfkfsByHtid.getYhdkdkje()); //买受人贷款金额
        //获取缴款期限，从签订协议起，推迟签订后交付日的时间
        Date now = new Date();
        Date endDate = DateUtils.addDays(now,fwjfByHtid.getMfycxjfr());
        fcjyClfZjjgxyEntity.setZyzjjkqx(new java.sql.Date(endDate.getTime())); //自有资金缴款期限
        if ("3".equals(cjjgfkfsByHtid.getYhdkdkzl())){ //公积金贷款
            fcjyClfZjjgxyEntity.setGjjdkje(cjjgfkfsByHtid.getYhdkdkje()); //公积金贷款金额
            fcjyClfZjjgxyEntity.setSydkje(0L); //商业贷款金额
        }else if ("4".equals(cjjgfkfsByHtid.getYhdkdkzl())){ //商业贷款
            fcjyClfZjjgxyEntity.setSydkje(cjjgfkfsByHtid.getYhdkdkje()); //商业贷款金额
            fcjyClfZjjgxyEntity.setGjjdkje(0L); //公积金贷款金额
        }else {
            fcjyClfZjjgxyEntity.setGjjdkje(0L); //公积金贷款金额
            fcjyClfZjjgxyEntity.setSydkje(0L); //商业贷款金额
        }
        fcjyClfZjjgxyEntity.setQdxyrq(new java.sql.Date(now.getTime())); //签订协议日期
        fcjyClfZjjgxyEntity.setMsrmm("123"); //买受人密码
        fcjyClfZjjgxyEntity.setCmrmm("123"); //出卖人密码
        fcjyClfZjjgxyEntity.setCmrdyjyzt("0"); //出卖人抵押校验状态 0-未校验 1-抵押余额已输入 2-无抵押
//        fcjyClfZjjgxyEntity.setCxsj(new java.sql.Date(now.getTime())); //撤销时间
//        fcjyClfZjjgxyEntity.setGdsj(new java.sql.Date(now.getTime())); //归档时间
        fcjyClfZjjgxyEntity.setZt(ZjjgxyZtEnum.CAOGAO.getCode()); //状态 101-草稿 103-变更中 201-初次确认 301-手工撤销 302-系统撤销 303-交易结束
        fcjyClfZjjgxyEntity.setSfyx(YouXiaoXingEnum.YOUXIAO.getCode()); //是否有效 1-有效 2-无效
        fcjyClfZjjgxyEntity.setBz("无备注"); //备注
        //资金监管协议数据-over

        //资金监管合同数据-begin
        FcjyClfZjjghtEntity fcjyClfZjjghtEntity = new FcjyClfZjjghtEntity();
        fcjyClfZjjghtEntity.setJgid(zjjgxyDto.getXybh()); //监管id
        fcjyClfZjjghtEntity.setHtbh((long)Integer.parseInt(zjjgxyDto.getHtbh())); //合同编号-卖合同的合同编号
//        fcjyClfZjjghtEntity.setHtbh((long)UuidUtil.getUuidNum()); //合同编号-与买卖合同的合同编号不同，这个是监管合同的合同编号
        fcjyClfZjjghtEntity.setHbh(clfMmhtByHtbh.getHbh()); //户编号
        fcjyClfZjjghtEntity.setFwzl(clfMmhtByHtbh.getFwzl()); //房屋坐落
        fcjyClfZjjghtEntity.setFwmj(Double.parseDouble(zjjgxyDto.getJzmj())); //房屋面积
        fcjyClfZjjghtEntity.setFwsyqzh(zjjgxyDto.getQzhm()); //房屋所有权编号
        fcjyClfZjjghtEntity.setCqrxm(fcjyClfMmhtZtEntityBuy.getZtxm()); //产权人姓名
        fcjyClfZjjghtEntity.setCqrdh(fcjyClfMmhtZtEntityBuy.getLxdh()); //产权人电话
        //处理合同金额
        if (null == zjjgxyDto.getSfje())
            zjjgxyDto.setSfje("0");
        if (null == zjjgxyDto.getDkje())
            zjjgxyDto.setDkje("0");
        double htje = Double.parseDouble(zjjgxyDto.getSfje()) + Double.parseDouble(zjjgxyDto.getDkje());
        fcjyClfZjjghtEntity.setHtje(htje); //合同金额
        fcjyClfZjjghtEntity.setHbzl(clfMmhtByHtbh.getHtbz()); //货币种类
        fcjyClfZjjghtEntity.setJjjgbh(jjhtByHbh.getFdcjjjgbh()); //经纪机构编号
        fcjyClfZjjghtEntity.setJjjgmc(cyqyjbxxByQybh.getQymc()); //经纪机构名称
        fcjyClfZjjghtEntity.setLybz("2"); //来源标志 1-交易登记业务 2-存量房业务
        fcjyClfZjjghtEntity.setTxzh("他项证号"); //他项证号
        fcjyClfZjjghtEntity.setTxqlr("他项权力人"); //他项权力人
        fcjyClfZjjghtEntity.setBz("无备注"); //备注
        //资金监管合同数据-over

        //资金监管合同主体-乙方-买方-begin
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtBuy = new FcjyClfZjjghtZtEntity();
        fcjyClfZjjghtZtBuy.setZtid(UuidUtil.getUuid()); //主体id
        fcjyClfZjjghtZtBuy.setZtbh(fcjyClfMmhtZtEntityBuy.getZtbh()); //主体编号
        fcjyClfZjjghtZtBuy.setHtid(clfMmhtByHtbh.getHtid()); //合同id
        fcjyClfZjjghtZtBuy.setJgid(zjjgxyDto.getXybh()); //监管id
        fcjyClfZjjghtZtBuy.setZtlb(fcjyClfMmhtZtEntityBuy.getZtlb()); //主体类别 0-买受人 1-出卖人
        fcjyClfZjjghtZtBuy.setZtxm(fcjyClfMmhtZtEntityBuy.getZtxm()); //主体姓名
        fcjyClfZjjghtZtBuy.setXb(fcjyClfMmhtZtEntityBuy.getXb()); //主体性别
        fcjyClfZjjghtZtBuy.setCsrq(fcjyClfMmhtZtEntityBuy.getCsrq()); //出生日期
        fcjyClfZjjghtZtBuy.setZjlb(fcjyClfMmhtZtEntityBuy.getZjlb()); //证件类别
        fcjyClfZjjghtZtBuy.setZjhm(fcjyClfMmhtZtEntityBuy.getZjhm()); //证件号码
        fcjyClfZjjghtZtBuy.setFzjg(fcjyClfMmhtZtEntityBuy.getFzjg()); //发证机关
        fcjyClfZjjghtZtBuy.setDz(fcjyClfMmhtZtEntityBuy.getDz()); //地址
        fcjyClfZjjghtZtBuy.setLxdh(fcjyClfMmhtZtEntityBuy.getLxdh()); //联系电话
        fcjyClfZjjghtZtBuy.setYb(fcjyClfMmhtZtEntityBuy.getYb()); //邮编
        fcjyClfZjjghtZtBuy.setDzyj(fcjyClfMmhtZtEntityBuy.getDzyj()); //电子邮件
        fcjyClfZjjghtZtBuy.setGjdq(fcjyClfMmhtZtEntityBuy.getGjdq()); //国家地区
        fcjyClfZjjghtZtBuy.setHjszs1(fcjyClfMmhtZtEntityBuy.getHjszs1()); //户籍所在省
        fcjyClfZjjghtZtBuy.setHjszs2(fcjyClfMmhtZtEntityBuy.getHjszs2()); //户籍所在市
        fcjyClfZjjghtZtBuy.setJzszs1(fcjyClfMmhtZtEntityBuy.getJzszs1()); //居住所在省
        fcjyClfZjjghtZtBuy.setJzszs2(fcjyClfMmhtZtEntityBuy.getJzszs2()); //居住所在市
        fcjyClfZjjghtZtBuy.setYh(fcjyClfMmhtZtEntityBuy.getYh()); //银行 买受人的退款银行
        fcjyClfZjjghtZtBuy.setHm(fcjyClfMmhtZtEntityBuy.getHm()); //户名
        fcjyClfZjjghtZtBuy.setZh(fcjyClfMmhtZtEntityBuy.getZh()); //账户
        fcjyClfZjjghtZtBuy.setDlrxm(fcjyClfMmhtZtEntityBuy.getDlrxm()); //代理人姓名
        fcjyClfZjjghtZtBuy.setDlrzjlb(fcjyClfMmhtZtEntityBuy.getDlrzjlb()); //代理人证件类别
        fcjyClfZjjghtZtBuy.setDlrzjhm(fcjyClfMmhtZtEntityBuy.getDlrzjhm()); //代理人证件号码
        fcjyClfZjjghtZtBuy.setDlrdz(fcjyClfMmhtZtEntityBuy.getDlrdz()); //代理人地址
        fcjyClfZjjghtZtBuy.setDlrlxdh(fcjyClfMmhtZtEntityBuy.getDlrlxdh()); //代理人联系电话
        fcjyClfZjjghtZtBuy.setBz(fcjyClfMmhtZtEntityBuy.getBz()); //备注
        //资金监管合同主体-买方-over

        //资金监管合同主体-甲方-卖方-begin
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtSale = new FcjyClfZjjghtZtEntity();
        fcjyClfZjjghtZtSale.setZtid(UuidUtil.getUuid()); //主体id
        fcjyClfZjjghtZtSale.setZtbh(fcjyClfMmhtZtEntitySale.getZtbh()); //主体编号
        fcjyClfZjjghtZtSale.setHtid(clfMmhtByHtbh.getHtid()); //合同id
        fcjyClfZjjghtZtSale.setJgid(zjjgxyDto.getXybh()); //监管id
        fcjyClfZjjghtZtSale.setZtlb(fcjyClfMmhtZtEntitySale.getZtlb()); //主体类别 0-买受人 1-出卖人
        fcjyClfZjjghtZtSale.setZtxm(fcjyClfMmhtZtEntitySale.getZtxm()); //主体姓名
        fcjyClfZjjghtZtSale.setXb(fcjyClfMmhtZtEntitySale.getXb()); //主体性别
        fcjyClfZjjghtZtSale.setCsrq(fcjyClfMmhtZtEntitySale.getCsrq()); //出生日期
        fcjyClfZjjghtZtSale.setZjlb(fcjyClfMmhtZtEntitySale.getZjlb()); //证件类别
        fcjyClfZjjghtZtSale.setZjhm(fcjyClfMmhtZtEntitySale.getZjhm()); //证件号码
        fcjyClfZjjghtZtSale.setFzjg(fcjyClfMmhtZtEntitySale.getFzjg()); //发证机关
        fcjyClfZjjghtZtSale.setDz(fcjyClfMmhtZtEntitySale.getDz()); //地址
        fcjyClfZjjghtZtSale.setLxdh(fcjyClfMmhtZtEntitySale.getLxdh()); //联系电话
        fcjyClfZjjghtZtSale.setYb(fcjyClfMmhtZtEntitySale.getYb()); //邮编
        fcjyClfZjjghtZtSale.setDzyj(fcjyClfMmhtZtEntitySale.getDzyj()); //电子邮件
        fcjyClfZjjghtZtSale.setGjdq(fcjyClfMmhtZtEntitySale.getGjdq()); //国家地区
        fcjyClfZjjghtZtSale.setHjszs1(fcjyClfMmhtZtEntitySale.getHjszs1()); //户籍所在省
        fcjyClfZjjghtZtSale.setHjszs2(fcjyClfMmhtZtEntityBuy.getHjszs2()); //户籍所在市
        fcjyClfZjjghtZtSale.setJzszs1(fcjyClfMmhtZtEntitySale.getJzszs1()); //居住所在省
        fcjyClfZjjghtZtSale.setJzszs2(fcjyClfMmhtZtEntitySale.getJzszs2()); //居住所在市
        fcjyClfZjjghtZtSale.setYh(fcjyClfMmhtZtEntitySale.getYh()); //银行 卖受人的收款银行
        fcjyClfZjjghtZtSale.setHm(fcjyClfMmhtZtEntitySale.getHm()); //户名
        fcjyClfZjjghtZtSale.setZh(fcjyClfMmhtZtEntitySale.getZh()); //账户
        fcjyClfZjjghtZtSale.setDlrxm(fcjyClfMmhtZtEntitySale.getDlrxm()); //代理人姓名
        fcjyClfZjjghtZtSale.setDlrzjlb(fcjyClfMmhtZtEntitySale.getDlrzjlb()); //代理人证件类别
        fcjyClfZjjghtZtSale.setDlrzjhm(fcjyClfMmhtZtEntitySale.getDlrzjhm()); //代理人证件号码
        fcjyClfZjjghtZtSale.setDlrdz(fcjyClfMmhtZtEntitySale.getDlrdz()); //代理人地址
        fcjyClfZjjghtZtSale.setDlrlxdh(fcjyClfMmhtZtEntitySale.getDlrlxdh()); //代理人联系电话
        fcjyClfZjjghtZtSale.setBz(fcjyClfMmhtZtEntitySale.getBz()); //备注
        //资金监管合同主体-卖方-over

        //资金监管账户-买方-begin
        FcjyClfZjjgzhEntity fcjyClfZjjgzhBuy = new FcjyClfZjjgzhEntity();
        fcjyClfZjjgzhBuy.setZhid(UuidUtil.getUuid()); //账户id
        //账号编号，一个编号，对应买和卖双方的账户
        Integer zjjgzhZhbh = UuidUtil.getUuidNum();
        fcjyClfZjjgzhBuy.setZhbh((long)zjjgzhZhbh); //账号编号
        fcjyClfZjjgzhBuy.setJgid(zjjgxyDto.getXybh()); //监管id
        fcjyClfZjjgzhBuy.setMmsfbz(fcjyClfMmhtZtEntityBuy.getZtlb()); //买卖双方标志 0-买受人 1-出卖人
        fcjyClfZjjgzhBuy.setZhlb("1"); //账户类别 1-监管子账户
        fcjyClfZjjgzhBuy.setSfdg(ShiFouEnum.SHI.getCode()); //是否对公 1-是 0-否
        fcjyClfZjjgzhBuy.setZhsyr(fcjyClfMmhtZtEntityBuy.getHm()); //账户所有人-监管合同主体
        fcjyClfZjjgzhBuy.setZhh(fcjyClfMmhtZtEntityBuy.getZh()); //账户号-监管合同主体
        fcjyClfZjjgzhBuy.setYhbh(fcjyClfMmhtZtEntityBuy.getYh()); //银行编号-监管合同主体
        fcjyClfZjjgzhBuy.setYhmc(fcjyClfMmhtZtEntitySale.getYh()); //银行名称-监管合同主体
        fcjyClfZjjgzhBuy.setKhyh(zjjgxyDto.getJgkhh()); //开户银行 页面获取监管开户行
        fcjyClfZjjgzhBuy.setKhhbh(zjjgxyDto.getJszh()); //开户行编号 页面获取监管开户行结算账户
        //银行交换号 随机生成
        Integer yhjhh = UuidUtil.getUuidNum();
        fcjyClfZjjgzhBuy.setYhjhh(yhjhh + ""); //银行交换号
        fcjyClfZjjgzhBuy.setCsje(0); //初始金额
        fcjyClfZjjgzhBuy.setHcjelj(0); //划出金额累计
        fcjyClfZjjgzhBuy.setHjjelj(0); //划进金额累计
        fcjyClfZjjgzhBuy.setDqje(0); //当前余额
        fcjyClfZjjgzhBuy.setYhdqye(0); //银行当前余额
        fcjyClfZjjgzhBuy.setHbzl("1"); //货币种类 1-人民币
        fcjyClfZjjgzhBuy.setJzbz(ShiFouEnum.FOU.getCode()); //鉴证标志 0-未鉴证-否
        fcjyClfZjjgzhBuy.setJzsj(new java.sql.Date(now.getTime())); //鉴证时间
        //鉴证人编号
        Integer jzrbh = UuidUtil.getUuidNum();
        fcjyClfZjjgzhBuy.setJzrbh(jzrbh + ""); //鉴证人编号
        fcjyClfZjjgzhBuy.setZt("1"); //资金监管账号状态 1-正常 0-作废
        fcjyClfZjjgzhBuy.setBz("无备注"); //备注
        //资金监管账户-买方-over

        //资金监管账户-卖方-begin
        FcjyClfZjjgzhEntity fcjyClfZjjgzhSale = new FcjyClfZjjgzhEntity();
        fcjyClfZjjgzhSale.setZhid(UuidUtil.getUuid()); //账户id
        fcjyClfZjjgzhSale.setZhbh((long)zjjgzhZhbh); //账号编号
        fcjyClfZjjgzhSale.setJgid(zjjgxyDto.getXybh()); //监管id
        fcjyClfZjjgzhSale.setMmsfbz(fcjyClfMmhtZtEntitySale.getZtlb()); //买卖双方标志 0-买受人 1-出卖人
        fcjyClfZjjgzhSale.setZhlb("1"); //账户类别 1-监管子账户
        fcjyClfZjjgzhSale.setSfdg(ShiFouEnum.SHI.getCode()); //是否对公 1-是 0-否
        fcjyClfZjjgzhSale.setZhsyr(fcjyClfMmhtZtEntitySale.getHm()); //账户所有人
        fcjyClfZjjgzhSale.setZhh(fcjyClfMmhtZtEntitySale.getZh()); //账户号
        fcjyClfZjjgzhSale.setYhbh(fcjyClfMmhtZtEntitySale.getYh()); //银行编号
        fcjyClfZjjgzhSale.setYhmc(fcjyClfMmhtZtEntitySale.getYh()); //银行名称
        fcjyClfZjjgzhSale.setKhyh(zjjgxyDto.getJgkhh()); //开户银行 页面获取监管开户行
        fcjyClfZjjgzhSale.setKhhbh(zjjgxyDto.getJszh()); //开户行编号 页面获取监管开户行结算账户
        fcjyClfZjjgzhSale.setYhjhh(yhjhh + ""); //银行交换号
        fcjyClfZjjgzhSale.setCsje(0); //初始金额
        fcjyClfZjjgzhSale.setHcjelj(0); //划出金额累计
        fcjyClfZjjgzhSale.setHjjelj(0); //划进金额累计
        fcjyClfZjjgzhSale.setDqje(0); //当前余额
        fcjyClfZjjgzhSale.setYhdqye(0); //银行当前余额
        fcjyClfZjjgzhSale.setHbzl("1"); //货币种类 1-人民币
        fcjyClfZjjgzhSale.setJzbz(ShiFouEnum.FOU.getCode()); //鉴证标志 0-未鉴证-否
        fcjyClfZjjgzhSale.setJzsj(new java.sql.Date(now.getTime())); //鉴证时间
        fcjyClfZjjgzhSale.setJzrbh(jzrbh + ""); //鉴证人编号
        fcjyClfZjjgzhSale.setZt("1"); //资金监管账号状态 1-正常 0-作废
        fcjyClfZjjgzhSale.setBz("无备注"); //备注
        //资金监管账户-卖方-over

        //资金监管入账记录-begin
        FcjyClfZjjgrzjlEntity fcjyClfZjjgrzjlEntity = new FcjyClfZjjgrzjlEntity();
        fcjyClfZjjgrzjlEntity.setRzjlid(UuidUtil.getUuid()); //入账记录id
        //入账记录编号
        Integer zjjgrzjlbh = UuidUtil.getUuidNum();
        fcjyClfZjjgrzjlEntity.setRzjlbh((long)zjjgrzjlbh); //入账记录编号
        fcjyClfZjjgrzjlEntity.setJgid(zjjgxyDto.getXybh()); //监管ID
        //划款指令编号 资金监管入账和出账一致
        Integer hkzlbh = UuidUtil.getUuidNum();
        fcjyClfZjjgrzjlEntity.setHkzlbh((long)hkzlbh); //划款指令编号
        fcjyClfZjjgrzjlEntity.setZhh(fcjyClfMmhtZtEntityBuy.getZh()); //账户号 买方付款账户
        //转款金额 页面监管资金额
        fcjyClfZjjgrzjlEntity.setJe(0); //金额-初始金额为0
        fcjyClfZjjgrzjlEntity.setHbzl("1"); //货币种类 1-人民币
        fcjyClfZjjgrzjlEntity.setFkrxm(fcjyClfMmhtZtEntityBuy.getHm()); //付款人姓名-监管合同主体
        fcjyClfZjjgrzjlEntity.setFkrzh(fcjyClfMmhtZtEntityBuy.getZh()); //付款人账号-监管合同主体
        //监管开户行的结算账户
        fcjyClfZjjgrzjlEntity.setJgyhbh(zjjgxyDto.getJszh()); //监管银行编号
        fcjyClfZjjgrzjlEntity.setDgfkyhbh(zjjgxyDto.getJszh()); //对公付款银行编号
        fcjyClfZjjgrzjlEntity.setDgfzyhbh(zjjgxyDto.getJszh()); //对公分支银行编号
        fcjyClfZjjgrzjlEntity.setDgtkhm(fcjyClfMmhtZtEntityBuy.getHm()); //对公退款户名-监管合同主体
        fcjyClfZjjgrzjlEntity.setDgtkzh(fcjyClfMmhtZtEntityBuy.getZh()); //对公退款账号-监管合同主体
        fcjyClfZjjgrzjlEntity.setDgfkyhmc(zjjgxyDto.getJgkhh()); //对公付款银行名称-页面监管开户行
        fcjyClfZjjgrzjlEntity.setDgfkyhjhh(yhjhh+""); //对公付款银行交换号
        fcjyClfZjjgrzjlEntity.setDgyhzh(zjjgxyDto.getJszh()); //对公银行账户
        fcjyClfZjjgrzjlEntity.setSjczsj(new java.sql.Date(now.getTime())); //实际操作时间
        fcjyClfZjjgrzjlEntity.setYhlsh(""); //银行流水号
        fcjyClfZjjgrzjlEntity.setSfdg(ShiFouEnum.SHI.getCode()); //是否对公 1-是 0-否
        fcjyClfZjjgrzjlEntity.setSflx(ShiFouEnum.FOU.getCode()); //是否利息 1-是 0-否
        fcjyClfZjjgrzjlEntity.setSftk(ShiFouEnum.FOU.getCode()); //是否退款 1-是 0-否
        fcjyClfZjjgrzjlEntity.setFhqk(ShiFouEnum.FOU.getCode()); //复核情况 0-未复核 1-已复核
        fcjyClfZjjgrzjlEntity.setFhbz("无入账复核备注"); //复核备注
        fcjyClfZjjgrzjlEntity.setFhr("入账复核人"); //复核人
        fcjyClfZjjgrzjlEntity.setFhrxm("入账复核人姓名"); //复核人姓名
        fcjyClfZjjgrzjlEntity.setFhsj(new java.sql.Date(now.getTime())); //复核时间
        fcjyClfZjjgrzjlEntity.setShrxm("入账审核人姓名"); //审核人姓名
        fcjyClfZjjgrzjlEntity.setShsj(new java.sql.Date(now.getTime())); //审核时间
        fcjyClfZjjgrzjlEntity.setShqk("无入账审核情况"); //审核情况
        fcjyClfZjjgrzjlEntity.setCzrxm(SecurityContextHolder.getContext().getAuthentication().getName()); //操作人姓名 当前登陆者
        fcjyClfZjjgrzjlEntity.setSfyx(YouXiaoXingEnum.YOUXIAO.getCode()); //是否有效 1-是 0-否
        fcjyClfZjjgrzjlEntity.setBz("无入账备注"); //备注
        //资金监管入账记录-over

        //资金监管出账记录-begin
        FcjyClfZjjgczjlEntity fcjyClfZjjgczjlEntity = new FcjyClfZjjgczjlEntity();
        fcjyClfZjjgczjlEntity.setCzjlid(UuidUtil.getUuid()); //出账记录id
        fcjyClfZjjgczjlEntity.setCzjlbh((long)UuidUtil.getUuidNum()); //出账记录编号
        fcjyClfZjjgczjlEntity.setJgid(zjjgxyDto.getXybh()); //监管ID
        fcjyClfZjjgczjlEntity.setZhbh(fcjyClfMmhtZtEntitySale.getZh()); //账户编号-卖方的账号编号
        fcjyClfZjjgczjlEntity.setHkzlbh(hkzlbh + ""); //划款指令编号
        fcjyClfZjjgczjlEntity.setJe(0); //金额-初始金额为0
        fcjyClfZjjgczjlEntity.setBz1("1"); //币种 1-人民币
        fcjyClfZjjgczjlEntity.setSkfxm(fcjyClfMmhtZtEntitySale.getHm()); //收款方姓名-监管合同主体
        fcjyClfZjjgczjlEntity.setSkfzh(fcjyClfMmhtZtEntitySale.getZh()); //收款方账户-监管合同主体
        fcjyClfZjjgczjlEntity.setSkfyhmc(fcjyClfMmhtZtEntitySale.getYh()); //收款方银行名称-监管合同主体
        fcjyClfZjjgczjlEntity.setSkfyhjhh(yhjhh + ""); //收款方银行交换号
        fcjyClfZjjgczjlEntity.setHkrq(new java.sql.Date(now.getTime())); //划款日期
        fcjyClfZjjgczjlEntity.setSjczsj(new java.sql.Date(now.getTime())); //实际操作时间
        fcjyClfZjjgczjlEntity.setZlzt(ShiFouEnum.FOU.getCode()); //指令状态 0-未出账 1-已出账
        fcjyClfZjjgczjlEntity.setHktj(ShiFouEnum.FOU.getCode()); //划款途径 0-转账 1-汇款
        fcjyClfZjjgczjlEntity.setFhqk(ShiFouEnum.FOU.getCode()); //复核情况 0-未复核 1-已复核
        fcjyClfZjjgczjlEntity.setFhbz("无出账复核备注"); //复核备注
        fcjyClfZjjgczjlEntity.setFhr("出账复核人"); //复核人
        fcjyClfZjjgczjlEntity.setFhrxm("出账复核人姓名"); //复核人姓名
        fcjyClfZjjgczjlEntity.setFhsj(new java.sql.Date(now.getTime())); //复核时间
        fcjyClfZjjgczjlEntity.setShqk("无出账审核情况"); //审核情况
        fcjyClfZjjgczjlEntity.setShr("出账审核人"); //审核人
        fcjyClfZjjgczjlEntity.setShrxm("出账审核人姓名"); //审核人姓名
        fcjyClfZjjgczjlEntity.setShsj(new java.sql.Date(now.getTime())); //审核时间
        fcjyClfZjjgczjlEntity.setJsgsbh(zjjgxyDto.getJgkhh()); //结算公司编号-页面监管开户行
        fcjyClfZjjgczjlEntity.setJgyhbh(zjjgxyDto.getJszh()); //监管银行编号
        fcjyClfZjjgczjlEntity.setZjsxbh(""); //资金属性编号-支取的银行流水号
        fcjyClfZjjgczjlEntity.setCzrxm(SecurityContextHolder.getContext().getAuthentication().getName()); //操作人姓名
        fcjyClfZjjgczjlEntity.setSfyx(YouXiaoXingEnum.YOUXIAO.getCode()); //是否有效 1-是 0-否
        fcjyClfZjjgczjlEntity.setBz2("无出账备注"); //备注
        //资金监管出账记录-over

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //资金监管协议办理进度-begin
        FcjyClfZjjgxyBljdEntity fcjyClfZjjgxyBljdEntity = new FcjyClfZjjgxyBljdEntity();
        fcjyClfZjjgxyBljdEntity.setXybhjd(zjjgxyDto.getXybh()); //监管id
        fcjyClfZjjgxyBljdEntity.setXyqdrjd(cyryjbxxByRyid.getXm()); //协议签定人
        fcjyClfZjjgxyBljdEntity.setXyqdrqjd(sdf.format(now) + ""); //协议签订日期
        //资金监管协议办理进度-over

        //保存资金监管协议
        fcjyClfZjjgxyService.insertZjjgxy(fcjyClfZjjgxyEntity);
        //保存资金监管合同
        fcjyClfZjjghtService.insertZjjght(fcjyClfZjjghtEntity);
        //保存资金监管合同主体-买方
        fcjyClfZjjghtZtService.insertZjjghtZt(fcjyClfZjjghtZtBuy);
        //保存资金监管合同主体-卖方
        fcjyClfZjjghtZtService.insertZjjghtZt(fcjyClfZjjghtZtSale);
        //保存资金监管账号-买方
        fcjyClfZjjgzhService.insertZjjgzh(fcjyClfZjjgzhBuy);
        //保存资金监管账号-卖方
        fcjyClfZjjgzhService.insertZjjgzh(fcjyClfZjjgzhSale);
        //保存资金监管入账记录
        fcjyClfZjjgrzjlService.insertZjjgrzjl(fcjyClfZjjgrzjlEntity);
        //保存资金监管出账记录
        fcjyClfZjjgczjlService.insertZjjgczjl(fcjyClfZjjgczjlEntity);
        //保存资金监管协议办理进度
        fcjyClfZjjgxyBljdService.insertZjjgxyBljd(fcjyClfZjjgxyBljdEntity);

    }

    /**
     * 获取交款明细头部数据
     * @param xybh
     * @return
     */
    @Override
    public Map<String, String> getzkmxHead(String xybh) {
        Map<String, String> map = new HashMap<>();

        //资金监管协议记录
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(xybh);

        //根据监管id资金监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid(xybh);
        if (null == zjjgrzjlByJgid){
            return map;
        }

        //根据监管id查询监管合同主体
        List<FcjyClfZjjghtZtEntity> zjjghtZtByJgid = fcjyClfZjjghtZtService.findZjjghtZtByJgid(xybh);
        if (null == zjjghtZtByJgid){
            return map;
        }
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntityBuy = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntitySale = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity : zjjghtZtByJgid){
            //存量房买卖合同主体-买受人
            if (ZhuTiLeiBieEnum.BUY.getCode().equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntityBuy = fcjyClfZjjghtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if (ZhuTiLeiBieEnum.SALE.getCode().equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntitySale = fcjyClfZjjghtZtEntity;
            }
        }

        //监管开户行
        String dgfkyhmc = zjjgrzjlByJgid.getDgfkyhmc();
        map.put("jgkhh", dgfkyhmc);

        //结算账户
        String dgyhzh = zjjgrzjlByJgid.getDgyhzh();
        map.put("jszh", dgyhzh);

        //监管资金额-资金监管协议的监管资金额
        String je = zjjgxyByJgid.getZjgje() + "";
        map.put("jgzje", je);

        //需交款金额-资金监管协议的监管资金额
        String xjkje = zjjgxyByJgid.getZjgje() + "";
        map.put("xjkje", xjkje);

        //交款确认额-资金监管协议的监管资金额
        String jkqre = zjjgxyByJgid.getZjgje() + "";
        map.put("jkqre", jkqre);

        //交款人姓名
        String jkrxm = fcjyClfZjjghtZtEntityBuy.getZtxm();
        map.put("jkrxm", jkrxm);

        //交款人证件号码
        String jkrzjhm = fcjyClfZjjghtZtEntityBuy.getZjhm();
        map.put("jkrzjhm", jkrzjhm);

        //交款人银行名
        String yh = fcjyClfZjjghtZtEntityBuy.getYh();
        map.put("jkryh", yh);

        //交款人账户
        String zh = fcjyClfZjjghtZtEntityBuy.getZh();
        map.put("jkrzh", zh);

        return map;
    }

    /**
     * 获取交款明细记录
     * @param xybh
     * @return
     */
    @Override
    public DataVo<JkmxjlVo> findJkmxByXybh(String xybh) {
        DataVo<JkmxjlVo> jkmxjlVoDataVo = new DataVo<>();
        jkmxjlVoDataVo.setCode(0);
        jkmxjlVoDataVo.setMsg("");
        List<JkmxjlVo> list = new ArrayList<>();
        //封装JkmxjlVo
        JkmxjlVo jkmxjlVo = new JkmxjlVo();

        //根据监管id查询监管协议
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(xybh);
        //根据监管id查询监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid(xybh);

        if (null == zjjgxyByJgid || null == zjjgrzjlByJgid || null == zjjgrzjlByJgid.getYhlsh()){ //为空，无银行交易流水
            jkmxjlVoDataVo.setCount(1);
            jkmxjlVoDataVo.setData(list);
            return jkmxjlVoDataVo;
        }

        jkmxjlVo.setJkrq(zjjgrzjlByJgid.getSjczsj() + ""); //交款日期-监管入账记录的实际操作时间
        jkmxjlVo.setJkje(zjjgxyByJgid.getZjgje()+""); //交款金额
        jkmxjlVo.setPos("是"); //POS交款
        double jfje = zjjgrzjlByJgid.getJe();
        double zjgje = zjjgxyByJgid.getZjgje();
        jkmxjlVo.setLjjkje(jfje+""); //累计缴费金额
        if (jfje == zjgje){ //缴费金额和监管金额比对
            jkmxjlVo.setSfwcjk("是");
        }else {
            jkmxjlVo.setSfwcjk("否");
        }
        jkmxjlVo.setYhjyls(zjjgrzjlByJgid.getYhlsh()); //银行流水号

        list.add(jkmxjlVo);

        jkmxjlVoDataVo.setCount(1);
        jkmxjlVoDataVo.setData(list);
        return jkmxjlVoDataVo;
    }

    /**
     * 详情展示数据查询
     * @param jgid
     * @return
     */
    @Override
    public Map<String, String> zjjgxyByJgidToShow(String jgid) {

        //第一栏数据
        Map<String, String> map = new HashMap<>();

        //资金监管协议
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        //资金监管合同
        FcjyClfZjjghtEntity zjjghtByJgid = fcjyClfZjjghtService.findZjjghtByJgid(jgid);
        //资金监管合同主体
        List<FcjyClfZjjghtZtEntity> zjjghtZtByJgid = fcjyClfZjjghtZtService.findZjjghtZtByJgid(jgid);

        if (null == zjjghtByJgid || null == zjjgxyByJgid || null == zjjghtZtByJgid){
            return map;
        }

        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntityBuy = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntitySale = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity : zjjghtZtByJgid){
            //存量房买卖合同主体-买受人
            if (ZhuTiLeiBieEnum.BUY.getCode().equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntityBuy = fcjyClfZjjghtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if (ZhuTiLeiBieEnum.SALE.getCode().equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntitySale = fcjyClfZjjghtZtEntity;
            }
        }

        map.put("zt", zjjgxyByJgid.getZt()); //协议状态
        map.put("xybh", jgid); //协议编号--监管id
        map.put("djbh", zjjgxyByJgid.getJgbh() + ""); //登记编号--监管编号
        map.put("htzje", zjjgxyByJgid.getHtzje() + ""); //合同总金额
        map.put("zjgje", zjjgxyByJgid.getZjgje() + ""); //总监管金额
        map.put("qdxyrq", zjjgxyByJgid.getQdxyrq() + ""); //签订日期
        map.put("htbh", zjjghtByJgid.getHtbh() + ""); //合同编号
        map.put("fwzl", zjjghtByJgid.getFwzl()); //房屋坐落
        map.put("fwmj", zjjghtByJgid.getFwmj() + ""); //房屋面积
        map.put("buyxm", fcjyClfZjjghtZtEntityBuy.getZtxm()); //买方姓名
        map.put("buyzjlb", ZjlbUtil.zjlbNumToString(fcjyClfZjjghtZtEntityBuy.getZjlb())); //买方证件类别
        map.put("buyzjhm", fcjyClfZjjghtZtEntityBuy.getZjhm()); //买方证件号码
        map.put("buyyh", fcjyClfZjjghtZtEntityBuy.getYh()); //买方退款银行
        map.put("buyzh", fcjyClfZjjghtZtEntityBuy.getZh()); //买方账户
        map.put("salexm", fcjyClfZjjghtZtEntitySale.getZtxm()); //卖方姓名
        map.put("salzjlb", ZjlbUtil.zjlbNumToString(fcjyClfZjjghtZtEntitySale.getZjlb())); //卖方证件类别
        map.put("salezjhm", fcjyClfZjjghtZtEntitySale.getZjhm()); //卖方证件号码
        map.put("saleyh", fcjyClfZjjghtZtEntitySale.getYh()); //卖方收款银行
        map.put("salezh", fcjyClfZjjghtZtEntitySale.getZh()); //卖方账户

        return map;
    }

    /**
     * 撤销资金监管协议
     * @param jgid
     * @return map
     */
    @Transactional
    @Override
    public Map<String,String> updateZjjgxyByJgidToCx(String jgid) {

        Map<String,String> map = new HashMap<>();

        //查询协议是否已经撤销
        //资金监管协议
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        if (null != zjjgxyByJgid.getZt() && (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.JIAOYIJIESHU.getCode().equals(zjjgxyByJgid.getZt()))){
            //已经撤销或者完结
            map.put("sfcx", "2");
            return map;
        }

        //判断是否存在已经缴存
        //资金监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid(jgid);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //保存协议撤销人和时间
        String jktzscr = SecurityContextHolder.getContext().getAuthentication().getName(); //当前登陆者
        String scsj = sdf.format(new Date());

        if (null != zjjgrzjlByJgid && zjjgrzjlByJgid.getJe() == 0){ //无缴存资金
            map.put("sfjczj", "0"); //是否缴存资金 0-无 1-有

            //更新资金监管协议的状态zt和撤销时间
            fcjyClfZjjgxyService.updateZjjgxyByJgidToCx(jgid,new java.sql.Date((new Date()).getTime()));

            //保存协议撤销人和时间和情况
            fcjyClfZjjgxyBljdService.updateZjjgxyBljdByXycx(jgid,"1",jktzscr, scsj); //1-已生成
        }

        if (null != zjjgrzjlByJgid && zjjgrzjlByJgid.getJe() > 0){ //有缴存资金
            map.put("sfjczj", "1"); //是否缴存资金 0-无 1-有
        }

        return map;
    }

    /**
     * 支取确认
     * @param jgid
     */
    @Transactional
    @Override
    public String zqqr(String jgid) {

        //判断是否已经撤销或者完结
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        if (null != zjjgxyByJgid.getZt() && (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.JIAOYIJIESHU.getCode().equals(zjjgxyByJgid.getZt()))){
            //已经撤销或者完结
            return "4";
        }

        //先确认进行了支取凭证的生成，才能继续
        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);
        if (null == zjjgxyBljdByJgid.getSczqpzscr() || null == zjjgxyBljdByJgid.getSczqpzscrq() || null == zjjgxyBljdByJgid.getSczqpzsfsc()){
            return "2";
        }

        String zt = ZjjgxyZtEnum.CHUCIQUEREN.getCode(); //资金监管协议zt 初次确认
        fcjyClfZjjgxyService.updateZjjgxyZtByJgid(jgid,zt);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //支取确认人信息和时间
        String jktzscr = SecurityContextHolder.getContext().getAuthentication().getName(); //当前登陆者
        String scsj = sdf.format(new Date());

        //查询监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid(jgid);
        //查询监管出账记录
        FcjyClfZjjgczjlEntity zjjgczjlByJgid = fcjyClfZjjgczjlService.findZjjgczjlByJgid(jgid);

        //比对入账和出账的划款指令编号，不一致则退出
        if (!(zjjgrzjlByJgid.getHkzlbh() + "").equals(zjjgczjlByJgid.getHkzlbh())){
            return "5";
        }

        //如果金额支取完成，则不能继续再支取确认
        if (zjjgczjlByJgid.getJe() == zjjgrzjlByJgid.getJe()){
            return "3";
        }

        //将支取的资金保存
        double zjgje = zjjgxyByJgid.getZjgje(); //金额
        //银行流水号 随机生成 查询交款明细时用
        Integer yhlsh = UuidUtil.getUuidNum();
        Date date = new Date();

        //将资金从买方监管账户中取出
        FcjyClfZjjgzhEntity fcjyClfZjjgzhEntityBuy = new FcjyClfZjjgzhEntity();
        fcjyClfZjjgzhEntityBuy.setJgid(jgid); //监管id
        fcjyClfZjjgzhEntityBuy.setMmsfbz("0"); //买方
        fcjyClfZjjgzhEntityBuy.setHcjelj(zjgje); //划出金额
        fcjyClfZjjgzhEntityBuy.setDqje(0); //当前余额
        fcjyClfZjjgzhService.updateZjjghtByBuyOut(fcjyClfZjjgzhEntityBuy);

        //将资金在卖方监管账户中存入
        FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity = new FcjyClfZjjgzhEntity();
        fcjyClfZjjgzhEntity.setJgid(jgid); //监管id
        fcjyClfZjjgzhEntity.setMmsfbz("1"); //卖方
        fcjyClfZjjgzhEntity.setHcjelj(zjgje); //划出金额累计
        fcjyClfZjjgzhEntity.setDqje(zjgje); //当前金额
        fcjyClfZjjgzhService.updateZjjghtBySaleIn(fcjyClfZjjgzhEntity);

        //保存支取确认人和时间和情况
        fcjyClfZjjgxyBljdService.updateZjjgxyBljdByZqqr(jgid,"1",jktzscr, scsj); //1-已生成

        //将支取的资金和银行流水号和操作时间保存到资金监管出账表中
        fcjyClfZjjgrzjlService.updateZjjgrzjlByjgidToZqqr(jgid,zjgje,yhlsh,new java.sql.Date(date.getTime()));

        return "1";
    }

    /**
     * 协议账户信息修改-修改的是监管合同主体的数据
     * @param zjjgxyZhxxDto
     * @return
     */
    @Transactional
    @Override
    public String updateZjjgxyZhxx(ZjjgxyZhxxDto zjjgxyZhxxDto) {
        //监管id
        String jgid = zjjgxyZhxxDto.getXybh();

        //判断协议状态，撤销或完结状态则取消操作
        //资金监管协议
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        if (null != zjjgxyByJgid.getZt() && (zjjgxyByJgid.getZt().equals(ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode()) ||
                zjjgxyByJgid.getZt().equals(ZjjgxyZtEnum.XITONGCHEXIAO.getCode()) ||
                zjjgxyByJgid.getZt().equals(ZjjgxyZtEnum.JIAOYIJIESHU.getCode()))){
            return "3";
        }

        //判断是否存在交款确认，存在则不允许修改账户信息
        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);
        if (null != zjjgxyBljdByJgid.getJkqrsfqr() && zjjgxyBljdByJgid.getJkqrsfqr().equals("1")){ //存在交款确认行为，禁止修改
            return "2";
        }

        //账户信息设置
        String buyZtlb = ZhuTiLeiBieEnum.BUY.getCode(); //买方状态类别
        String buyyh = zjjgxyZhxxDto.getBuyyh();//买方银行
        String buyzh = zjjgxyZhxxDto.getBuyzh();//买方账户

        String saleZtlb = ZhuTiLeiBieEnum.SALE.getCode(); //卖方状态类别
        String saleyh = zjjgxyZhxxDto.getSaleyh();//卖方银行
        String salezh = zjjgxyZhxxDto.getSalezh();//卖方账户

        //更新资金监管合同主体信息
        fcjyClfZjjghtZtService.updateZjjghtZtByJgid(jgid, buyZtlb, buyyh, buyzh);
        fcjyClfZjjghtZtService.updateZjjghtZtByJgid(jgid, saleZtlb, saleyh, salezh);

        return "1";
    }

    /**
     * 查询办理进度
     * @param jgid
     * @return
     */
    @Override
    public Map<String, String> findBljdByJgid(String jgid) {
        //封装数据
        Map<String, String> map = new HashMap<>();

        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);

        map.put("xybhjd", jgid); //协议编号
        map.put("xyqdrjd", zjjgxyBljdByJgid.getXyqdrjd()); //协议签订人--资金监管协议的监管服务人员编号
        map.put("xyqdrqjd", zjjgxyBljdByJgid.getXyqdrqjd()); //协议签订日期--资金监管协议的签订协议日期

        map.put("jktzsfsc", zjjgxyBljdByJgid.getJktzsfsc()); //交款通知是否生成
        map.put("jktzscr", zjjgxyBljdByJgid.getJktzscr()); //交款通知生成人
        map.put("jktzscrq", zjjgxyBljdByJgid.getJktzscrq()); //交款通知生成日期

        map.put("jkqrsfqr", zjjgxyBljdByJgid.getJkqrsfqr()); //交款确认是否确认
        map.put("jkqrqrr", zjjgxyBljdByJgid.getJkqrqrr()); //交款确认确认人
        map.put("jkqrqrrq", zjjgxyBljdByJgid.getJkqrqrrq()); //交款确认确认日期

        map.put("xycxsfcx", zjjgxyBljdByJgid.getXycxsfcx()); //协议撤销是否撤销
        map.put("xycxcxr", zjjgxyBljdByJgid.getXycxcxr()); //协议撤销撤销人
        map.put("xycxcxrq", zjjgxyBljdByJgid.getXycxcxrq()); //协议撤销撤销日期

        map.put("sczqpzsfsc", zjjgxyBljdByJgid.getSczqpzsfsc()); //生成支取凭证是否生成
        map.put("sczqpzscr", zjjgxyBljdByJgid.getSczqpzscr()); //生成支取凭证生成人
        map.put("sczqpzscrq", zjjgxyBljdByJgid.getSczqpzscrq()); //生成支取凭证生成日期

        map.put("zqqrsfqr", zjjgxyBljdByJgid.getZqqrsfqr()); //支取确认是否确认
        map.put("zqqrqrr", zjjgxyBljdByJgid.getZqqrqrr()); //支取确认确认人
        map.put("zqqrqrrq",  zjjgxyBljdByJgid.getZqqrqrrq()); //支取确认确认日期

        map.put("bjqrsfbj", zjjgxyBljdByJgid.getBjqrsfbj()); //办结确认是否办结
        map.put("bjqrbjr", zjjgxyBljdByJgid.getBjqrbjr()); //办结确认办结人
        map.put("bjqrbjrq",  zjjgxyBljdByJgid.getBjqrbjrq()); //办结确认办结日期

        return map;
    }

    /**
     * 交款通知
     * @param jgid
     */
    @Transactional
    @Override
    public String jktz(String jgid) {

        //判断是否已经撤销或者完结
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        if (null != zjjgxyByJgid.getZt() && (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.JIAOYIJIESHU.getCode().equals(zjjgxyByJgid.getZt()))){
            //已经撤销或者完结
            return "4";
        }

        //判断是否存在交款确认，存在则禁止再次交款通知
        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);
        if (null != zjjgxyBljdByJgid.getJkqrsfqr() && zjjgxyBljdByJgid.getJkqrsfqr().equals("1")){
            //存在交款确认，禁止交款通知
            return "2";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //保存交款通知生成人和时间
        String jktzscr = SecurityContextHolder.getContext().getAuthentication().getName(); //当前登陆者
        String scsj = sdf.format(new Date());

        //保存交款通知人和时间和情况
        fcjyClfZjjgxyBljdService.updateZjjgxyBljdByJktz(jgid,"1",jktzscr, scsj); //1-已生成

        return "1";
    }

    /**
     * 交款确认
     * @param jgid
     */
    @Transactional
    @Override
    public String jkqr(String jgid) {

        //判断是否已经撤销或者完结
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        if (null != zjjgxyByJgid.getZt() && (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.JIAOYIJIESHU.getCode().equals(zjjgxyByJgid.getZt()))){
            //已经撤销或者完结
            return "4";
        }

        //先确认进行了交款通知，才能继续
        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);
        if (null == zjjgxyBljdByJgid.getJktzscr() || null == zjjgxyBljdByJgid.getJktzscrq() || null == zjjgxyBljdByJgid.getJktzsfsc()){
            return "2";
        }

        //查询监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid(jgid);

        //如果金额缴纳完成，则不能继续交款确认
        if (zjjgxyByJgid.getZjgje() == zjjgrzjlByJgid.getJe()){
            return "3";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //保存交款确认生成人和时间
        String jktzscr = SecurityContextHolder.getContext().getAuthentication().getName(); //当前登陆者
        String scsj = sdf.format(new Date());

        double zjgje = zjjgxyByJgid.getZjgje(); //金额
        //银行流水号 随机生成 查询交款明细时用
        Integer yhlsh = UuidUtil.getUuidNum();
        Date date = new Date();

        //保存交款确认人和时间和情况
        fcjyClfZjjgxyBljdService.updateZjjgxyBljdByJkqr(jgid,"1",jktzscr, scsj); //1-已生成

        //将资金保存在买方监管账户中
        FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity = new FcjyClfZjjgzhEntity();
        fcjyClfZjjgzhEntity.setJgid(jgid); //监管id
        fcjyClfZjjgzhEntity.setMmsfbz("0"); //买方
        fcjyClfZjjgzhEntity.setHjjelj(zjgje); //划进金额累计
        fcjyClfZjjgzhEntity.setDqje(zjgje); //当前余额
        fcjyClfZjjgzhService.updateZjjghtByBuy(fcjyClfZjjgzhEntity); //保存数据

        //将缴纳的监管资金保存和银行流水号和实际操作时间到资金监管入账记录表中
        fcjyClfZjjgrzjlService.updateZjjgrzjlByjgidToJkqr(jgid,zjgje,yhlsh + "",new java.sql.Date(date.getTime()));

        return "1";
    }

    /**
     * 生成支取凭证
     * @param jgid
     */
    @Transactional
    @Override
    public String zqpz(String jgid) {

        //判断是否已经撤销或者完结
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        if (null != zjjgxyByJgid.getZt() && (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxyByJgid.getZt()) ||
                ZjjgxyZtEnum.JIAOYIJIESHU.getCode().equals(zjjgxyByJgid.getZt()))){
            //已经撤销或者完结
            return "3";
        }

        //先确认进行了交款确认，才能继续
        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);
        if (null == zjjgxyBljdByJgid.getJkqrqrr() || null == zjjgxyBljdByJgid.getJkqrqrrq() || null == zjjgxyBljdByJgid.getJkqrsfqr()){
            return "2";
        }

        //是否存在支取确认，存在则禁止支取凭证操作
        if (null != zjjgxyBljdByJgid.getZqqrsfqr() && zjjgxyBljdByJgid.getZqqrsfqr().equals("1")){
            //存在支取确认
            return "4";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //保存生成支取凭证生成人和时间
        String jktzscr = SecurityContextHolder.getContext().getAuthentication().getName(); //当前登陆者
        String scsj = sdf.format(new Date());

        //保存生成支取凭证人和时间和情况
        fcjyClfZjjgxyBljdService.updateZjjgxyBljdByZqpz(jgid,"1",jktzscr, scsj); //1-已生成

        return "1";
    }

    /**
     * 支取明细头部数据
     * @param jgid
     * @return
     */
    @Override
    public Map<String, String> getzqmxHead(String jgid) {
        Map<String, String> map = new HashMap<>();

        //资金监管协议记录
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);

        //根据监管id资金监管出账记录
        FcjyClfZjjgczjlEntity zjjgczjlByJgid = fcjyClfZjjgczjlService.findZjjgczjlByJgid(jgid);
        if (null == zjjgczjlByJgid){
            return map;
        }

        //根据监管id查询监管合同主体
        List<FcjyClfZjjghtZtEntity> zjjghtZtByJgid = fcjyClfZjjghtZtService.findZjjghtZtByJgid(jgid);
        if (null == zjjghtZtByJgid){
            return map;
        }
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntityBuy = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntitySale = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity : zjjghtZtByJgid){
            //存量房买卖合同主体-买受人
            if (ZhuTiLeiBieEnum.BUY.getCode().equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntityBuy = fcjyClfZjjghtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if (ZhuTiLeiBieEnum.SALE.getCode().equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntitySale = fcjyClfZjjghtZtEntity;
            }
        }

        //监管开户行
        String dgfkyhmc = zjjgczjlByJgid.getJsgsbh();
        map.put("jgkhh", dgfkyhmc);

        //结算账户
        String dgyhzh = zjjgczjlByJgid.getJgyhbh();
        map.put("jszh", dgyhzh);

        //监管资金额-资金监管协议的监管资金额
        String je = zjjgxyByJgid.getZjgje() + "";
        map.put("jgzje", je);

        //需交款金额-资金监管协议的监管资金额
        String xjkje = zjjgxyByJgid.getZjgje() + "";
        map.put("xjkje", xjkje);

        //支取确认额-资金监管协议的监管资金额
        String jkqre = zjjgxyByJgid.getZjgje() + "";
        map.put("jkqre", jkqre);

        //支取人姓名
        String jkrxm = fcjyClfZjjghtZtEntitySale.getZtxm();
        map.put("jkrxm", jkrxm);

        //支取人证件号码
        String jkrzjhm = fcjyClfZjjghtZtEntitySale.getZjhm();
        map.put("jkrzjhm", jkrzjhm);

        //支取人银行名
        String yh = fcjyClfZjjghtZtEntitySale.getYh();
        map.put("jkryh", yh);

        //支取人账户
        String zh = fcjyClfZjjghtZtEntitySale.getZh();
        map.put("jkrzh", zh);

        return map;
    }

    /**
     * 支取明细记录数据
     * @param jgid
     * @return
     */
    @Override
    public DataVo<JkmxjlVo> findZqmxByXybh(String jgid) {
        DataVo<JkmxjlVo> jkmxjlVoDataVo = new DataVo<>();
        jkmxjlVoDataVo.setCode(0);
        jkmxjlVoDataVo.setMsg("");
        List<JkmxjlVo> list = new ArrayList<>();
        //封装JkmxjlVo
        JkmxjlVo jkmxjlVo = new JkmxjlVo();

        //根据监管id查询监管协议
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        //根据监管id查询监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid(jgid);
        //根据监管id查询监管出账记录
        FcjyClfZjjgczjlEntity zjjgczjlByJgid = fcjyClfZjjgczjlService.findZjjgczjlByJgid(jgid);

        if (null == zjjgxyByJgid || null == zjjgrzjlByJgid || null == zjjgczjlByJgid.getZjsxbh()){ //为空，无银行交易流水
            jkmxjlVoDataVo.setCount(1);
            jkmxjlVoDataVo.setData(list);
            return jkmxjlVoDataVo;
        }

        jkmxjlVo.setJkrq(zjjgczjlByJgid.getSjczsj() + ""); //支取日期-监管出账记录的实际操作时间
        jkmxjlVo.setJkje(zjjgxyByJgid.getZjgje()+""); //支取金额
        jkmxjlVo.setPos("是"); //POS支取
        double jfje = zjjgczjlByJgid.getJe(); //出账记录的金额
        double zjgje = zjjgxyByJgid.getZjgje();
        jkmxjlVo.setLjjkje(jfje+""); //累计支取金额
        if (jfje == zjgje){ //支取金额和监管金额比对
            jkmxjlVo.setSfwcjk("是");
        }else {
            jkmxjlVo.setSfwcjk("否");
        }
        jkmxjlVo.setYhjyls(zjjgczjlByJgid.getZjsxbh()); //支取银行流水号-出账记录的资金属性编号

        list.add(jkmxjlVo);

        jkmxjlVoDataVo.setCount(1);
        jkmxjlVoDataVo.setData(list);
        return jkmxjlVoDataVo;
    }

    /**
     * 买方退款和撤销
     * @param jgid
     * @param cxmm
     */
    @Transactional
    @Override
    public Map<String, String> mftkCx(String jgid,String cxmm) {

        Map<String, String> map = new HashMap<>();

        //买方退款
        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);
        //如果存在卖方支取了，则不能进行退款
        if (null != zjjgxyBljdByJgid.getZqqrqrr() || null != zjjgxyBljdByJgid.getZqqrqrrq() || null != zjjgxyBljdByJgid.getZqqrsfqr()){
            map.put("mftkCx", "2"); //2-存在卖方支取情况，不允许退款
            return map;
        }

        //查询监管协议
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);

        if (zjjgxyByJgid != null && zjjgxyByJgid.getMsrmm().length() > 0){ //密码存在
            //进行撤销密码判断
            if (!zjjgxyByJgid.getMsrmm().equals(cxmm)){
                map.put("mftkCx", "3");
                return map;
            }
        }

        //根据监管id查询监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid(jgid);
        double je = zjjgrzjlByJgid.getJe(); //缴费金额
        double tkje = 0; //入账记录金额清空

        //退款-通过监管id，将缴费金额清空，返回给买方账户
        fcjyClfZjjgrzjlService.updateZjjgrzjlByjgidToCx(jgid,tkje); //缴费金额清空
        //更新买方监管账户，添加入账金额je
        FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity = new FcjyClfZjjgzhEntity();
        fcjyClfZjjgzhEntity.setJgid(jgid); //监管id
        fcjyClfZjjgzhEntity.setMmsfbz("1"); //买方
        fcjyClfZjjgzhEntity.setHjjelj(je); //划进金额累计
        fcjyClfZjjgzhEntity.setDqje(je); //当前金额
        fcjyClfZjjgzhService.updateZjjghtByBuy(fcjyClfZjjgzhEntity);

        //更新资金监管协议的状态zt
        fcjyClfZjjgxyService.updateZjjgxyByJgidToCx(jgid, new java.sql.Date((new Date()).getTime()));

        map.put("mftkCx", "1"); //1-成功
        return map;
    }

    /**
     * 页面数据-已完结
     * @param searchDjbh
     * @param searchXybh
     * @param searchHtbh
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataVo<ZjjgxVo> getDataTwo(String searchDjbh, String searchXybh, String searchHtbh, Integer page, Integer limit) {
        //封装DataVo<ZjjgxVo>数据
        DataVo<ZjjgxVo> zjjgxVoDataVo = new DataVo<>();
        zjjgxVoDataVo.setCode(0);
        zjjgxVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);
        //查询资金监管数据
        List<ZjjgxVo> allData = fcjyClfZjjgxyService.getZjjgxVoTwo(searchDjbh,searchXybh,searchHtbh);

        //协议状态 根据资金监管协议状态zt工具类判断
        for (ZjjgxVo zjjgxVo : allData){
            if (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxVo.getSfcx()) || ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxVo.getSfcx())){
                zjjgxVo.setSfcx("是");
            }else {
                zjjgxVo.setSfcx("否");
            }
        }

        //进行pageInfo包装
        PageInfo<ZjjgxVo> pageInfo = new PageInfo<>(allData);
        List<ZjjgxVo> list = pageInfo.getList();

        zjjgxVoDataVo.setCount((int)pageInfo.getTotal());
        zjjgxVoDataVo.setData(list);

        //返回数据
        return zjjgxVoDataVo;
    }

    /**
     * 页面数据-已撤销
     * @param searchDjbh
     * @param searchXybh
     * @param searchHtbh
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataVo<ZjjgxVo> getDataThree(String searchDjbh, String searchXybh, String searchHtbh, Integer page, Integer limit) {
        //封装DataVo<ZjjgxVo>数据
        DataVo<ZjjgxVo> zjjgxVoDataVo = new DataVo<>();
        zjjgxVoDataVo.setCode(0);
        zjjgxVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);
        //查询资金监管数据
        List<ZjjgxVo> allData = fcjyClfZjjgxyService.getZjjgxVoThree(searchDjbh,searchXybh,searchHtbh);

        //协议状态 根据资金监管协议状态zt工具类判断
        for (ZjjgxVo zjjgxVo : allData){
            if (ZjjgxyZtEnum.SHOUGONGCHEXIAO.getCode().equals(zjjgxVo.getSfcx()) || ZjjgxyZtEnum.XITONGCHEXIAO.getCode().equals(zjjgxVo.getSfcx())){
                zjjgxVo.setSfcx("是");
            }else {
                zjjgxVo.setSfcx("否");
            }
        }

        //进行pageInfo包装
        PageInfo<ZjjgxVo> pageInfo = new PageInfo<>(allData);
        List<ZjjgxVo> list = pageInfo.getList();

        zjjgxVoDataVo.setCount((int)pageInfo.getTotal());
        zjjgxVoDataVo.setData(list);

        //返回数据
        return zjjgxVoDataVo;
    }

    /**
     * 办结确认
     * @param jgid
     * @return
     */
    @Transactional
    @Override
    public String bjqr(String jgid) {
        //判断流程是否走完
        //查询资金监管办理进度
        FcjyClfZjjgxyBljdEntity zjjgxyBljdByJgid = fcjyClfZjjgxyBljdService.findZjjgxyBljdByJgid(jgid);
        String jktzsfsc = zjjgxyBljdByJgid.getJktzsfsc();//交款通知
        String jkqrsfqr = zjjgxyBljdByJgid.getJkqrsfqr();//交款确认
        String sczqpzsfsc = zjjgxyBljdByJgid.getSczqpzsfsc();//支取通知
        String zqqrsfqr = zjjgxyBljdByJgid.getZqqrsfqr();//支取确认
        //流程未走完
        if (null == jktzsfsc || jktzsfsc.length() == 0){
            return "2";
        }
        if (null == jkqrsfqr || jkqrsfqr.length() == 0){
            return "2";
        }
        if (null == sczqpzsfsc || sczqpzsfsc.length() == 0){
            return "2";
        }
        if (null == zqqrsfqr || zqqrsfqr.length() == 0){
            return "2";
        }

        String xycxsfcx = zjjgxyBljdByJgid.getXycxsfcx();//协议撤销
        if (null != xycxsfcx && xycxsfcx.equals("1")){
            //协议已撤销
            return "3";
        }

        String bjqrsfbj = zjjgxyBljdByJgid.getBjqrsfbj();//办结确认
        if (null != bjqrsfbj && bjqrsfbj.equals("1")){
            //协议已办结
            return "4";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //办结确认人信息
        String jktzscr = SecurityContextHolder.getContext().getAuthentication().getName(); //当前登陆者

        //保存办结确认状态、确认人、时间
        fcjyClfZjjgxyBljdService.updateZjjgxyBljdByBjqr(jgid,"1",jktzscr, sdf.format(new Date()));
        //修改协议状态为303-交易结束
        fcjyClfZjjgxyService.updateZjjgxyZtByJgid(jgid, "303");
        //修改协议归档时间
        fcjyClfZjjgxyService.updateZjjgxyGdsjByJgid(jgid, new java.sql.Date((new Date()).getTime()));
        return "1";
    }

}
