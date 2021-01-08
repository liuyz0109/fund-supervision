package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.dto.ZjjgxyZhxxDto;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.JkmxjlVo;
import com.gtmap.fundsupervision.vo.ZjjgxVo;

import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/18
 * @description 资金监管箱
 */

public interface ZjjgxService {

    //首页面数据展示
    DataVo<ZjjgxVo> getData(String searchDjbh,String searchXybh,String searchHtbh,Integer page,Integer limit);

    //资金监管协议保存
    void saveZjjgxy(ZjjgxyDto zjjgxyDto);

    //获取交款明细头部数据
    Map<String,String> getzkmxHead(String xybh);

    //获取交款明细记录
    DataVo<JkmxjlVo> findJkmxByXybh(String xybh);

    //详情展示数据查询
    Map<String, String> zjjgxyByJgidToShow(String jgid);

    //撤销资金监管协议
    Map<String, String> updateZjjgxyByJgidToCx(String jgid);

    //支取确认
    String zqqr(String jgid);

    //协议账户信息修改
    void updateZjjgxyZhxx(ZjjgxyZhxxDto zjjgxyZhxxDto);

    //查询办理进度
    Map<String, String> findBljdByJgid(String jgid);

    //交款通知
    String jktz(String jgid);

    //交款确认
    String jkqr(String jgid);

    //生成支取凭证
    String zqpz(String jgid);

    //支取明细头部数据
    Map<String, String> getzqmxHead(String jgid);

    //支取明细记录数据
    DataVo<JkmxjlVo> findZqmxByXybh(String jgid);

    //买方退款和撤销
    Map<String, String> mftkCx(String jgid,String cxmm);
}
