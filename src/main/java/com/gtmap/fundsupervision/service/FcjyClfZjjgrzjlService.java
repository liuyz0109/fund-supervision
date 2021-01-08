package com.gtmap.fundsupervision.service;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgrzjlEntity;

import java.sql.Date;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description 资金监管入账记录
 */
public interface FcjyClfZjjgrzjlService {

    //保存资金监管入账记录
    void insertZjjgrzjl(FcjyClfZjjgrzjlEntity fcjyClfZjjgrzjlEntity);

    //根据监管id查询监管入账记录
    FcjyClfZjjgrzjlEntity findZjjgrzjlByJgid(String jgid);

    //将缴纳的监管资金和银行流水号和实际操作时间保存到资金监管入账记录表中
    void updateZjjgrzjlByjgidToJkqr(String jgid, double zjgje, String yhlsh, Date date);

    //将支取的资金和银行流水号和操作时间保存到资金监管出账表中
    void updateZjjgrzjlByjgidToZqqr(String jgid, double zjgje, Integer yhlsh, Date date);

    //通过监管id，将缴费金额清空
    void updateZjjgrzjlByjgidToCx(String jgid, double je);
}
