package com.gtmap.fundsupervision.webservice;

import com.alibaba.fastjson.JSON;
import com.gtmap.fundsupervision.dto.XingYeBankZjjgxyDto;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/7
 * @description 兴业银行客户端
 */

public class XingYeBankClient {

    public static void main(String[] args) throws Exception {
        String wsdl = "http://192.168.0.168:8080/cxf/xingYeBank/getAllData?wsdl";
        String TargetNamespace = "http://webservice.fundsupervision.gtmap.com/";
        String methodName = "getAllData";

        //创建动态客户端
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient(wsdl);

        //客户端执行方法
        Object[] invoke = client.invoke(new QName(TargetNamespace, methodName));

        String string = JSON.toJSON(invoke).toString();
        string = string.substring(1, string.length() - 1); //json格式化[{},{}]
        //数据封装
        List<XingYeBankZjjgxyDto> list = JSON.parseArray(string, XingYeBankZjjgxyDto.class);
        for (XingYeBankZjjgxyDto x : list)
            System.out.println(x.getXybh() + "----------" + x.getJgje());
    }

}
