package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyChcgCgshEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/13
 * @description
 */

@Mapper
public interface FcjyChcgCgshMapper {

    //全查
    List<FcjyChcgCgshEntity> findAll();

}
