package com.gtmap.fundsupervision.controller;

import com.alibaba.fastjson.JSONArray;
import com.gtmap.fundsupervision.service.UserLoginService;
import com.gtmap.fundsupervision.vo.UserDataVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/14
 * @description
 */

@Slf4j
@Controller
public class LoginController {

    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private StringRedisTemplate template;

    //登录
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    //主页面
    @PostMapping("/main")
    public String home(){
        return "index/index";
    }

    //登出
    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

    //获取用户名
    @ResponseBody
    @GetMapping("/login/getUsername")
    public UserDataVo getUsername(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        log.info("Controller请求用户名：{}", username);
        //获取对应的权限和角色
        UserDataVo userDataVo = userLoginService.getUserDataVoByUsername(username);
        //数据存redis，设置30分钟有效
        template.opsForValue().set(userDataVo.getUsername(), JSONArray.toJSON(userDataVo).toString(), 30, TimeUnit.MINUTES);
        //返回前端
        return userDataVo;
    }

}
