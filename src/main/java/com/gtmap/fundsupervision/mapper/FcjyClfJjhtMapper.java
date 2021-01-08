package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyClfJjhtEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/23
 * @description
 */

@Mapper
public interface FcjyClfJjhtMapper {

    //根据户编号查询存量房经纪合同
    FcjyClfJjhtEntity findJjhtByHbh(String hbh);

}
