package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgczjlEntity;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/30
 * @description 资金监管出账记录
 */
public interface FcjyClfZjjgczjlService {

    //保存资金监管出账记录
    void insertZjjgczjl(FcjyClfZjjgczjlEntity fcjyClfZjjgczjlEntity);

    //根据监管id资金监管出账记录
    FcjyClfZjjgczjlEntity findZjjgczjlByJgid(String jgid);
}
