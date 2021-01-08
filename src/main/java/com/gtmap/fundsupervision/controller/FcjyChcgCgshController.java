package com.gtmap.fundsupervision.controller;

import com.gtmap.fundsupervision.entity.FcjyChcgCgshEntity;
import com.gtmap.fundsupervision.service.FcjyChcgCgshService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/13
 * @description
 */

@Slf4j
@RestController
@RequestMapping("/test")
public class FcjyChcgCgshController {

    @Autowired
    private FcjyChcgCgshService fcjy_chgg_cgshService;

    //全查
    @GetMapping("/findAll")
    public List<FcjyChcgCgshEntity> findAll(){
        log.debug("开始");
        List<FcjyChcgCgshEntity> all = fcjy_chgg_cgshService.findAll();
        System.out.println(all);
        log.debug("结束");
        return all;
    }


}
