package com.gtmap.fundsupervision.controller;

import com.gtmap.fundsupervision.service.QzcxService;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.QzcxVo;
import com.gtmap.fundsupervision.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/8
 * @description 权证查询控制层
 */

@RequestMapping("/qzcx")
@Controller
public class QzcxController {

    @Autowired
    private QzcxService qzcxService;

    //首页面数据查询
    @ResponseBody
    @GetMapping("/getData")
    public DataVo<QzcxVo> getData(Integer page, Integer limit, HttpSession session){
        Map<String,String> searchQzcx = (Map<String, String>) session.getAttribute("searchQzcx");
        DataVo<QzcxVo> dataVo = qzcxService.getAllQzcxVo(page, limit,searchQzcx);
        //读取完成，清空session
        session.setAttribute("searchQzcx",new HashMap<>());
        return dataVo;
    }

    //查询数据保存
    @ResponseBody
    @PostMapping("/searchData")
    public ResultVo searchData(@RequestParam("searchCqzh") String searchCqzh,@RequestParam("searchXm") String searchXm,@RequestParam String searchSfzh,HttpSession session){
        try {
            Map<String, String> map = new HashMap<>();
            map.put("searchCqzh", searchCqzh);
            map.put("searchXm", searchXm);
            map.put("searchSfzh", searchSfzh);
            session.setAttribute("searchQzcx", map);
            return new ResultVo(true, "查询数据保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "查询数据保存失败");
        }
    }

}
