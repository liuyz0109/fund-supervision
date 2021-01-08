package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyCyztCyryjbxxEntity;
import com.gtmap.fundsupervision.mapper.FcjyCyztCyryjbxxMapper;
import com.gtmap.fundsupervision.service.FcjyCyztCyryjbxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/29
 * @description 从业主体从业人员基本信息
 */

@Service
public class FcjyCyztCyryjbxxServiceImpl implements FcjyCyztCyryjbxxService {

    @Autowired
    private FcjyCyztCyryjbxxMapper fcjyCyztCyryjbxxMapper;

    /**
     * 根据人员编号查询人员信息
     * @param ryid
     * @return
     */
    @Override
    public FcjyCyztCyryjbxxEntity findCyryjbxxByRyid(String ryid) {
        return fcjyCyztCyryjbxxMapper.findCyryjbxxByRyid(ryid);
    }
}
