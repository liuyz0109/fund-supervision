package com.gtmap.fundsupervision.controller;

import com.gtmap.fundsupervision.dto.ZjjgxyDto;
import com.gtmap.fundsupervision.service.ZjjghtService;
import com.gtmap.fundsupervision.vo.ClfMmhtVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description
 */

@SpringBootTest
class ZjjghtControllerTest {

    @Autowired
    private ZjjghtService zjjghtService;

    @Test
    void findDataByHtbh() {
        zjjghtService.findClfMmhtVoByHtbh("20000");
        int t = 1;
    }

   
}