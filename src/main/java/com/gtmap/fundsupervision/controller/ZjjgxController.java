package com.gtmap.fundsupervision.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.dto.ZjjgxyZhxxDto;
import com.gtmap.fundsupervision.service.ZjjgxService;
import com.gtmap.fundsupervision.vo.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/18
 * @description 资金监管箱
 */

@Controller
@RequestMapping("/zjjgx")
public class ZjjgxController {

    @Autowired
    private ZjjgxService zjjgxService;

    @Autowired
    private StringRedisTemplate template;

    //首页面展示数据-正在办理
    @ResponseBody
    @GetMapping("/getDataOne")
    public DataVo<ZjjgxVo> getData(Integer page, Integer limit,HttpSession session) {
        //从session中读取数据
        String searchDjbh = (String) session.getAttribute("searchDjbhOne");
        String searchXybh = (String) session.getAttribute("searchXybhOne");
        String searchHtbh = (String) session.getAttribute("searchHtbhOne");
        DataVo<ZjjgxVo> data = zjjgxService.getData(searchDjbh, searchXybh, searchHtbh, page, limit);
        //读取完成后,清空session中的值
        session.setAttribute("searchDjbhOne","");
        session.setAttribute("searchXybhOne","");
        session.setAttribute("searchHtbhOne","");

        return data;
    }

