package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfJjhtEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfJjhtMapper;
import com.gtmap.fundsupervision.service.FcjyClfJjhtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/23
 * @description
 */

@Service
public class FcjyClfJjhtServiceImpl implements FcjyClfJjhtService {

    @Autowired
    private FcjyClfJjhtMapper fcjyClfJjhtMapper;

    /**
     * 根据户编号查询存量房经纪合同
     * @param hbh
     * @return
     */
    @Override
    public FcjyClfJjhtEntity findJjhtByHbh(String hbh) {
        return fcjyClfJjhtMapper.findJjhtByHbh(hbh);
    }

}
