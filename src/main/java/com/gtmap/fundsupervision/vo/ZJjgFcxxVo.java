package com.gtmap.fundsupervision.vo;

import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/4
 * @description 资金监管房产信息vo
 */

@Data
public class ZJjgFcxxVo {
    private String sqbh; //申请编号
    private String ywlxone; //业务类型one
    private String ywlxtwo; //业务类型two

    //FCJY_CLF_MMHT_ZT  ztlb = '1'
    private String salexm; //卖方姓名
    private String salelxfs; //卖方联系方式
    private String salesfzh; //卖方身份证号
    private String salewtr; //卖方委托人
    private String salewtrlxfs; //卖方委托人联系方式

    //FCJY_CLF_MMHT_ZT  ztlb = '0'
    private String buyxm; //买方姓名
    private String buylxfs; //买方联系方式
    private String buysfzh; //买方身份证号
    private String buywtr; //买方委托人
    private String buywtrlxfs; //买方委托人联系方式

    //FCJY_CLF_MMHT
    private String cqzh; //产权证号
    private String fwzl; //房屋坐落

    private String djjg; //登记机构
    private String slr; //受理人
    private String sjrq; //收件日期

    //FCJY_CLF_MMHT_CJJGFKFS
    private String mmzj; //买卖总价
    private String chdk; //偿还贷款
    private String buydk; //买方贷款
    private String jgje; //监管金额
}
