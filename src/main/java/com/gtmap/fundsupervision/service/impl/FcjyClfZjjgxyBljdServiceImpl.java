package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyBljdEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgxyBljdMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjgxyBljdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/29
 * @description 资金监管协议办理进度
 */

@Service
public class FcjyClfZjjgxyBljdServiceImpl implements FcjyClfZjjgxyBljdService {

    @Autowired
    private FcjyClfZjjgxyBljdMapper fcjyClfZjjgxyBljdMapper;

    /**
     * 保存资金监管协议办理进度
     * @param fcjyClfZjjgxyBljdEntity
     */
    @Override
    public void insertZjjgxyBljd(FcjyClfZjjgxyBljdEntity fcjyClfZjjgxyBljdEntity) {
        fcjyClfZjjgxyBljdMapper.insertZjjgxyBljd(fcjyClfZjjgxyBljdEntity);
    }

    /**
     * 根据监管id查询
     * @param jgid
     * @return
     */
    @Override
    public FcjyClfZjjgxyBljdEntity findZjjgxyBljdByJgid(String jgid) {
        return fcjyClfZjjgxyBljdMapper.findZjjgxyBljdByJgid(jgid);
    }

    /**
     * 保存交款通知人和时间和情况
     * @param jgid
     * @param jktzsfsc
     * @param jktzscr
     * @param jktzscrq
     */
    @Override
    public void updateZjjgxyBljdByJktz(String jgid, String jktzsfsc, String jktzscr, String jktzscrq) {
        fcjyClfZjjgxyBljdMapper.updateZjjgxyBljdByJktz(jgid, jktzsfsc, jktzscr, jktzscrq);
    }

    /**
     * 保存交款确认人和时间和情况
     * @param jgid
     * @param jkqrsfqr
     * @param jkqrqrr
     * @param jkqrqrrq
     */
    @Override
    public void updateZjjgxyBljdByJkqr(String jgid, String jkqrsfqr, String jkqrqrr, String jkqrqrrq) {
        fcjyClfZjjgxyBljdMapper.updateZjjgxyBljdByJkqr(jgid, jkqrsfqr, jkqrqrr, jkqrqrrq);
    }

    /**
     * 保存协议撤销人和时间和情况
     * @param jgid
     * @param xycxsfcx
     * @param xycxcxr
     * @param xycxcxrq
     */
    @Override
    public void updateZjjgxyBljdByXycx(String jgid, String xycxsfcx, String xycxcxr, String xycxcxrq) {
        fcjyClfZjjgxyBljdMapper.updateZjjgxyBljdByXycx(jgid, xycxsfcx, xycxcxr, xycxcxrq);
    }

    /**
     * 保存生成支取凭证人和时间和情况
     * @param jgid
     * @param sczqpzsfsc
     * @param sczqpzscr
     * @param sczqpzscrq
     */
    @Override
    public void updateZjjgxyBljdByZqpz(String jgid, String sczqpzsfsc, String sczqpzscr, String sczqpzscrq) {
        fcjyClfZjjgxyBljdMapper.updateZjjgxyBljdByZqpz(jgid, sczqpzsfsc, sczqpzscr, sczqpzscrq);
    }

    /**
     * 保存支取确认人和时间和情况
     * @param jgid
     * @param zqqrsfqr
     * @param zqqrqrr
     * @param zqqrqrrq
     */
    @Override
    public void updateZjjgxyBljdByZqqr(String jgid, String zqqrsfqr, String zqqrqrr, String zqqrqrrq) {
        fcjyClfZjjgxyBljdMapper.updateZjjgxyBljdByZqqr(jgid, zqqrsfqr, zqqrqrr, zqqrqrrq);
    }

    /**
     * 保存办结确认状态、确认人、时间
     * @param jgid
     * @param bjqrsfbj
     * @param bjqrbjr
     * @param bjqrbjrq
     */
    @Override
    public void updateZjjgxyBljdByBjqr(String jgid, String bjqrsfbj, String bjqrbjr, String bjqrbjrq) {
        fcjyClfZjjgxyBljdMapper.updateZjjgxyBljdByBjqr(jgid, bjqrsfbj, bjqrbjr, bjqrbjrq);
    }
}
