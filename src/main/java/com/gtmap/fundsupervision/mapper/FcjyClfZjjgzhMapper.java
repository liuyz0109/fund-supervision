package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgzhEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description
 */
@Mapper
public interface FcjyClfZjjgzhMapper {

    //保存资金监管账户
    void insertZjjgzh(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity);

}
