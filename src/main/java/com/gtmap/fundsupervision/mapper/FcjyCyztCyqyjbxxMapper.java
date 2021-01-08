package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyCyztCyqyjbxxEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/23
 * @description
 */

@Mapper
public interface FcjyCyztCyqyjbxxMapper {

    //根据企业编号查询企业基本信息
    FcjyCyztCyqyjbxxEntity findCyqyjbxxByQybh(String qybh);

}
