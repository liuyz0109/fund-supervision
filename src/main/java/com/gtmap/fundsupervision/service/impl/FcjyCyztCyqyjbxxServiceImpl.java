package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyCyztCyqyjbxxEntity;
import com.gtmap.fundsupervision.mapper.FcjyCyztCyqyjbxxMapper;
import com.gtmap.fundsupervision.service.FcjyCyztCyqyjbxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/23
 * @description 从业主体从业企业基本信息
 */

@Service
public class FcjyCyztCyqyjbxxServiceImpl implements FcjyCyztCyqyjbxxService {

    @Autowired
    private FcjyCyztCyqyjbxxMapper fcjyCyztCyqyjbxxMapper;

    //根据企业编号查询企业基本信息
    @Override
    public FcjyCyztCyqyjbxxEntity findCyqyjbxxByQybh(String qybh) {
        return fcjyCyztCyqyjbxxMapper.findCyqyjbxxByQybh(qybh);
    }
}
