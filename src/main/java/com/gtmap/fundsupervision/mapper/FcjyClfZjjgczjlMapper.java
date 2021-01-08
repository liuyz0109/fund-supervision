package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgczjlEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/30
 * @description 资金监管出账记录
 */

@Mapper
public interface FcjyClfZjjgczjlMapper {

    //保存资金监管出账记录
    void insertZjjgczjl(FcjyClfZjjgczjlEntity fcjyClfZjjgczjlEntity);

    //根据监管id资金监管出账记录
    FcjyClfZjjgczjlEntity findZjjgczjlByJgid(String jgid);
}
