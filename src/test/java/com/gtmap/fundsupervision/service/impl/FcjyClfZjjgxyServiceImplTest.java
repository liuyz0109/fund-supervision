package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.mapper.FcjyClfZjjgxyMapper;
import com.gtmap.fundsupervision.service.FcjyClfZjjgxyService;
import com.gtmap.fundsupervision.vo.ZjjgxyCountVo;
import com.gtmap.fundsupervision.vo.ZjjgxyVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/5
 * @description
 */

@SpringBootTest
class FcjyClfZjjgxyServiceImplTest {

    @Autowired
    private FcjyClfZjjgxyMapper fcjyClfZjjgxyMapper;

    @Test
    void findZjjgxyAll() {

//        List<ZjjgxyVo> zjjgxyAll = fcjyClfZjjgxyMapper.findZjjgxyAll();

        int i = 1;
    }

    @Test
    void getZjjgxyCountData() {

//        List<ZjjgxyCountVo> zjjgxyCountVoList = fcjyClfZjjgxyMapper.getZjjgxyCountData();

        int i = 1;
    }
}