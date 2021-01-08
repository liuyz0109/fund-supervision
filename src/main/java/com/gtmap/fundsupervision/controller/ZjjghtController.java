package com.gtmap.fundsupervision.controller;

import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.service.ZjjghtService;
import com.gtmap.fundsupervision.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description
 */

@Controller
@RequestMapping("/zjjght")
public class ZjjghtController {

    @Autowired
    private ZjjghtService zjjghtService;

    /**
     * 父页面的参数设置session
     * @param htbh
     * @param session
     * @return
     */
    @RequestMapping("/findZjjght")
    public String findZjjght(String htbh, HttpSession session){
        session.setAttribute("htbhOld", htbh);
        return "index/zjjght-list";
    }

    /**
     * 分页模糊查
     * @param page
     * @param limit
     * @param session
     * @return
     */
    @RequestMapping("/getDataByHtbh")
    @ResponseBody
    public DataVo<ClfMmhtListVo> getDataByHtbh(Integer page, Integer limit, HttpSession session){
        String htbhOld = (String) session.getAttribute("htbhOld");
        return zjjghtService.findClfMmhtListVoByHtbh(page,limit,htbhOld);
    }

    /**
     * 根据合同编号查询信息并验证，带回给页面
     * @param htbh
     * @return
     */
    @GetMapping("/findDataByHtbh")
    @ResponseBody
    public ZjjgxyDto findDataByHtbh(String htbh){
        return zjjghtService.findClfMmhtVoByHtbh(htbh);
    }

    /**
     * 页面跳转，获取房产信息-设置session
     * @param cqzh
     * @param session
     * @return
     */
    @GetMapping("/findFcxx")
    public String findFcxx(String cqzh, HttpSession session){
        session.setAttribute("cqzhOld", cqzh);
        return "index/fcxx-list";
    }

    /**
     * 获取房产信息
     * @param session
     * @return
     */
    @ResponseBody
    @GetMapping("/getDataByCqzh")
    public DataVo<FcxxVo> getDataByCqzh(Integer page, Integer limit, HttpSession session){
        String cqzhOld = (String) session.getAttribute("cqzhOld");
        return zjjghtService.findFcxxByCqzh(page,limit,cqzhOld);
    }

    /**
     * 获取选择的房产信息
     * @param cqzh
     * @return
     */
    @GetMapping("/findDataByCqzh")
    @ResponseBody
    public ZJjgFcxxVo findDataByCqzh(String cqzh){
        return zjjghtService.findZJjgFcxxVoByCqzh(cqzh);
    }

}
