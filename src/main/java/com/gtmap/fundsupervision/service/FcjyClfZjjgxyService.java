package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.dto.ZjjgxyCountSearchDto;
import com.gtmap.fundsupervision.dto.ZjjgxySearchDto;
import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyEntity;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.ZjjgxVo;
import com.gtmap.fundsupervision.vo.ZjjgxyCountVo;
import com.gtmap.fundsupervision.vo.ZjjgxyVo;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/18
 * @description 资金监管协议
 */
public interface FcjyClfZjjgxyService {

    /**
     * 获取资金监管协议总数量
     * @return
     */
    Integer getDataCount();

    /**
     * 获取资金监管协议全部数据
     * @return
     */
    List<FcjyClfZjjgxyEntity> getAllData();

    /**
     * 获取资金监管箱页面展示数据
     * @return
     */
    List<ZjjgxVo> getZjjgxVo(String searchDjbh,String searchXybh,String searchHtbh);

    /**
     * 保存资金监管协议
     * @param fcjyClfZjjgxyEntity
     */
    void insertZjjgxy(FcjyClfZjjgxyEntity fcjyClfZjjgxyEntity);

    /**
     * 根据监管id查询监管协议
     * @param jgid
     * @return
     */
    FcjyClfZjjgxyEntity findZjjgxyByJgid(String jgid);

    /**
     * 更新资金监管协议的状态zt
     * @param jgid
     */
    void updateZjjgxyByJgidToCx(String jgid);

    /**
     * 修改协议状态-支取确认
     * @param jgid
     * @param zt
     */
    void updateZjjgxyZtByJgid(String jgid, String zt);

    /**
     * 获取资金监管协议页面展示数据
     * @param page
     * @param limit
     * @param zjjgxySearchDto
     * @return
     */
    DataVo<ZjjgxyVo> findZjjgxyAll(Integer page, Integer limit, ZjjgxySearchDto zjjgxySearchDto);

    /**
     * 获取资金监管协议统计页面数据
     * @param page
     * @param limit
     * @return
     */
    DataVo<ZjjgxyCountVo> getZjjgxyCountData(Integer page, Integer limit, ZjjgxyCountSearchDto zjjgxyCountSearchDto);
}
