package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyClfZjjghtEntity;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/24
 * @description 资金监管合同
 */
public interface FcjyClfZjjghtService {

    //保存资金监管合同
    void insertZjjght(FcjyClfZjjghtEntity fcjyClfZjjghtEntity);

    //根据监管id查询
    FcjyClfZjjghtEntity findZjjghtByJgid(String jgid);

}
