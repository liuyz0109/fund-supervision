package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjgrzjlEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgrzjlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description
 */

@SpringBootTest
class FcjyClfZjjgrzjlServiceImplTest {

    @Autowired
    private FcjyClfZjjgrzjlMapper fcjyClfZjjgrzjlMapper;

    @Test
    void findZjjgrzjlByJgid() {
        FcjyClfZjjgrzjlEntity zjjgrzjlByJgid = fcjyClfZjjgrzjlMapper.findZjjgrzjlByJgid("10000");
        int i = 0;
    }
}