package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyClfJjhtEntity;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/23
 * @description 存量房经纪合同
 */
public interface FcjyClfJjhtService {
    //根据户编号查询存量房经纪合同
    FcjyClfJjhtEntity findJjhtByHbh(String hbh);
}
