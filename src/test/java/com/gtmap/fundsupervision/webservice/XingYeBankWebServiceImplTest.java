package com.gtmap.fundsupervision.webservice;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgxyMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/7
 * @description
 */

@SpringBootTest
class XingYeBankWebServiceImplTest {

    @Autowired
    protected FcjyClfZjjgxyMapper fcjyClfZjjgxyMapper;

    @Test
    void getAllData() {
        List<FcjyClfZjjgxyEntity> allData = fcjyClfZjjgxyMapper.getAllData();
        int i = 1;
    }
}