package com.gtmap.fundsupervision.webservice.impl;

import com.gtmap.fundsupervision.dto.XingYeBankZjjgxyDto;
import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgxyMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/6
 * @description
 */

@SpringBootTest
class XingYeBankWebServiceImplTest {
    @Autowired
    private FcjyClfZjjgxyMapper fcjyClfZjjgxyMapper;

    @Test
    void getAllData() {
        List<XingYeBankZjjgxyDto> list = new ArrayList<>();
        List<FcjyClfZjjgxyEntity> allData = fcjyClfZjjgxyMapper.getAllData();
        for (FcjyClfZjjgxyEntity fcjyClfZjjgxyEntity : allData){
            XingYeBankZjjgxyDto xingYeBankZjjgxyDto = new XingYeBankZjjgxyDto();
            xingYeBankZjjgxyDto.setXybh(fcjyClfZjjgxyEntity.getJgid()); //协议编号
            xingYeBankZjjgxyDto.setJgje(fcjyClfZjjgxyEntity.getZjgje() + ""); //监管金额
            list.add(xingYeBankZjjgxyDto);
        }
        int i = 1;
    }

    @Test
    void testGetAllData() {
    }
}