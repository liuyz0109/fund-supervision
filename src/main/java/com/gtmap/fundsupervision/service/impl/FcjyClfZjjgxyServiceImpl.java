package com.gtmap.fundsupervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gtmap.fundsupervision.dto.ZjjgxyCountSearchDto;
import com.gtmap.fundsupervision.dto.ZjjgxySearchDto;
import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgxyMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjgxyService;
import com.gtmap.fundsupervision.utils.ZjjgxyZtUtil;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.ZjjgxVo;
import com.gtmap.fundsupervision.vo.ZjjgxyCountVo;
import com.gtmap.fundsupervision.vo.ZjjgxyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/18
 * @description 资金监管协议
 */

@Service
public class FcjyClfZjjgxyServiceImpl implements FcjyClfZjjgxyService {

    @Autowired
    private FcjyClfZjjgxyMapper fcjyClfZjjgxyMapper;

    /**
     * 获取资金监管协议总数量
     * @return
     */
    @Override
    public Integer getDataCount() {
        return fcjyClfZjjgxyMapper.getDataCount();
    }

    /**
     * 获取资金监管协议全部数据
     * @return
     */
    @Override
    public List<FcjyClfZjjgxyEntity> getAllData() {
        return fcjyClfZjjgxyMapper.getAllData();
    }

    /**
     * 获取资金监管箱页面展示数据
     * @return
     */
    @Override
    public List<ZjjgxVo> getZjjgxVo(String searchDjbh,String searchXybh,String searchHtbh) {
        return fcjyClfZjjgxyMapper.getZjjgxVo(searchDjbh,searchXybh,searchHtbh);
    }

    /**
     * 保存资金监管协议
     * @param fcjyClfZjjgxyEntity
     */
    @Override
    public void insertZjjgxy(FcjyClfZjjgxyEntity fcjyClfZjjgxyEntity) {
        fcjyClfZjjgxyMapper.insertZjjgxy(fcjyClfZjjgxyEntity);
    }

    /**
     * 根据监管id查询监管协议
     * @param jgid
     * @return
     */
    @Override
    public FcjyClfZjjgxyEntity findZjjgxyByJgid(String jgid) {
        return fcjyClfZjjgxyMapper.findZjjgxyByJgid(jgid);
    }

    /**
     * 更新资金监管协议的状态zt
     * @param jgid
     */
    @Override
    public void updateZjjgxyByJgidToCx(String jgid) {
        fcjyClfZjjgxyMapper.updateZjjgxyByJgidToCx(jgid);
    }

    /**
     * 修改协议状态-支取确认
     * @param jgid
     * @param zt
     */
    @Override
    public void updateZjjgxyZtByJgid(String jgid, String zt) {
        fcjyClfZjjgxyMapper.updateZjjgxyZtByJgid(jgid, zt);
    }

    /**
     * 获取资金监管协议页面展示数据
     * @param page
     * @param limit
     * @param zjjgxySearchDto
     * @return
     */
    @Override
    public DataVo<ZjjgxyVo> findZjjgxyAll(Integer page, Integer limit, ZjjgxySearchDto zjjgxySearchDto) {
        //封装数据
        DataVo<ZjjgxyVo> zjjgxyVoDataVo = new DataVo<>();
        zjjgxyVoDataVo.setCode(0);
        zjjgxyVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);

        //获取数据
        List<ZjjgxyVo> zjjgxyVoList = fcjyClfZjjgxyMapper.findZjjgxyAll(zjjgxySearchDto);

        //协议状态转换
        for (ZjjgxyVo zjjgxyVo : zjjgxyVoList){
            String xyzt = ZjjgxyZtUtil.zjjgxyZtNumToString(zjjgxyVo.getXyzt());
            zjjgxyVo.setXyzt(xyzt);
            //监管账号数据加  \t    导出时不转换为科学计数
            String s = zjjgxyVo.getJgzh() + "\t";
            zjjgxyVo.setJgzh(s);
        }

        //进行pageInfo包装
        PageInfo<ZjjgxyVo> pageInfo = new PageInfo<>(zjjgxyVoList);
        List<ZjjgxyVo> list = pageInfo.getList();

        zjjgxyVoDataVo.setCount((int) pageInfo.getTotal());
        zjjgxyVoDataVo.setData(list);

        return zjjgxyVoDataVo;
    }

    /**
     * 获取资金监管协议统计页面数据
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataVo<ZjjgxyCountVo> getZjjgxyCountData(Integer page, Integer limit, ZjjgxyCountSearchDto zjjgxyCountSearchDto) {
        //封装数据
        DataVo<ZjjgxyCountVo> zjjgxyCountVoDataVo = new DataVo<>();
        zjjgxyCountVoDataVo.setCode(0);
        zjjgxyCountVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);

        //获取数据
        List<ZjjgxyCountVo> zjjgxyCountVoList = fcjyClfZjjgxyMapper.getZjjgxyCountData(zjjgxyCountSearchDto);

        //数据封装
        for (ZjjgxyCountVo zjjgxyCountVo : zjjgxyCountVoList){
            zjjgxyCountVo.setJgsl("1"); //监管数量
            zjjgxyCountVo.setJyje(Double.parseDouble(zjjgxyCountVo.getRzje()) - Double.parseDouble(zjjgxyCountVo.getZqje()) + ""); //结余金额-入账减去支取
            zjjgxyCountVo.setFx("0"); //付息
        }

        //进行pageInfo包装
        PageInfo<ZjjgxyCountVo> pageInfo = new PageInfo<>(zjjgxyCountVoList);
        List<ZjjgxyCountVo> list = pageInfo.getList();

        zjjgxyCountVoDataVo.setCount((int) pageInfo.getTotal());
        zjjgxyCountVoDataVo.setData(list);

        return zjjgxyCountVoDataVo;
    }
}
