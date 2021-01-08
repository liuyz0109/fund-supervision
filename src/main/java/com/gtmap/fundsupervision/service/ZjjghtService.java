package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.vo.*;

import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description
 */
public interface ZjjghtService {

    //存量房买卖合同列表查询
    DataVo<ClfMmhtListVo> findClfMmhtListVoByHtbh(Integer page, Integer limit, String htbhOld);

    //存量房买卖合同Vo查询并验证
    ZjjgxyDto findClfMmhtVoByHtbh(String htbh);

    //获取房产信息
    DataVo<FcxxVo> findFcxxByCqzh(Integer page, Integer limit, String cqzhOld);

    //获取选择的房产信息
    ZJjgFcxxVo findZJjgFcxxVoByCqzh(String cqzh);
}
