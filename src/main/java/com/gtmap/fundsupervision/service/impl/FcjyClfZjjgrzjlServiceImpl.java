package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgrzjlEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgrzjlMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjgrzjlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description
 */

@Service
public class FcjyClfZjjgrzjlServiceImpl implements FcjyClfZjjgrzjlService {

    @Autowired
    private FcjyClfZjjgrzjlMapper fcjyClfZjjgrzjlMapper;

    /**
     * 保存资金监管入账记录
     * @param fcjyClfZjjgrzjlEntity
     */
    @Override
    public void insertZjjgrzjl(FcjyClfZjjgrzjlEntity fcjyClfZjjgrzjlEntity) {
        fcjyClfZjjgrzjlMapper.insertZjjgrzjl(fcjyClfZjjgrzjlEntity);
    }

    /**
     * 根据监管id查询监管入账记录
     * @param jgid
     * @return
     */
    @Override
    public FcjyClfZjjgrzjlEntity findZjjgrzjlByJgid(String jgid) {
        return fcjyClfZjjgrzjlMapper.findZjjgrzjlByJgid(jgid);
    }

    /**
     * 将缴纳的监管资金和银行流水号保存到资金监管入账记录表中
     * @param jgid
     * @param zjgje
     */
    @Override
    public void updateZjjgrzjlByjgidToJkqr(String jgid, double zjgje,String yhlsh, Date date) {
        fcjyClfZjjgrzjlMapper.updateZjjgrzjlByjgidToJkqr(jgid, zjgje,yhlsh,date);
    }

    /**
     * 将支取的资金和银行流水号和操作时间保存到资金监管出账表中
     * @param jgid
     * @param zjgje
     * @param yhlsh
     * @param date
     */
    @Override
    public void updateZjjgrzjlByjgidToZqqr(String jgid, double zjgje, Integer yhlsh, Date date) {
        fcjyClfZjjgrzjlMapper.updateZjjgrzjlByjgidToZqqr(jgid, zjgje, yhlsh, date);
    }

    /**
     * 通过监管id，将缴费金额清空
     * @param jgid
     * @param je
     */
    @Override
    public void updateZjjgrzjlByjgidToCx(String jgid, double je) {
        fcjyClfZjjgrzjlMapper.updateZjjgrzjlByjgidToCx(jgid, je);
    }
}