    //保存查询条件到session-正在办理
    @ResponseBody
    @GetMapping("/searchData")
    public ResultVo searchData(String searchDjbh,String searchXybh,String searchHtbh,HttpSession session){
        try {
            session.setAttribute("searchDjbhOne",searchDjbh);
            session.setAttribute("searchXybhOne",searchXybh);
            session.setAttribute("searchHtbhOne",searchHtbh);
            return new ResultVo(true, "查询条件设置成功");
        }catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(false, "查询条件设置错误");
        }
    }

    //页面数据-已完结
    @ResponseBody
    @GetMapping("/getDataTwo")
    public DataVo<ZjjgxVo> getDataTwo(Integer page, Integer limit,HttpSession session){
        //从session中读取数据
        String searchDjbh = (String) session.getAttribute("searchDjbhTwo");
        String searchXybh = (String) session.getAttribute("searchXybhTwo");
        String searchHtbh = (String) session.getAttribute("searchHtbhTwo");
        DataVo<ZjjgxVo> data = zjjgxService.getDataTwo(searchDjbh, searchXybh, searchHtbh, page, limit);
        //读取完成后,清空session中的值
        session.setAttribute("searchDjbhTwo","");
        session.setAttribute("searchXybhTwo","");
        session.setAttribute("searchHtbhTwo","");

        return data;
    }

    //保存查询条件到session-已完结
    @ResponseBody
    @GetMapping("/searchDataTwo")
    public ResultVo searchDataTwo(String searchDjbhTwo,String searchXybhTwo,String searchHtbhTwo,HttpSession session){
        try {
            session.setAttribute("searchDjbhTwo",searchDjbhTwo);
            session.setAttribute("searchXybhTwo",searchXybhTwo);
            session.setAttribute("searchHtbhTwo",searchHtbhTwo);
            return new ResultVo(true, "查询条件设置成功");
        }catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(false, "查询条件设置错误");
        }
    }

    //页面数据-已撤销
    @ResponseBody
    @GetMapping("/getDataThree")
    public DataVo<ZjjgxVo> getDataThree(Integer page, Integer limit,HttpSession session){
        //从session中读取数据
        String searchDjbh = (String) session.getAttribute("searchDjbhThree");
        String searchXybh = (String) session.getAttribute("searchXybhThree");
        String searchHtbh = (String) session.getAttribute("searchHtbhThree");
        DataVo<ZjjgxVo> data = zjjgxService.getDataThree(searchDjbh, searchXybh, searchHtbh, page, limit);
        //读取完成后,清空session中的值
        session.setAttribute("searchDjbhThree","");
        session.setAttribute("searchXybhThree","");
        session.setAttribute("searchHtbhThree","");

        return data;
    }

    //保存查询条件到session-已撤销
    @ResponseBody
    @GetMapping("/searchDataThree")
    public ResultVo searchDataThree(String searchDjbhThree,String searchXybhThree,String searchHtbhThree,HttpSession session){
        try {
            session.setAttribute("searchDjbhThree",searchDjbhThree);
            session.setAttribute("searchXybhThree",searchXybhThree);
            session.setAttribute("searchHtbhThree",searchHtbhThree);
            return new ResultVo(true, "查询条件设置成功");
        }catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(false, "查询条件设置错误");
        }
    }

    //弹出资金监管协议添加页面
    @GetMapping("/zjjgxyAdd")
    public String zjjgxyAdd(String token) {
        //创建令牌
        //用户名+token作为key,uuid作为value
        //获取登录用户信息-redis查询
        String s = template.opsForValue().get(SecurityContextHolder.getContext().getAuthentication().getName());
        UserDataVo userDataVo = JSONArray.parseObject(s, UserDataVo.class);
        String key = userDataVo.getUsername() + "_token";
        template.opsForValue().set(key, token, 30, TimeUnit.MINUTES);
        return "index/zjjgxy-add";
    }

    //资金监管协议保存
    @ResponseBody
    @PostMapping("/saveZjjgxy")
    public ResultVo saveZjjgxy(ZjjgxyDto zjjgxyDto, Model model) {
        try {
            //进行令牌校验
            //获取登录用户信息-redis查询
            String s = template.opsForValue().get(SecurityContextHolder.getContext().getAuthentication().getName());
            UserDataVo userDataVo = JSONArray.parseObject(s, UserDataVo.class);
            String key = userDataVo.getUsername() + "_token";
            //获取redis中的令牌信息
            String token_redis = template.opsForValue().get(key);
            if (null == userDataVo || userDataVo.toString().length() == 0){
                //无数据
                return new ResultVo(false, "登录已失效，请重新登录");
            }
            if (null == token_redis || null == zjjgxyDto.getToken() || !token_redis.equals(zjjgxyDto.getToken())){
                //令牌比对失败
                return new ResultVo(false, "请勿重复提交，请在关闭页面后重新尝试");
            }
            //令牌比对成功
            zjjgxService.saveZjjgxy(zjjgxyDto); //执行操作
            //清除redis中的令牌信息
            template.delete(key);
            return new ResultVo(true, "协议保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(false, "协议保存失败");
        }
    }

    //获取交款明细头部数据
    @ResponseBody
    @GetMapping("/getzkmxHead")
    public ResultVo getzkmxHead(String xybh) {
        Map<String, String> map = zjjgxService.getzkmxHead(xybh);
        if (null != map && map.size() > 0) {
            return new ResultVo(true, "获取交款明细头部数据成功", map);
        }
        return new ResultVo(false, "获取交款明细头部数据失败");
    }

    //获取交款明细记录
    @ResponseBody
    @GetMapping("/findJkmxByXybh")
    public DataVo<JkmxjlVo> findJkmxByXybh(String xybh) {
        DataVo<JkmxjlVo> jkmxByXybh = zjjgxService.findJkmxByXybh(xybh);
        return jkmxByXybh;
    }

    //详情展示跳转
    @GetMapping("/findZjjgxyByXybh")
    public String findZjjgxyByXybh(String xybh, HttpSession session) {
        session.setAttribute("zjjgxyByJgid", xybh);
        return "index/zjjgxy-show";
    }

    //详情展示数据查询
    @ResponseBody
    @GetMapping("/zjjgxxByJgid")
    public ResultVo zjjgxyByJgid(HttpSession session) {
        //监管id
        String jgid = (String) session.getAttribute("zjjgxyByJgid");

        //调用方法
        Map<String, String> map = zjjgxService.zjjgxyByJgidToShow(jgid);

        if (null != map && map.size() > 0) {
            return new ResultVo(true, "详情展示数据查询成功", map);
        }

        return new ResultVo(false, "详情展示数据查询失败");
    }

    //撤销资金监管
    @ResponseBody
    @PostMapping("/cxZjjgx")
    public ResultVo cxZjjgx(@RequestBody String zjjgx,HttpSession session) {
        try {
            String data = URLDecoder.decode(zjjgx, "UTF-8");
            String substring = data.substring(7, data.length() - 1);
            JSONObject parse = (JSONObject) JSON.parse(substring);
            if (null == parse) {
                return new ResultVo(false, "请先选择再操作");
            }
            String xybh = (String) parse.get("xybh"); //获取协议编号--监管id
            if (null != xybh && xybh.length() > 0){
                session.setAttribute("cxZjjgx", xybh);
            }
            //撤销资金监管协议
            Map<String, String> map = zjjgxService.updateZjjgxyByJgidToCx(xybh);
            if (null == map || map.size() == 0){
                return new ResultVo(false, "撤销失败，请重试");
            }
            if ("2".equals(map.get("sfcx"))) { //已经撤销或完结
                return new ResultVo(false, "已撤销或已完结，取消操作");
            }

            switch (map.get("sfjczj")){
                case "0":
                    return new ResultVo(true, "撤销成功（无缴存记录）",map);
                case "1":
                    return new ResultVo(true, "撤销成功（有缴存记录）",map);
            }
            return new ResultVo(false, "撤销失败，请重试");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(false, "撤销失败，请重试");
        }
    }

    //支取确认
    @ResponseBody
    @GetMapping("/zqqr")
    public ResultVo zqqr(String xybh){
        try {
            String zqqr = zjjgxService.zqqr(xybh); //获取操作结果

            if (null != zqqr && zqqr.length() > 0){ //非空
                switch (zqqr){
                    case "1":
                        return new ResultVo(true, "支取确认完成");
                    case "2":
                        return new ResultVo(false, "请先进行支取凭证生成，再重试");
                    case "3":
                        return new ResultVo(false, "支取已完成，请勿重复提交确认");
                    case "4":
                        return new ResultVo(false, "监管协议已撤销或完结，取消操作");
                    case "5":
                        return new ResultVo(false, "入账出账划款指令不一致，取消操作");
                }
            }
            return new ResultVo(false, "支取确认失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "支取确认失败，请重试");
        }
    }

    //协议账户信息修改
    @ResponseBody
    @PostMapping("/zhxxSave")
    public ResultVo zhxxSave(ZjjgxyZhxxDto zjjgxyZhxxDto){
        try {
            //获取登录用户信息-redis查询
            String s = template.opsForValue().get(SecurityContextHolder.getContext().getAuthentication().getName());
            UserDataVo userDataVo = JSONArray.parseObject(s, UserDataVo.class);
            List<String> permissions = userDataVo.getPermissions(); //权限
            for (String permission : permissions){
                if (null == permission && 0 == permission.length()){
                    return new ResultVo(false, "用户权限不足，请联系管理员");
                }
                if (permission.equals("permission3")){ //拥有permission3的权限用户才能修改账户信息
                    //协议账户信息修改
                    String zhxx = zjjgxService.updateZjjgxyZhxx(zjjgxyZhxxDto);

                    if (null != zhxx && zhxx.length() > 0){ //非空
                        switch (zhxx){
                            case "1":
                                return new ResultVo(true, "账户信息修改完成");
                            case "2":
                                return new ResultVo(false, "存在交款信息，禁止修改账户信息");
                            case "3":
                                return new ResultVo(false, "该协议已被撤销或完结，禁止修改账户信息");
                        }
                    }
                }
            }
            return new ResultVo(false, "用户权限不足，请联系管理员");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "账户信息修改失败，请重试");
        }
    }

    //查询办理进度
    @ResponseBody
    @GetMapping("/findBljd")
    public ResultVo findBljd(String xybh){
        try {
            Map<String,String> map = zjjgxService.findBljdByJgid(xybh);
            return new ResultVo(true, "办理进度数据查询成功",map);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "办理进度数据查询失败，请重试");
        }
    }

    //交款通知
    @ResponseBody
    @GetMapping("/jktz")
    public ResultVo jktz(String xybh){
        try {
            if (null == xybh || xybh.length() == 0){
                return new ResultVo(false, "请先填写信息，保存后再重试");
            }
            String jktz = zjjgxService.jktz(xybh);

            if (null != jktz && jktz.length() > 0){ //非空
                switch (jktz){
                    case "1":
                        return new ResultVo(true, "交款通知成功");
                    case "2":
                        return new ResultVo(false, "存在买方交款信息，请勿重复进行交款通知");
                    case "4":
                        return new ResultVo(false, "监管协议已撤销或完结，取消操作");
                }
            }
            return new ResultVo(false, "交款通知失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "交款通知失败，请重试");
        }
    }

    //交款确认
    @ResponseBody
    @GetMapping("/jkqr")
    public ResultVo jkqr(String xybh){
        try {
            if (null == xybh || xybh.length() == 0){
                return new ResultVo(false, "请先填写信息，保存后再重试");
            }
            String jkqr = zjjgxService.jkqr(xybh);

            if (null != jkqr){ //非空
                switch (jkqr){
                    case "1":
                        return new ResultVo(true, "交款确认成功");
                    case "2":
                        return new ResultVo(false, "请先推送交款通知后，再重试");
                    case "3":
                        return new ResultVo(false, "交款已完成，请勿重复提交确认");
                    case "4":
                        return new ResultVo(false, "监管协议已撤销或完结，取消操作");
                }
            }
            return new ResultVo(false, "交款确认失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "交款确认失败，请重试");
        }
    }

    //生成支取凭证
    @ResponseBody
    @GetMapping("/zqpz")
    public ResultVo zqpz(String xybh){
        try {
            if (null == xybh || xybh.length() == 0){
                return new ResultVo(false, "请先填写信息，保存后再重试");
            }
            String zqpz = zjjgxService.zqpz(xybh);

            if (null != zqpz && zqpz.length() > 0) { //非空
                switch (zqpz){
                    case "1":
                        return new ResultVo(true, "支取通知成功");
                    case "2":
                        return new ResultVo(false, "请先进行交款确认，再重试");
                    case "3":
                        return new ResultVo(false, "监管协议已撤销或完结，取消操作");
                    case "4":
                        return new ResultVo(false, "存在卖方支取信息，请勿重复进行支取通知");
                }
            }
            return new ResultVo(false, "支取通知失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "支取通知失败，请重试");
        }
    }

    //支取明细头部数据
    @ResponseBody
    @GetMapping("/getzqmxHead")
    public ResultVo getzqmxHead(String xybh){
        Map<String, String> map = zjjgxService.getzqmxHead(xybh);
        if (null != map && map.size() > 0) {
            return new ResultVo(true, "获取支取明细头部数据成功", map);
        }
        return new ResultVo(false, "获取支取明细头部数据失败");
    }

    //支取明细记录数据
    @ResponseBody
    @GetMapping("/findZqmxByXybh")
    public DataVo<JkmxjlVo> findZqmxByXybh(String xybh){
        DataVo<JkmxjlVo> jkmxByXybh = zjjgxService.findZqmxByXybh(xybh);
        return jkmxByXybh;
    }

    //买方退款
    @GetMapping("/mftk")
    public String mftk(){
        return "index/zjjgxy-mftk";
    }

    //获取交款明细头部数据-撤销用
    @ResponseBody
    @GetMapping("/getjkmxHeadToCx")
    public ResultVo getjkmxHeadToCx(HttpSession session){
        String jgid = (String) session.getAttribute("cxZjjgx");
        Map<String, String> map = zjjgxService.getzkmxHead(jgid);
        if (null != map && map.size() > 0) {
            return new ResultVo(true, "获取买方退款头部数据成功", map);
        }
        return new ResultVo(false, "获取买方退款头部数据失败");
    }

    //交款明细记录数据-撤销用
    @ResponseBody
    @GetMapping("/findJkmxByXybhToCx")
    public DataVo<JkmxjlVo> findJkmxByXybhToCx(HttpSession session) {
        String jgid = (String) session.getAttribute("cxZjjgx");
        DataVo<JkmxjlVo> jkmxByXybh = zjjgxService.findJkmxByXybh(jgid);
        return jkmxByXybh;
    }

    //买方退款和撤销
    @ResponseBody
    @PostMapping("/mftkCx")
    public ResultVo mftkCx(String cxmm,HttpSession session){
        try {
            String jgid = (String) session.getAttribute("cxZjjgx");

            //调用方法
            Map<String, String> map = zjjgxService.mftkCx(jgid,cxmm);

            String mftkCx = map.get("mftkCx");

            if (null != mftkCx && mftkCx.length() > 0){ //非空
                switch (mftkCx){
                    case "1":
                        return new ResultVo(true, "买方退款和撤销成功");
                    case "2":
                        return new ResultVo(false, "存在卖方支取行为，禁止操作");
                    case "3":
                        return new ResultVo(false, "撤销密码错误，请重试");
                }
            }
            return new ResultVo(false, "买方退款和撤销失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "买方退款和撤销失败，请重试");
        }
    }

    //帮助文档下载
    @GetMapping("/helpDownload")
    public void helpDownload(HttpServletResponse response){
        File file = new File("D:\\javaidea\\fund-supervision\\src\\main\\resources\\static\\help.docx");
        String filename = "help.docx";
        response.setHeader("content-disposition", "attachment;filename=" + filename);
        try {
            InputStream is = new FileInputStream(file);
            OutputStream os = response.getOutputStream();
            byte[] bs = new byte[1024];
            int len = -1;
            while ((len = is.read(bs)) != -1){
                os.write(bs,0,len);
            }
            os.flush();
            os.close();
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //监管审核页面
    @GetMapping("/jgsh")
    public String jgsh(){
        return "index/zjjgxy-jgsh";
    }

    //获取监管审核数据
    @ResponseBody
    @PostMapping("/getJgshData")
    public ResultVo getJgshData(ZJjgFcxxVo zJjgFcxxVo) {
//        System.out.println(zJjgFcxxVo);
        return new ResultVo(true, "监管审核数据保存成功");
    }

    //办结确认
    @ResponseBody
    @GetMapping("/bjqr")
    public ResultVo bjqr(String xybh){
        try {
            String bjqr = zjjgxService.bjqr(xybh);
            if (null != bjqr && bjqr.length() > 0){ //非空
                switch (bjqr){
                    case "1":
                        return new ResultVo(true, "办结确认成功");
                    case "2":
                        return new ResultVo(false, "流程未进行完，禁止办结确认操作");
                    case "3":
                        return new ResultVo(false, "协议已撤销，禁止办结确认操作");
                    case "4":
                        return new ResultVo(false, "协议已办结，禁止办结确认操作");
                }
            }
            return new ResultVo(false, "办结确认失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "后端数据出错，请重试");
        }
    }

}
