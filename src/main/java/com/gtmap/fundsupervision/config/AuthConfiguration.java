package com.gtmap.fundsupervision.config;

import com.gtmap.fundsupervision.entity.UserLoginEntity;
import com.gtmap.fundsupervision.service.UserLoginService;
import com.gtmap.fundsupervision.utils.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/15
 * @description security配置类
 */

@Slf4j
@Configuration
@EnableWebSecurity
public class AuthConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserLoginService userLoginService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/hello/**").hasRole("ROOT").anyRequest().permitAll()
                .and()
                .csrf().disable()
                .formLogin().loginPage("/login") //自定义页面跳转
                .successForwardUrl("/main") //登录成功后跳转，忽略之前的url
                .and().httpBasic().disable()
                .sessionManagement().disable()
                .cors()
                .and()
                .logout().logoutUrl("/logout")
                .and().headers().frameOptions().sameOrigin();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return username -> {
            List<UserLoginEntity> users = userLoginService.getUserByUsername(username);
            if (null == users || users.size() == 0) {
                log.error("未找到用户名:{}",username);
                throw new UsernameNotFoundException("未找到用户名:" + username);
            }
            String password = users.get(0).getPassword(); //一次加密密码-数据库查
            String passwordConvert = MD5Util.convertMD5(password); //二次解密
            PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
            String passwordAfterEncoder = passwordEncoder.encode(passwordConvert);
            log.info("当前用户名：{}",username);
            return org.springframework.security.core.userdetails.User
                    .withUsername(username)
                    .password(passwordAfterEncoder)
                    .roles("USER","ROOT").accountExpired(false)
                    .accountLocked(false)
                    .credentialsExpired(false)
                    .disabled(false)
                    .build();
        };
    }

}
