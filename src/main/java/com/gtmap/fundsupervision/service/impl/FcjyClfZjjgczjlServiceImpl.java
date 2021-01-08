package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgczjlEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgczjlMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjgczjlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/30
 * @description 资金监管出账记录
 */

@Service
public class FcjyClfZjjgczjlServiceImpl implements FcjyClfZjjgczjlService {

    @Autowired
    private FcjyClfZjjgczjlMapper fcjyClfZjjgczjlMapper;

    /**
     * 保存资金监管出账记录
     * @param fcjyClfZjjgczjlEntity
     */
    @Override
    public void insertZjjgczjl(FcjyClfZjjgczjlEntity fcjyClfZjjgczjlEntity) {
        fcjyClfZjjgczjlMapper.insertZjjgczjl(fcjyClfZjjgczjlEntity);
    }

    /**
     * 根据监管id资金监管出账记录
     * @param jgid
     * @return
     */
    @Override
    public FcjyClfZjjgczjlEntity findZjjgczjlByJgid(String jgid) {
        return fcjyClfZjjgczjlMapper.findZjjgczjlByJgid(jgid);
    }
}
