package com.gtmap.fundsupervision;

import com.gtmap.fundsupervision.utils.SfzhCheckUtil;
import com.gtmap.fundsupervision.utils.UuidUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

@SpringBootTest
class FundSupervisionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void safsa(){
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        int i = 1;
    }

    @Test
    void dasd() throws ParseException {
        Date date = SfzhCheckUtil.birthdayCheck("610303199501012615");
        int o = 1;
    }

    @Test
    void fas(){
        String uuid32bit = UuidUtil.getUuid();
        Integer uuidNum = UuidUtil.getUuidNum();

        int i = 1;
    }

    @Test
    void fasfas(){

    }

}
