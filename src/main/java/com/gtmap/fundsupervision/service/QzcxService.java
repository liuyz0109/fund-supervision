package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.QzcxVo;

import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/8
 * @description 权证查询服务层
 */

public interface QzcxService {

    //查询全部qzcxVo信息
    DataVo<QzcxVo> getAllQzcxVo(Integer page, Integer limit, Map<String, String> searchQzcx);

}
