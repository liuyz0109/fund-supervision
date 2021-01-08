package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.UserLoginEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/14
 * @description
 */
@Mapper
public interface UserLoginMapper {
    //根据用户名字查询用户信息
    List<UserLoginEntity> getUserByUsername(String username);

    //根据用户名字查询权限
    List<String> getPermissionsByUsername(String username);

    //根据用户名字查询角色
    List<String> getRolesByUsername(String username);
}
