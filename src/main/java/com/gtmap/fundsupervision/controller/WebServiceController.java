package com.gtmap.fundsupervision.controller;

import com.gtmap.fundsupervision.dto.XingYeBankZjjgxyDto;
import com.gtmap.fundsupervision.webservice.XingYeBankWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/7
 * @description webservice 控制层
 */

@Controller
@RequestMapping("/ws")
public class WebServiceController {

    @Autowired
    private XingYeBankWebService xingYeBankWebService;

    @ResponseBody
    @GetMapping("/getData")
    public List<XingYeBankZjjgxyDto> getData(){
        return xingYeBankWebService.getAllData();
    }

}
