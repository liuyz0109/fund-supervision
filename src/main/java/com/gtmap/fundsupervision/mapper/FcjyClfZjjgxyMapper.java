package com.gtmap.fundsupervision.mapper;

import com.gtmap.fundsupervision.dto.ZjjgxyCountSearchDto;
import com.gtmap.fundsupervision.dto.ZjjgxySearchDto;
import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyEntity;
import com.gtmap.fundsupervision.vo.ZjjgxVo;
import com.gtmap.fundsupervision.vo.ZjjgxyCountVo;
import com.gtmap.fundsupervision.vo.ZjjgxyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/18
 * @description 资金监管协议
 */

@Component
@Mapper
public interface FcjyClfZjjgxyMapper {

    //获取总数
    Integer getDataCount();

    //获取全部数据
    List<FcjyClfZjjgxyEntity> getAllData();

    //获取资金监管箱页面展示数据
    List<ZjjgxVo> getZjjgxVo(@Param("searchDjbh") String searchDjbh,@Param("searchXybh") String searchXybh,@Param("searchHtbh") String searchHtbh);

    //保存资金监管协议
    void insertZjjgxy(FcjyClfZjjgxyEntity fcjyClfZjjgxyEntity);

    //根据监管id查询监管协议
    FcjyClfZjjgxyEntity findZjjgxyByJgid(String jgid);

    //更新资金监管协议的状态zt
    void updateZjjgxyByJgidToCx(String jgid);

    //修改协议状态-支取确认
    void updateZjjgxyZtByJgid(@Param("jgid") String jgid,@Param("zt") String zt);

    //获取资金监管协议页面展示数据
    List<ZjjgxyVo> findZjjgxyAll(ZjjgxySearchDto zjjgxySearchDto);

    //获取资金监管协议统计页面数据
    List<ZjjgxyCountVo> getZjjgxyCountData(ZjjgxyCountSearchDto zjjgxyCountSearchDto);

}
