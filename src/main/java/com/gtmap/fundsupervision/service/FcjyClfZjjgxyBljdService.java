package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyBljdEntity;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/29
 * @description 资金监管协议办理进度
 */
public interface FcjyClfZjjgxyBljdService {

    //保存资金监管协议办理进度
    void insertZjjgxyBljd(FcjyClfZjjgxyBljdEntity fcjyClfZjjgxyBljdEntity);

    //根据监管id查询
    FcjyClfZjjgxyBljdEntity findZjjgxyBljdByJgid(String jgid);

    //保存交款通知人和时间和情况
    void updateZjjgxyBljdByJktz(String jgid,String jktzsfsc,String jktzscr,String jktzscrq);

    //保存交款确认人和时间和情况
    void updateZjjgxyBljdByJkqr(String jgid,String jkqrsfqr,String jkqrqrr,String jkqrqrrq);

    //保存协议撤销人和时间和情况
    void updateZjjgxyBljdByXycx(String jgid, String xycxsfcx, String xycxcxr, String xycxcxrq);

    //保存生成支取凭证人和时间和情况
    void updateZjjgxyBljdByZqpz(String jgid, String sczqpzsfsc, String sczqpzscr, String sczqpzscrq);

    //保存支取确认人和时间和情况
    void updateZjjgxyBljdByZqqr(String jgid, String zqqrsfqr, String zqqrqrr, String zqqrqrrq);

    //保存办结确认状态、确认人、时间
    void updateZjjgxyBljdByBjqr(String jgid, String bjqrsfbj, String bjqrbjr, String bjqrbjrq);
}
