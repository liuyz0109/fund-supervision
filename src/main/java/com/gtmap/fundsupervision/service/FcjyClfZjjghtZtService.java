package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyClfZjjghtZtEntity;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/24
 * @description 资金监管合同主体
 */
public interface FcjyClfZjjghtZtService {

    //保存资金监管合同主体
    void insertZjjghtZt(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity);

    //根据监管id查询监管合同主体
    List<FcjyClfZjjghtZtEntity> findZjjghtZtByJgid(String jgid);

    //更新资金监管合同主体信息
    void updateZjjghtZtByJgid(String jgid, String buyZtlb, String buyyh, String buyzh);
}
