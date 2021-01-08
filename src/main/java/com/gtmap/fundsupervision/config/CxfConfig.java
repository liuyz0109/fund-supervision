package com.gtmap.fundsupervision.config;

import com.gtmap.fundsupervision.webservice.XingYeBankWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/7
 * @description cxf配置类
 */

@Configuration
public class CxfConfig {
    @Bean
    public ServletRegistrationBean newServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**
     * @return
     */
    @Bean
    @Qualifier("xingYeBankWebServiceImpl") // 注入webService
    public Endpoint endpoint(XingYeBankWebServiceImpl xingYeBankWebServiceImpl) {
        EndpointImpl endpoint = new EndpointImpl(springBus(), xingYeBankWebServiceImpl);
        endpoint.publish("/xingYeBank");// 暴露webService api,用在资源访问
        return endpoint;
    }

}
