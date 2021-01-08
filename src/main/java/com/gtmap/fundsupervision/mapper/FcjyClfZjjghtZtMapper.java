package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyClfZjjghtZtEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/24
 * @description
 */

@Mapper
public interface FcjyClfZjjghtZtMapper {

    //保存资金监管合同主体
    void insertZjjghtZt(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity);

    //根据监管id查询监管合同主体
    List<FcjyClfZjjghtZtEntity> findZjjghtZtByJgid(String jgid);

    //更新资金监管合同主体信息
    void updateZjjghtZtByJgid(@Param("jgid") String jgid,@Param("ztlb") String ztlb,@Param("yh") String yh,@Param("zh") String zh);

}
