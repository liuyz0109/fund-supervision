package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.UserLoginEntity;
import com.gtmap.fundsupervision.mapper.UserLoginMapper;
import com.gtmap.fundsupervision.service.UserLoginService;
import com.gtmap.fundsupervision.vo.UserDataVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/14
 * @description
 */

@Slf4j
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    //根据用户名字查询用户信息
    @Override
    public List<UserLoginEntity> getUserByUsername(String username) {
        return userLoginMapper.getUserByUsername(username);
    }

    //根据用户名字查询权限
    @Override
    public List<String> getPermissionsByUsername(String username) {
        return userLoginMapper.getPermissionsByUsername(username);
    }

    //根据用户名字查询角色
    @Override
    public List<String> getRolesByUsername(String username) {
        return userLoginMapper.getRolesByUsername(username);
    }

    //获取用户数据vo
    @Override
    public UserDataVo getUserDataVoByUsername(String username) {
        try {
            //获取对应的权限和角色
            List<UserLoginEntity> users = userLoginMapper.getUserByUsername(username);
            if (users == null || users.size() == 0) {
                log.error("请求用户名：{}，未找到！！", username);
                throw new UsernameNotFoundException("用户名未找到");
            }
            List<String> permissions = userLoginMapper.getPermissionsByUsername(username);
            List<String> roles = userLoginMapper.getRolesByUsername(username);
            //UserDataVo
            UserDataVo userDataVo = new UserDataVo();
            //设置参数
            userDataVo.setId(users.get(0).getId());
            userDataVo.setUsername(users.get(0).getUsername());
            userDataVo.setPermissions(permissions);
            userDataVo.setRoles(roles);
            return userDataVo;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
