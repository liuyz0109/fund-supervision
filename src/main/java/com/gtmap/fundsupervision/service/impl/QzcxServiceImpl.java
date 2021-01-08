package com.gtmap.fundsupervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gtmap.fundsupervision.service.FcjyClfMmhtService;
import com.gtmap.fundsupervision.service.QzcxService;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.QzcxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/8
 * @description 权证查询服务层
 */

@Service
public class QzcxServiceImpl implements QzcxService {

    @Autowired
    private FcjyClfMmhtService fcjyClfMmhtService;

    /**
     * 查询全部qzcxVo信息
     * @param page
     * @param limit
     * @param searchQzcx
     * @return
     */
    @Override
    public DataVo<QzcxVo> getAllQzcxVo(Integer page, Integer limit, Map<String, String> searchQzcx) {
        //封装数据
        DataVo<QzcxVo> qzcxVoDataVo = new DataVo<>();
        qzcxVoDataVo.setCode(0);
        qzcxVoDataVo.setMsg("");

        //分页
        PageHelper.startPage(page, limit);

        //查询信息
        List<QzcxVo> allQzcxVo = fcjyClfMmhtService.findAllQzcxVo(searchQzcx);

        //进行pageInfo包装
        PageInfo<QzcxVo> pageInfo = new PageInfo<>(allQzcxVo);

        qzcxVoDataVo.setCount((int) pageInfo.getTotal());
        qzcxVoDataVo.setData(pageInfo.getList());

        return qzcxVoDataVo;
    }
}
