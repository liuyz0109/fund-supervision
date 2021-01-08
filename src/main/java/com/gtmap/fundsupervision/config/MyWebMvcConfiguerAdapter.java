package com.gtmap.fundsupervision.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description webmvc配置类
 */

@Configuration
@EnableWebMvc
public class MyWebMvcConfiguerAdapter implements WebMvcConfigurer {

//    static class MyInterceptor extends HandlerInterceptorAdapter {
//        @Override
//        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//                throws Exception {
//            return super.preHandle(request, response, handler);
//        }
//
//        @Override
//        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//                throws Exception {
//            super.afterCompletion(request, response, handler, ex);
//        }
//    }

    //静态资源不拦截
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
