package com.gtmap.fundsupervision.webservice;

import com.gtmap.fundsupervision.dto.XingYeBankZjjgxyDto;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/6
 * @description 兴业银行外部接口
 */

@WebService
public interface XingYeBankWebService {

    //获取全部协议的数据
    @WebMethod
    List<XingYeBankZjjgxyDto> getAllData();

}
