package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjghtZtEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjghtZtMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjghtZtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/24
 * @description 资金监管合同主体
 */

@Service
public class FcjyClfZjjghtZtServiceImpl implements FcjyClfZjjghtZtService {

    @Autowired
    private FcjyClfZjjghtZtMapper fcjyClfZjjghtZtMapper;

    /**
     * 保存资金监管合同主体
     * @param fcjyClfZjjghtZtEntity
     */
    @Override
    public void insertZjjghtZt(FcjyClfZjjghtZtEntity fcjyClfZjjghtZtEntity) {
        fcjyClfZjjghtZtMapper.insertZjjghtZt(fcjyClfZjjghtZtEntity);
    }

    /**
     * 根据监管id查询监管合同主体
     * @param jgid
     * @return
     */
    @Override
    public List<FcjyClfZjjghtZtEntity> findZjjghtZtByJgid(String jgid) {
        return fcjyClfZjjghtZtMapper.findZjjghtZtByJgid(jgid);
    }

    /**
     * 更新资金监管合同主体信息
     * @param jgid
     * @param ztlb
     * @param yh
     * @param zh
     */
    @Override
    public void updateZjjghtZtByJgid(String jgid, String ztlb, String yh, String zh) {
        fcjyClfZjjghtZtMapper.updateZjjghtZtByJgid(jgid,ztlb,yh,zh);
    }
}
