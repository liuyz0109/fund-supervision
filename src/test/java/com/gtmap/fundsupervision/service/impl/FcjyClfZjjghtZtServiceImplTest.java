package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyClfZjjghtZtEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjghtZtMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description
 */

@SpringBootTest
class FcjyClfZjjghtZtServiceImplTest {

    @Autowired
    private FcjyClfZjjghtZtMapper fcjyClfZjjghtZtMapper;

    @Test
    void findZjjghtZtByJgid() {
        List<FcjyClfZjjghtZtEntity> dcf37ddd5eae82e26b6748b81e8db2d8 = fcjyClfZjjghtZtMapper.findZjjghtZtByJgid("dcf37ddd5eae82e26b6748b81e8db2d8");

        int i=0;
    }
}