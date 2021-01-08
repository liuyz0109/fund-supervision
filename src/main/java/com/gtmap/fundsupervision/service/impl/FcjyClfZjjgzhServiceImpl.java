package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgzhEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgzhMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjgzhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description
 */

@Service
public class FcjyClfZjjgzhServiceImpl implements FcjyClfZjjgzhService {

    @Autowired
    private FcjyClfZjjgzhMapper fcjyClfZjjgzhMapper;

    /**
     * 保存资金监管账户
     * @param fcjyClfZjjgzhEntity
     */
    @Override
    public void insertZjjgzh(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity) {
        fcjyClfZjjgzhMapper.insertZjjgzh(fcjyClfZjjgzhEntity);
    }
}
