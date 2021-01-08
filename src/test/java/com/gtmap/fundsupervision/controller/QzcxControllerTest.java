package com.gtmap.fundsupervision.controller;

import com.gtmap.fundsupervision.service.QzcxService;
import com.gtmap.fundsupervision.vo.DataVo;
import com.gtmap.fundsupervision.vo.QzcxVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/8
 * @description
 */
@SpringBootTest
class QzcxControllerTest {

    @Autowired
    private QzcxService qzcxService;

    @Test
    void getData() {

//        DataVo<QzcxVo> dataVo = qzcxService.getAllQzcxVo(1, 10, searchQzcx);
        int i =1 ;
    }
}