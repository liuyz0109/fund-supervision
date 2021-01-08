package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.UserLoginEntity;
import com.gtmap.fundsupervision.vo.UserDataVo;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/14
 * @description
 */
public interface UserLoginService {
    //根据用户名字查询用户信息
    List<UserLoginEntity> getUserByUsername(String username);

    //根据用户名字查询权限
    List<String> getPermissionsByUsername(String username);

    //根据用户名字查询角色
    List<String> getRolesByUsername(String username);

    //获取用户数据vo
    UserDataVo getUserDataVoByUsername(String username);
}
