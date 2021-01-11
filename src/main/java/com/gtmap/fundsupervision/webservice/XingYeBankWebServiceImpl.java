package com.gtmap.fundsupervision.webservice;

import com.gtmap.fundsupervision.dto.XingYeBankZjjgxyDto;
import com.gtmap.fundsupervision.entity.FcjyClfZjjgxyEntity;
import com.gtmap.fundsupervision.mapper.FcjyClfZjjgxyMapper;
import com.gtmap.fundsupervision.utils.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/6
 * @description 兴业银行外部接口实现类
 */

@Service
@WebService(endpointInterface="com.gtmap.fundsupervision.webservice.XingYeBankWebService") //webservice接口全类名
public class XingYeBankWebServiceImpl implements XingYeBankWebService {

    //spring使用
    @Autowired
    private FcjyClfZjjgxyMapper fcjyClfZjjgxyMapper;

    /**
     * 获取全部协议的数据
     * @return
     */
    @Override
    public List<XingYeBankZjjgxyDto> getAllData() {
        List<XingYeBankZjjgxyDto> list = new ArrayList<>();
        List<FcjyClfZjjgxyEntity> allData = fcjyClfZjjgxyMapper.getAllData(); //数据获取
        //数据封装
        for (FcjyClfZjjgxyEntity fcjyClfZjjgxyEntity : allData){
            XingYeBankZjjgxyDto xingYeBankZjjgxyDto = new XingYeBankZjjgxyDto();
            xingYeBankZjjgxyDto.setXybh(fcjyClfZjjgxyEntity.getJgid()); //协议编号
            xingYeBankZjjgxyDto.setJgje(fcjyClfZjjgxyEntity.getZjgje() + ""); //监管金额
            list.add(xingYeBankZjjgxyDto);
        }
        return list;
    }
}
