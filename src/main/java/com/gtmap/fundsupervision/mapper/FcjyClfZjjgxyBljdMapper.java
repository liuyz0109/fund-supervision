package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyBljdEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/29
 * @description 资金监管协议办理进度
 */

@Mapper
public interface FcjyClfZjjgxyBljdMapper {
    //保存资金监管协议办理进度
    void insertZjjgxyBljd(FcjyClfZjjgxyBljdEntity fcjyClfZjjgxyBljdEntity);

    //根据监管id查询
    FcjyClfZjjgxyBljdEntity findZjjgxyBljdByJgid(String jgid);

    //保存交款通知人和时间和情况
    void updateZjjgxyBljdByJktz(@Param("jgid") String jgid,@Param("jktzsfsc") String jktzsfsc,@Param("jktzscr") String jktzscr,@Param("jktzscrq") String jktzscrq);

    //保存交款确认人和时间和情况
    void updateZjjgxyBljdByJkqr(@Param("jgid") String jgid,@Param("jkqrsfqr") String jkqrsfqr,@Param("jkqrqrr") String jkqrqrr,@Param("jkqrqrrq") String jkqrqrrq);

    //保存协议撤销人和时间和情况
    void updateZjjgxyBljdByXycx(@Param("jgid") String jgid,@Param("xycxsfcx") String xycxsfcx,@Param("xycxcxr") String xycxcxr,@Param("xycxcxrq") String xycxcxrq);

    //保存生成支取凭证人和时间和情况
    void updateZjjgxyBljdByZqpz(@Param("jgid") String jgid,@Param("sczqpzsfsc") String sczqpzsfsc,@Param("sczqpzscr") String sczqpzscr,@Param("sczqpzscrq") String sczqpzscrq);

    //保存支取确认人和时间和情况
    void updateZjjgxyBljdByZqqr(@Param("jgid") String jgid,@Param("zqqrsfqr") String zqqrsfqr,@Param("zqqrqrr") String zqqrqrr,@Param("zqqrqrrq") String zqqrqrrq);

    //保存办结确认状态、确认人、时间
    void updateZjjgxyBljdByBjqr(@Param("jgid") String jgid,@Param("bjqrsfbj") String bjqrsfbj,@Param("bjqrbjr") String bjqrbjr,@Param("bjqrbjrq") String bjqrbjrq);
}
