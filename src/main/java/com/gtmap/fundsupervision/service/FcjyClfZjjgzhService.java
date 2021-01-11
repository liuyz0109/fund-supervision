package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgzhEntity;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description 资金监管账户
 */
public interface FcjyClfZjjgzhService {

    //保存资金监管账户
    void insertZjjgzh(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity);

    //将资金保存在买方监管账户中
    void updateZjjghtByBuy(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity);

    //将资金从买方监管账户中取出
    void updateZjjghtByBuyOut(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntityBuy);

    //将资金在卖方监管账户中存入
    void updateZjjghtBySaleIn(FcjyClfZjjgzhEntity fcjyClfZjjgzhEntity);

}
