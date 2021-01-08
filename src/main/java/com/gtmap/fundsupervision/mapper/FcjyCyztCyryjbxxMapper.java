package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyCyztCyryjbxxEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/29
 * @description 从业主体从业人员基本信息
 */

@Mapper
public interface FcjyCyztCyryjbxxMapper {

    //根据人员编号查询人员信息
    FcjyCyztCyryjbxxEntity findCyryjbxxByRyid(String ryid);

}
