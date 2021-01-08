package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjghtEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjghtMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjghtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/24
 * @description 资金监管合同
 */

@Service
public class FcjyClfZjjghtServiceImpl implements FcjyClfZjjghtService {

    @Autowired
    private FcjyClfZjjghtMapper fcjyClfZjjghtMapper;

    /**
     * 保存资金监管合同
     * @param fcjyClfZjjghtEntity
     */
    @Override
    public void insertZjjght(FcjyClfZjjghtEntity fcjyClfZjjghtEntity) {
        fcjyClfZjjghtMapper.insertZjjght(fcjyClfZjjghtEntity);
    }

    /**
     * 根据监管id查询
     * @param jgid
     * @return
     */
    @Override
    public FcjyClfZjjghtEntity findZjjghtByJgid(String jgid) {
        return fcjyClfZjjghtMapper.findZjjghtByJgid(jgid);
    }
}
