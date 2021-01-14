package com.gtmap.fundsupervision;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@EnableCaching
@SpringBootApplication
@MapperScan("com.gtmap.fundsupervision.mapper")
@ImportResource(locations = { "classpath:cxf/cxf.xml" })
public class FundSupervisionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FundSupervisionApplication.class, args);
    }

}
