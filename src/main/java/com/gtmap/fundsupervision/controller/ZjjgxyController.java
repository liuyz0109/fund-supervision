package com.gtmap.fundsupervision.controller;

import com.gtmap.fundsupervision.dto.ZjjgxyCountSearchDto;
import com.gtmap.fundsupervision.dto.ZjjgxySearchDto;
import com.gtmap.fundsupervision.service.FcjyClfZjjgxyService;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.ResultVo;
import com.gtmap.fundsupervision.vo.ZjjgxyCountVo;
import com.gtmap.fundsupervision.vo.ZjjgxyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/5
 * @description 资金监管协议
 */

@Controller
@RequestMapping("/zjjgxy")
public class ZjjgxyController {

    @Autowired
    private FcjyClfZjjgxyService fcjyClfZjjgxyService;

    //获取资金监管协议页面展示数据
    @ResponseBody
    @RequestMapping("/getData")
    public DataVo<ZjjgxyVo> getData(Integer page, Integer limit,HttpSession session){
        //获取查询条件
        ZjjgxySearchDto zjjgxySearchDto = (ZjjgxySearchDto) session.getAttribute("zjjgxySearchDto");
        DataVo<ZjjgxyVo> data = fcjyClfZjjgxyService.findZjjgxyAll(page,limit,zjjgxySearchDto);
        return data;
    }

    //保存查询条件到session
    @ResponseBody
    @PostMapping("/searchData")
    public ResultVo searchData(ZjjgxySearchDto zjjgxySearchDto, HttpSession session){
        try {
            session.setAttribute("zjjgxySearchDto",zjjgxySearchDto);
            return new ResultVo(true, "查询条件设置成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "查询条件设置错误");
        }
    }

    //获取资金监管协议统计页面数据
    @ResponseBody
    @GetMapping("/getZjjgxyCountData")
    public DataVo<ZjjgxyCountVo> getZjjgxyCountData(Integer page, Integer limit,HttpSession session){
        ZjjgxyCountSearchDto zjjgxyCountSearchDto = (ZjjgxyCountSearchDto) session.getAttribute("zjjgxyCountSearchDto");
        DataVo<ZjjgxyCountVo> dataVo = fcjyClfZjjgxyService.getZjjgxyCountData(page, limit, zjjgxyCountSearchDto);
        return dataVo;
    }

    //统计-查询条件存session
    @ResponseBody
    @PostMapping("/searchZjjgxyCountData")
    public ResultVo searchZjjgxyCountData(ZjjgxyCountSearchDto zjjgxyCountSearchDto,HttpSession session){
        try {
            session.setAttribute("zjjgxyCountSearchDto",zjjgxyCountSearchDto);
            return new ResultVo(true, "查询条件设置成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "查询条件设置错误");
        }
    }

}
