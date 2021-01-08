package com.gtmap.fundsupervision.dto;

import com.gtmap.fundsupervision.utils.ZjlbUtil;
import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/28
 * @description 协议账户信息dto
 */

@Data
public class ZjjgxyZhxxDto {
    private String zt; //协议状态
    private String xybh; //协议编号--监管id
    private String djbh; //登记编号--监管编号
    private String htzje; //合同总金额
    private String zjgje; //总监管金额
    private String qdxyrq; //签订日期
    private String htbh; //合同编号
    private String fwzl; //房屋坐落
    private String fwmj; //房屋面积
    private String buyxm; //买方姓名
    private String buyzjlb; //买方证件类别
    private String buyzjhm; //买方证件号码
    private String buyyh; //买方退款银行
    private String buyzh; //买方账户
    private String salexm; //卖方姓名
    private String salzjlb; //卖方证件类别
    private String salezjhm; //卖方证件号码
    private String saleyh; //卖方收款银行
    private String salezh; //卖方账户
}
