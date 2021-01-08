package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.entity.*;
import com.gtmap.fundsupervision.mapper.FcjyClfMmhtMapper;
import com.gtmap.fundsupervision.service.FcjyClfMmhtService;
import com.gtmap.fundsupervision.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description
 */

@Service
public class FcjyClfMmhtServiceImpl implements FcjyClfMmhtService {

    @Autowired
    private FcjyClfMmhtMapper fcjyClfMmhtMapper;

    /**
     * 存量房买卖合同列表查询
     * @param htbhOld
     * @return
     */
    @Override
    public List<ClfMmhtListVo> findClfMmhtListVoByHtbh(String htbhOld) {
        return fcjyClfMmhtMapper.findClfMmhtListVoByHtbh(htbhOld);
    }

    /**
     * 存量房买卖合同Vo
     * @param htbh
     * @return
     */
    @Override
    public ZjjgxyDto findClfMmhtVoByHtbh(String htbh) {
        return fcjyClfMmhtMapper.findClfMmhtVoByHtbh(htbh);
    }

    /**
     * 存量房买卖合同信息查询
     * @param htbh
     * @return
     */
    @Override
    public FcjyClfMmhtEntity findClfMmhtByHtbh(String htbh) {
        return fcjyClfMmhtMapper.findClfMmhtByHtbh(htbh);
    }

    /**
     * 存量房买卖合同房屋权属概况
     * @param htid
     * @return
     */
    @Override
    public FcjyClfMmhtFwqsgkEntity findFwqsgkByHtid(String htid) {
        return fcjyClfMmhtMapper.findFwqsgkByHtid(htid);
    }

    /**
     * 根据合同编号获取存量房买卖合同主体
     * @param htbh
     * @return
     */
    @Override
    public List<FcjyClfMmhtZtEntity> findMmhtZtByHtbh(String htbh) {
        return fcjyClfMmhtMapper.findMmhtZtByHtbh(htbh);
    }

    /**
     * 根据合同id获取存量房买卖房价款及支付方式
     * @param htid
     * @return
     */
    @Override
    public FcjyClfMmhtCjjgfkfsEntity findCjjgfkfsByHtid(String htid) {
        return fcjyClfMmhtMapper.findCjjgfkfsByHtid(htid);
    }

    /**
     * 根据合同id获取存量房买卖合同房屋交付
     * @param htid
     * @return
     */
    @Override
    public FcjyClfMmhtFwjfEntity findFwjfByHtid(String htid) {
        return fcjyClfMmhtMapper.findFwjfByHtid(htid);
    }

    /**
     * 根据产权账号获取房产信息
     * @param cqzh
     * @return
     */
    @Override
    public List<FcxxVo> findFcxxVoByHtbh(String cqzh) {
        return fcjyClfMmhtMapper.findFcxxVoByHtbh(cqzh);
    }

    /**
     * 获取选择的房产信息
     * @param cqzh
     * @return
     */
    @Override
    public ZJjgFcxxVo findZJjgFcxxVoByCqzh(String cqzh) {
        return fcjyClfMmhtMapper.findZJjgFcxxVoByCqzh(cqzh);
    }

    /**
     * 查询权证查询信息
     * @return
     * @param searchQzcx
     */
    @Override
    public List<QzcxVo> findAllQzcxVo(Map<String, String> searchQzcx) {
        return fcjyClfMmhtMapper.findAllQzcxVo(searchQzcx);
    }
}
