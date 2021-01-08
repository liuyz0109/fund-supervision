package com.gtmap.fundsupervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.entity.FcjyClfMmhtEntity;
import com.gtmap.fundsupervision.entity.FcjyClfMmhtZtEntity;
import com.gtmap.fundsupervision.service.FcjyClfMmhtService;
import com.gtmap.fundsupervision.service.ZjjghtService;
import com.gtmap.fundsupervision.utils.ZjlbUtil;
import com.gtmap.fundsupervision.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description
 */

@Service
public class ZjjghtServiceImpl implements ZjjghtService {

    @Autowired
    private FcjyClfMmhtService fcjyClfMmhtService;

    /**
     * 存量房买卖合同列表查询
     * @param page
     * @param limit
     * @param htbhOld
     * @return
     */
    @Override
    public DataVo<ClfMmhtListVo> findClfMmhtListVoByHtbh(Integer page, Integer limit, String htbhOld) {
        //封装DataVo<ClfMmhtVo>数据
        DataVo<ClfMmhtListVo> zjjghtVoDataVo = new DataVo<>();
        zjjghtVoDataVo.setCode(0);
        zjjghtVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);
        //查询
        List<ClfMmhtListVo> clfMmhtVoByHtbh = fcjyClfMmhtService.findClfMmhtListVoByHtbh(htbhOld);

        //进行pageInfo包装
        PageInfo<ClfMmhtListVo> pageInfo = new PageInfo<>(clfMmhtVoByHtbh);

        zjjghtVoDataVo.setCount((int)pageInfo.getTotal());
        zjjghtVoDataVo.setData(pageInfo.getList());

