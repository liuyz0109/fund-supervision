package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgrzjlEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description
 */

@Mapper
public interface FcjyClfZjjgrzjlMapper {

    //保存资金监管入账记录
    void insertZjjgrzjl(FcjyClfZjjgrzjlEntity fcjyClfZjjgrzjlEntity);

    //根据监管id查询监管入账记录
    FcjyClfZjjgrzjlEntity findZjjgrzjlByJgid(String jgid);

    //将缴纳的监管资金和银行流水号保存到资金监管入账记录表中
    void updateZjjgrzjlByjgidToJkqr(@Param("jgid") String jgid, @Param("zjgje") double zjgje, @Param("yhlsh") String yhlsh, @Param("date")Date date);

    //将支取的资金和银行流水号和操作时间保存到资金监管出账表中
    void updateZjjgrzjlByjgidToZqqr(@Param("jgid") String jgid,@Param("zjgje") double zjgje,@Param("yhlsh") Integer yhlsh,@Param("date") Date date);

    //通过监管id，将缴费金额清空
    void updateZjjgrzjlByjgidToCx(@Param("jgid") String jgid,@Param("je") double je);
}
