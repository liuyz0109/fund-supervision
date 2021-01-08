package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.entity.*;
import com.gtmap.fundsupervision.service.*;
import com.gtmap.fundsupervision.utils.UuidUtil;
import com.gtmap.fundsupervision.vo.ZjjgxVo;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/18
 * @description
 */

@SpringBootTest
class ZjjgxServiceImplTest {

    @Autowired
    private FcjyClfZjjgxyService fcjyClfZjjgxyService;

    @Autowired
    private FcjyClfMmhtService fcjyClfMmhtService;

    @Autowired
    private FcjyClfJjhtService fcjyClfJjhtService;

    @Autowired
    private FcjyCyztCyqyjbxxService fcjyCyztCyqyjbxxService;

    @Autowired
    private FcjyClfZjjghtService fcjyClfZjjghtService;

    @Autowired
    private FcjyClfZjjghtZtService fcjyClfZjjghtZtService;

    @Autowired
    private FcjyClfZjjgzhService fcjyClfZjjgzhService;

    @Autowired
    private FcjyClfZjjgrzjlService fcjyClfZjjgrzjlService;

    @Test
    void getData() {
        List<ZjjgxVo> zjjgxVo1 = fcjyClfZjjgxyService.getZjjgxVo("1","1","1");
        for(ZjjgxVo zjjgxVo : zjjgxVo1){
            if (null != zjjgxVo.getSfcx()) {
                if (zjjgxVo.getSfcx().equals("302")) {
                    zjjgxVo.setSfcx("是");
                } else {
                    zjjgxVo.setSfcx("否");
                }
            }
        }
        int i = 1;
    }

