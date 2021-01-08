package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.entity.FcjyClfZjjghtEntity;
import com.gtmap.fundsupervision.vo.ClfMmhtListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description 资金监管合同
 */

@Mapper
public interface FcjyClfZjjghtMapper {

    List<ClfMmhtListVo> getDataByHtbh(String htbhOld);

    //保存资金监管合同
    void insertZjjght(FcjyClfZjjghtEntity fcjyClfZjjghtEntity);

    //根据监管id查询
    FcjyClfZjjghtEntity findZjjghtByJgid(String jgid);

}
