package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyCyztCyryjbxxEntity;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/29
 * @description 从业主体从业人员基本信息
 */
public interface FcjyCyztCyryjbxxService {

    //根据人员编号查询人员信息
    FcjyCyztCyryjbxxEntity findCyryjbxxByRyid(String ryid);
}
