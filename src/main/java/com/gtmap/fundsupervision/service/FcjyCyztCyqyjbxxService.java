package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyCyztCyqyjbxxEntity;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/23
 * @description 从业主体从业企业基本信息
 */
public interface FcjyCyztCyqyjbxxService {

    //根据企业编号查询企业基本信息
    FcjyCyztCyqyjbxxEntity findCyqyjbxxByQybh(String qybh);

}