        return zjjghtVoDataVo;
    }

    /**
     * 存量房买卖合同Vo查询并验证
     * @param htbh
     * @return
     */
    @Override
    public ZjjgxyDto findClfMmhtVoByHtbh(String htbh) {
        //获取当前合同编号的存量房买卖合同信息
        FcjyClfMmhtEntity clfMmhtByHtbh = fcjyClfMmhtService.findClfMmhtByHtbh(htbh);

        //获取数据
        ZjjgxyDto zjjgxyDto = fcjyClfMmhtService.findClfMmhtVoByHtbh(htbh);

        //根据合同编号获取存量房买卖合同主体
        List<FcjyClfMmhtZtEntity> mmhtZtByHtbhList = fcjyClfMmhtService.findMmhtZtByHtbh(zjjgxyDto.getHtbh());
        FcjyClfMmhtZtEntity fcjyClfMmhtZtEntityBuy = new FcjyClfMmhtZtEntity(); //存量房买卖合同主体-买受人
        FcjyClfMmhtZtEntity fcjyClfMmhtZtEntitySale = new FcjyClfMmhtZtEntity(); //存量房买卖合同主体-出卖人
        for(FcjyClfMmhtZtEntity fcjyClfMmhtZtEntity : mmhtZtByHtbhList){
            //存量房买卖合同主体-买受人-乙方
            if ("0".equals(fcjyClfMmhtZtEntity.getZtlb())){
                fcjyClfMmhtZtEntityBuy = fcjyClfMmhtZtEntity;
            }
            //存量房买卖合同主体-出卖人-甲方
            if ("1".equals(fcjyClfMmhtZtEntity.getZtlb())){
                fcjyClfMmhtZtEntitySale = fcjyClfMmhtZtEntity;
            }
        }

        //验证条件
        //判断有效性
        if (!"1".equals(clfMmhtByHtbh.getSfyx())){
            return null;
        }

        //封装数据
        //付款类型
        String fkfs = "未知";
        switch (zjjgxyDto.getFkfs()){
            case "1":
                fkfs = "一次性付款";
                break;
            case "2":
                fkfs = "分期付款";
                break;
            case "3":
                fkfs = "抵押贷款付款";
                break;
            case "4":
                fkfs = "组合贷款";
                break;
        }
        zjjgxyDto.setFkfs(fkfs);

        //贷款银行
        if (null != zjjgxyDto.getDkje() && zjjgxyDto.getDkje().equals("0")){ //无贷款
            zjjgxyDto.setDkyh("无贷款银行");
        }else {
            zjjgxyDto.setDkyh("贷款银行1");
        }
        //甲方
        zjjgxyDto.setJfxm(fcjyClfMmhtZtEntityBuy.getZtxm());
        zjjgxyDto.setJfdh(fcjyClfMmhtZtEntityBuy.getLxdh());
        zjjgxyDto.setJfzjlx(ZjlbUtil.zjlbNumToString(fcjyClfMmhtZtEntityBuy.getZjlb()));
        zjjgxyDto.setJfzjhm(fcjyClfMmhtZtEntityBuy.getZjhm());
        zjjgxyDto.setJfzz(fcjyClfMmhtZtEntityBuy.getDz());
        zjjgxyDto.setJfbwtr(fcjyClfMmhtZtEntityBuy.getDlrxm());
        zjjgxyDto.setJfbwtrzjlx(ZjlbUtil.zjlbNumToString(fcjyClfMmhtZtEntityBuy.getDlrzjlb()));
        zjjgxyDto.setJfbwtrzjhm(fcjyClfMmhtZtEntityBuy.getDlrzjhm());
        //乙方
        zjjgxyDto.setYfxm(fcjyClfMmhtZtEntitySale.getZtxm());
        zjjgxyDto.setYfdh(fcjyClfMmhtZtEntitySale.getLxdh());
        zjjgxyDto.setYfzjlx(ZjlbUtil.zjlbNumToString(fcjyClfMmhtZtEntitySale.getZjlb()));
        zjjgxyDto.setYfzjhm(fcjyClfMmhtZtEntitySale.getZjhm());
        zjjgxyDto.setYfzz(fcjyClfMmhtZtEntitySale.getDz());
        zjjgxyDto.setYfbwtr(fcjyClfMmhtZtEntitySale.getDlrxm());
        zjjgxyDto.setYfbwtrzjlx(ZjlbUtil.zjlbNumToString(fcjyClfMmhtZtEntitySale.getDlrzjlb()));
        zjjgxyDto.setYfbwtrzjhm(fcjyClfMmhtZtEntitySale.getDlrzjhm());

        return zjjgxyDto;
    }

    /**
     * 获取房产信息
     * @param page
     * @param limit
     * @param cqzhOld
     * @return
     */
    @Override
    public DataVo<FcxxVo> findFcxxByCqzh(Integer page, Integer limit, String cqzhOld) {
        //封装DataVo<ClfMmhtVo>数据
        DataVo<FcxxVo> zjjghtVoDataVo = new DataVo<>();
        zjjghtVoDataVo.setCode(0);
        zjjghtVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);
        //查询
        List<FcxxVo> clfMmhtVoByHtbh = fcjyClfMmhtService.findFcxxVoByHtbh(cqzhOld);

        //进行pageInfo包装
        PageInfo<FcxxVo> pageInfo = new PageInfo<>(clfMmhtVoByHtbh);

        zjjghtVoDataVo.setCount((int)pageInfo.getTotal());
        zjjghtVoDataVo.setData(pageInfo.getList());

        return zjjghtVoDataVo;
    }

    /**
     * 获取选择的房产信息
     * @param cqzh
     * @return
     */
    @Override
    public ZJjgFcxxVo findZJjgFcxxVoByCqzh(String cqzh) {
        ZJjgFcxxVo zJjgFcxxVoByCqzh = fcjyClfMmhtService.findZJjgFcxxVoByCqzh(cqzh);
        zJjgFcxxVoByCqzh.setSlr(SecurityContextHolder.getContext().getAuthentication().getName()); //登陆者
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        zJjgFcxxVoByCqzh.setSjrq(format);
        return zJjgFcxxVoByCqzh;
    }
}
