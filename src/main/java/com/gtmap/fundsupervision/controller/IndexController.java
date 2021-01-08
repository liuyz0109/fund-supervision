package com.gtmap.fundsupervision.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/16
 * @description index页面跳转
 */

@Slf4j
@RequestMapping("/index")
@Controller
public class IndexController {

    //首页欢迎页
    @GetMapping("/welcome")
    public String welcome(){
        return "index/welcome";
    }

    //资金监管箱
    @GetMapping("/zjjgx")
    public String zjjgx(){
        return "index/zjjgx";
    }

    //资金监管协议
    @GetMapping("/zjjgxy")
    public String zjjgxy(){
        return "index/zjjgxy";
    }

    //资金监管协议统计
    @GetMapping("/zjjgxyCount")
    public String zjjgxyCount(){
        return "index/zjjgxy-count";
    }

    //权证查询
    @GetMapping("/qzcx")
    public String qzcx(){
        return "index/qzcx";
    }

}
