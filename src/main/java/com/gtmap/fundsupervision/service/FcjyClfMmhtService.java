package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.entity.*;
import com.gtmap.fundsupervision.vo.*;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description 存量房买卖合同
 */
public interface FcjyClfMmhtService {

    //存量房买卖合同列表查询
    List<ClfMmhtListVo> findClfMmhtListVoByHtbh(String htbhOld);

    //存量房买卖合同Vo
    ZjjgxyDto findClfMmhtVoByHtbh(String htbh);

    //存量房买卖合同信息查询
    FcjyClfMmhtEntity findClfMmhtByHtbh(String htbh);

    //存量房买卖合同房屋权属概况
    FcjyClfMmhtFwqsgkEntity findFwqsgkByHtid(String htid);

    //根据合同编号获取存量房买卖合同主体
    List<FcjyClfMmhtZtEntity> findMmhtZtByHtbh(String htbh);

    //根据合同id获取存量房买卖房价款及支付方式
    FcjyClfMmhtCjjgfkfsEntity findCjjgfkfsByHtid(String htid);

    //根据合同id获取存量房买卖合同房屋交付
    FcjyClfMmhtFwjfEntity findFwjfByHtid(String htid);

    //根据产权账号获取房产信息
    List<FcxxVo> findFcxxVoByHtbh(String cqzh);

    //获取选择的房产信息
    ZJjgFcxxVo findZJjgFcxxVoByCqzh(String cqzh);

    //查询权证查询信息
    List<QzcxVo> findAllQzcxVo(Map<String, String> searchQzcx);
}
