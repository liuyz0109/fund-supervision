package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgzhEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgzhMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjgzhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description
 */

@Service
public class FcjyClfZjjgzhServiceImpl implements FcjyClfZjjgzhService {

    @Autowired
    private FcjyClfZjjgzhMapper fcjyClfZjjgzhMapper;

    /**
     * 保存资金监管账户
     * @param fcjyClfZjjgzhEntity
     */
    @Override
    public void insertZjjgzh(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity) {
        fcjyClfZjjgzhMapper.insertZjjgzh(fcjyClfZjjgzhEntity);
    }

    /**
     * 将资金保存在买方监管账户中
     * @param fcjyClfZjjgzhEntity
     */
    @Override
    public void updateZjjghtByBuy(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity) {
        fcjyClfZjjgzhMapper.updateZjjghtByBuy(fcjyClfZjjgzhEntity);
    }

    /**
     * 将资金从买方监管账户中取出
     * @param fcjyClfZjjgzhEntityBuy
     */
    @Override
    public void updateZjjghtByBuyOut(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntityBuy) {
        fcjyClfZjjgzhMapper.updateZjjghtByBuyOut(fcjyClfZjjgzhEntityBuy);
    }

    /**
     * 将资金在卖方监管账户中存入
     * @param fcjyClfZjjgzhEntity
     */
    @Override
    public void updateZjjghtBySaleIn(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity) {
        fcjyClfZjjgzhMapper.updateZjjghtBySaleIn(fcjyClfZjjgzhEntity);
    }
}
