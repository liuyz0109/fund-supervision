package com.gtmap.fundsupervision.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.dto.ZjjgxyZhxxDto;
import com.gtmap.fundsupervision.service.ZjjgxService;
import com.gtmap.fundsupervision.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
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

    //首页面展示数据
    @ResponseBody
    @GetMapping("/getData")
    public DataVo<ZjjgxVo> getData(Integer page, Integer limit,HttpSession session) {
        //从session中读取数据
        String searchDjbh = (String) session.getAttribute("searchDjbh");
        String searchXybh = (String) session.getAttribute("searchXybh");
        String searchHtbh = (String) session.getAttribute("searchHtbh");
        DataVo<ZjjgxVo> data = zjjgxService.getData(searchDjbh, searchXybh, searchHtbh, page, limit);
        //读取完成后,清空session中的值
        session.setAttribute("searchDjbh","");
        session.setAttribute("searchXybh","");
        session.setAttribute("searchHtbh","");

        return data;
    }

    //弹出资金监管协议添加页面
    @GetMapping("/zjjgxyAdd")
    public String zjjgxyAdd() {
        return "index/zjjgxy-add";
    }

    //资金监管协议保存
    @ResponseBody
    @PostMapping("/saveZjjgxy")
    public ResultVo saveZjjgxy(ZjjgxyDto zjjgxyDto, Model model) {
        try {
            zjjgxService.saveZjjgxy(zjjgxyDto);
            return new ResultVo(true, "协议保存成功");
        } catch (Exception e) {
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
            if ("0".equals(map.get("sfjczj"))){ //无缴存资金
                return new ResultVo(true, "撤销成功（无缴存记录）",map);
            }else if ("1".equals(map.get("sfjczj"))){
                return new ResultVo(true, "撤销成功（有缴存记录）",map);
            }else {
                return new ResultVo(false, "撤销失败，请重试");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(false, "撤销失败，请重试");
        }
    }

    //保存查询条件到session
    @ResponseBody
    @GetMapping("/searchData")
    public ResultVo searchData(String searchDjbh,String searchXybh,String searchHtbh,HttpSession session){
        try {
            session.setAttribute("searchDjbh",searchDjbh);
            session.setAttribute("searchXybh",searchXybh);
            session.setAttribute("searchHtbh",searchHtbh);
            return new ResultVo(true, "查询条件设置成功");
        }catch (Exception e) {
            e.printStackTrace();
            return new ResultVo(false, "查询条件设置错误");
        }
    }

    //修改协议状态-支取确认
    @ResponseBody
    @GetMapping("/zqqr")
    public ResultVo zqqr(String xybh){
        try {
            String zqqr = zjjgxService.zqqr(xybh);
            if ("1".equals(zqqr)) {
                return new ResultVo(true, "支取确认完成");
            }else if ("2".equals(zqqr)){
                return new ResultVo(false, "请先进行支取凭证生成，再重试");
            }else if ("3".equals(zqqr)){
                return new ResultVo(false, "支取已完成，请勿重复提交确认");
            }else if ("4".equals(zqqr)){
                return new ResultVo(false, "监管协议已撤销或完结，取消操作");
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
    public ResultVo zhxxSave(ZjjgxyZhxxDto zjjgxyZhxxDto,HttpSession session){
        try {
            //获取登录用户信息
            UserDataVo userDataVo = (UserDataVo) session.getAttribute("userDataVo");
            List<String> permissions = userDataVo.getPermissions(); //权限
            for (String permission : permissions){
                if (null == permission && 0 == permission.length()){
                    return new ResultVo(false, "用户权限不足，请联系管理员");
                }
                if (permission.equals("permission3")){ //拥有permission3的权限用户才能修改账户信息
                    //协议账户信息修改
                    String zhxx = zjjgxService.updateZjjgxyZhxx(zjjgxyZhxxDto);
                    if("1".equals(zhxx)) {
                        return new ResultVo(true, "账户信息修改完成");
                    }else if ("2".equals(zhxx)){
                        return new ResultVo(false, "存在交款信息，禁止修改账户信息");
                    }else if ("3".equals(zhxx)){
                        return new ResultVo(false, "该协议已被撤销或完结，禁止修改账户信息");
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
            if ("1".equals(jktz)) {
                return new ResultVo(true, "交款通知成功");
            }else if ("4".equals(jktz)){
                return new ResultVo(false, "监管协议已撤销或完结，取消操作");
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
            if ("1".equals(jkqr)) {
                return new ResultVo(true, "交款确认成功");
            }else if ("2".equals(jkqr)){
                return new ResultVo(false, "请先推送交款通知后，再重试");
            }else if ("3".equals(jkqr)){
                return new ResultVo(false, "交款已完成，请勿重复提交确认");
            }else if ("4".equals(jkqr)){
                return new ResultVo(false, "监管协议已撤销或完结，取消操作");
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
            if ("1".equals(zqpz)) {
                return new ResultVo(true, "生成支取凭证成功");
            }else if ("2".equals(zqpz)){
                return new ResultVo(false, "请先进行交款确认，再重试");
            }else if ("3".equals(zqpz)){
                return new ResultVo(false, "监管协议已撤销或完结，取消操作");
            }
            return new ResultVo(false, "生成支取凭证失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "生成支取凭证失败，请重试");
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
            if (null == mftkCx || mftkCx.length() == 0){ //数据为空
                return new ResultVo(false, "买方退款和撤销失败，请重试");
            }
            if ("1".equals(mftkCx)){
                return new ResultVo(true, "买方退款和撤销成功");
            }
            if ("2".equals(mftkCx)){
                return new ResultVo(false, "存在卖方支取行为，禁止操作");
            }
            if ("3".equals(mftkCx)){
                return new ResultVo(false, "撤销密码错误，请重试");
            }
            return new ResultVo(false, "买方退款和撤销失败，请重试");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false, "买方退款和撤销失败，请重试");
        }
    }

    //帮助文档下载
    @GetMapping("/helpDownload")
    public void helpDownload(HttpServletRequest request, HttpServletResponse response){
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

}