    @Test
    void saveZjjgxy() {
        ZjjgxyDto zjjgxyDto = new ZjjgxyDto();
        zjjgxyDto.setHtbh("20000");
        zjjgxyDto.setXybh("1656523315465132123");
        zjjgxyDto.setDjbh("1111");
        zjjgxyDto.setJzmj("154.555");
        zjjgxyDto.setSfje("111111.65");
        zjjgxyDto.setDkje("222222.115");
        zjjgxyDto.setJgzje("61561.15556145");

        //根据合同编号获取存量房买卖合同
        FcjyClfMmhtEntity clfMmhtByHtbh = fcjyClfMmhtService.findClfMmhtByHtbh(zjjgxyDto.getHtbh());

        //根据合同id获取存量房买卖合同房屋权属概况
        FcjyClfMmhtFwqsgkEntity fwqsgkByHtid = fcjyClfMmhtService.findFwqsgkByHtid(clfMmhtByHtbh.getHtid());

        //根据合同编号获取存量房买卖合同主体
        List<FcjyClfMmhtZtEntity> mmhtZtByHtbhList = fcjyClfMmhtService.findMmhtZtByHtbh(zjjgxyDto.getHtbh());
        FcjyClfMmhtZtEntity fcjyClfMmhtZtEntityBuy = new FcjyClfMmhtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfMmhtZtEntity fcjyClfMmhtZtEntitySale = new FcjyClfMmhtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfMmhtZtEntity fcjyClfMmhtZtEntity : mmhtZtByHtbhList){
            //存量房买卖合同主体-买受人
            if ("0".equals(fcjyClfMmhtZtEntity.getZtlb())){
                fcjyClfMmhtZtEntityBuy = fcjyClfMmhtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if ("1".equals(fcjyClfMmhtZtEntity.getZtlb())){
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
        fcjyClfZjjgxyEntity.setCxsj(new java.sql.Date(now.getTime())); //撤销时间
        fcjyClfZjjgxyEntity.setGdsj(new java.sql.Date(now.getTime())); //归档时间
        fcjyClfZjjgxyEntity.setZt("101"); //状态 101-草稿 103-变更中 201-初次确认 301-手工撤销 302-系统撤销 303-交易结束
        fcjyClfZjjgxyEntity.setSfyx("1"); //是否有效 1-有效 2-无效
        fcjyClfZjjgxyEntity.setBz("无备注"); //备注
        //资金监管协议数据-over

        //资金监管合同数据-begin
        FcjyClfZjjghtEntity fcjyClfZjjghtEntity = new FcjyClfZjjghtEntity();
        fcjyClfZjjghtEntity.setJgid(zjjgxyDto.getXybh()); //监管id
//        fcjyClfZjjghtEntity.setHtbh((long)Integer.parseInt(zjjgxyDto.getHtbh())); //合同编号-卖合同的合同编号
        fcjyClfZjjghtEntity.setHtbh((long)UuidUtil.getUuidNum()); //合同编号-与买卖合同的合同编号不同，这个是监管合同的合同编号
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
        fcjyClfZjjgzhBuy.setSfdg("1"); //是否对公 1-是 0-否
        fcjyClfZjjgzhBuy.setZhsyr(fcjyClfMmhtZtEntityBuy.getHm()); //账户所有人
        fcjyClfZjjgzhBuy.setZhh(fcjyClfMmhtZtEntityBuy.getZh()); //账户号
        fcjyClfZjjgzhBuy.setYhbh(fcjyClfMmhtZtEntityBuy.getYh()); //银行编号
        fcjyClfZjjgzhBuy.setYhmc(fcjyClfMmhtZtEntitySale.getYh()); //银行名称
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
        fcjyClfZjjgzhBuy.setJzbz("0"); //鉴证标志 0-未鉴证
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
        fcjyClfZjjgzhSale.setSfdg("1"); //是否对公 1-是 0-否
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
        fcjyClfZjjgzhSale.setJzbz("0"); //鉴证标志 0-未鉴证
        fcjyClfZjjgzhSale.setJzsj(new java.sql.Date(now.getTime())); //鉴证时间
        fcjyClfZjjgzhSale.setJzrbh(jzrbh + ""); //鉴证人编号
        fcjyClfZjjgzhSale.setZt("1"); //资金监管账号状态 1-正常 0-作废
        fcjyClfZjjgzhSale.setBz("无备注"); //备注
        //资金监管账户-卖方-over

        //保存资金监管协议
//        fcjyClfZjjgxyService.insertZjjgxy(fcjyClfZjjgxyEntity);
        //保存资金监管合同
//        fcjyClfZjjghtService.insertZjjght(fcjyClfZjjghtEntity);
        //保存资金监管合同主体-买方
//        fcjyClfZjjghtZtService.insertZjjghtZt(fcjyClfZjjghtZtBuy);
        //保存资金监管合同主体-卖方
//        fcjyClfZjjghtZtService.insertZjjghtZt(fcjyClfZjjghtZtSale);
        //保存资金监管账号-买方
        fcjyClfZjjgzhService.insertZjjgzh(fcjyClfZjjgzhBuy);
        //保存资金监管账号-卖方
        fcjyClfZjjgzhService.insertZjjgzh(fcjyClfZjjgzhSale);

        int i = 1;
    }

    @Test
    void findJkmxByXybh() {

        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid("10000");
        int i = 0;

    }

    @Test
    void getzkmxHead() {
        Map<String, String> map = new HashMap<>();

        //根据监管id资金监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid("4e0d0042d28b70f431bee8aa17342f4c");
        if (null == zjjgrzjlByJgid){
            int j = 1;
        }

        //根据监管id查询监管合同主体
        List<FcjyClfZjjghtZtEntity> zjjghtZtByJgid = fcjyClfZjjghtZtService.findZjjghtZtByJgid("4e0d0042d28b70f431bee8aa17342f4c");
        if (null == zjjghtZtByJgid){
            int k = 1;
        }
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntityBuy = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntitySale = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity : zjjghtZtByJgid){
            //存量房买卖合同主体-买受人
            if ("0".equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntityBuy = fcjyClfZjjghtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if ("1".equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntitySale = fcjyClfZjjghtZtEntity;
            }
        }

        //监管开户行
        String dgfkyhmc = zjjgrzjlByJgid.getDgfkyhmc();
        map.put("jgkhh", dgfkyhmc);

        //结算账户
        String dgyhzh = zjjgrzjlByJgid.getDgyhzh();
        map.put("jszh", dgyhzh);

        //监管资金额
        String je = zjjgrzjlByJgid.getJe() + "";
        map.put("jgzje", je);

        //需交款金额
        String xjkje = zjjgrzjlByJgid.getJe() + "";
        map.put("xjkje", xjkje);

        //交款确认额
        String jkqre = zjjgrzjlByJgid.getJe() + "";
        map.put("jkqre", jkqre);

        //交款人姓名
        String jkrxm = fcjyClfZjjghtZtEntityBuy.getZtxm();
        map.put("jkrxm", jkrxm);

        //交款人证件号码
        String jkrzjhm = fcjyClfZjjghtZtEntityBuy.getZjhm();
        map.put("jkrzjhm", jkrzjhm);

        int i = 0;

    }

    @Test
    void testGetzkmxHead() {
        Map<String, String> map = new HashMap<>();

        //根据监管id资金监管入账记录
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlService.findZjjgrzjlByJgid("84ab0217eac2afd6978300e094fe408b");
        if (null == zjjgrzjlByJgid){
//            return map;
        }

        //根据监管id查询监管合同主体
        List<FcjyClfZjjghtZtEntity> zjjghtZtByJgid = fcjyClfZjjghtZtService.findZjjghtZtByJgid("84ab0217eac2afd6978300e094fe408b");
        if (null == zjjghtZtByJgid){
//            return map;
        }
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntityBuy = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntitySale = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity : zjjghtZtByJgid){
            //存量房买卖合同主体-买受人
            if ("0".equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntityBuy = fcjyClfZjjghtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if ("1".equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntitySale = fcjyClfZjjghtZtEntity;
            }
        }

        //监管开户行
        String dgfkyhmc = zjjgrzjlByJgid.getDgfkyhmc();
        map.put("jgkhh", dgfkyhmc);

        //结算账户
        String dgyhzh = zjjgrzjlByJgid.getDgyhzh();
        map.put("jszh", dgyhzh);

        //监管资金额
        String je = zjjgrzjlByJgid.getJe() + "";
        map.put("jgzje", je);

        //需交款金额
        String xjkje = zjjgrzjlByJgid.getJe() + "";
        map.put("xjkje", xjkje);

        //交款确认额
        String jkqre = zjjgrzjlByJgid.getJe() + "";
        map.put("jkqre", jkqre);

        //交款人姓名
        String jkrxm = fcjyClfZjjghtZtEntityBuy.getZtxm();
        map.put("jkrxm", jkrxm);

        //交款人证件号码
        String jkrzjhm = fcjyClfZjjghtZtEntityBuy.getZjhm();
        map.put("jkrzjhm", jkrzjhm);

        int i = 1;
    }

    @Test
    void zjjgxyByJgidToShow() {

        String jgid = "";

        //第一栏数据
        Map<String, String> map = new HashMap<>();

        //资金监管协议
        FcjyClfZjjgxyEntity zjjgxyByJgid = fcjyClfZjjgxyService.findZjjgxyByJgid(jgid);
        //资金监管合同
        FcjyClfZjjghtEntity zjjghtByJgid = fcjyClfZjjghtService.findZjjghtByJgid(jgid);
        //资金监管合同主体
        List<FcjyClfZjjghtZtEntity> zjjghtZtByJgid = fcjyClfZjjghtZtService.findZjjghtZtByJgid(jgid);

//        if (null == zjjghtByJgid || null == zjjgxyByJgid || null == zjjghtZtByJgid){
//            return map;
//        }

        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntityBuy = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntitySale = new FcjyClfZjjghtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity : zjjghtZtByJgid){
            //存量房买卖合同主体-买受人
            if ("0".equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntityBuy = fcjyClfZjjghtZtEntity;
            }
            //存量房买卖合同主体-出卖人
            if ("1".equals(fcjyClfZjjghtZtEntity.getZtlb())){
                fcjyClfZjjghtZtEntitySale = fcjyClfZjjghtZtEntity;
            }
        }

        map.put("jgid", jgid); //监管id
        map.put("jgbh", zjjgxyByJgid.getJgbh() + ""); //监管编号
        map.put("htzje", zjjgxyByJgid.getHtzje() + ""); //合同总金额
        map.put("zjgje", zjjgxyByJgid.getZjgje() + ""); //总监管金额
        map.put("qdxyrq", zjjgxyByJgid.getQdxyrq() + ""); //签订日期时间
        map.put("zt", zjjgxyByJgid.getZt()); //协议状态
        map.put("htbh", zjjghtByJgid.getHtbh() + ""); //合同编号
        map.put("fwzl", zjjghtByJgid.getFwzl()); //房屋坐落
        map.put("fwmj", zjjghtByJgid.getFwmj() + ""); //房屋面积
        map.put("fwsyqzh", zjjghtByJgid.getFwsyqzh()); //房屋所有权证号
        map.put("buyxm", fcjyClfZjjghtZtEntityBuy.getZtxm()); //买方姓名
        map.put("buyzjhm", fcjyClfZjjghtZtEntityBuy.getZjhm()); //买方证件号码
        map.put("buyyh", fcjyClfZjjghtZtEntityBuy.getYh()); //买方退款银行
        map.put("buyzh", fcjyClfZjjghtZtEntityBuy.getZh()); //买方账户
        map.put("salexn", fcjyClfZjjghtZtEntitySale.getZtxm()); //卖方姓名
        map.put("salezjhm", fcjyClfZjjghtZtEntitySale.getZjhm()); //卖方证件号码
        map.put("saleyh", fcjyClfZjjghtZtEntitySale.getYh()); //卖方收款银行
        map.put("salezh", fcjyClfZjjghtZtEntitySale.getZh()); //卖方账户

        int i = 1;
    }
}