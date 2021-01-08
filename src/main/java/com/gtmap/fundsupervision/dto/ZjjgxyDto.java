package com.gtmap.fundsupervision.dto;

import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description 资金监管协议创建dto
 */

@Data
public class ZjjgxyDto {
    private String htbh; //合同编号
    private String qzlx; //权证类型
    private String qzhm; //权证号码
    private String xybh; //协议编号
    private String htrq; //合同日期
    private String djbh; //登记编号

    private String slzl; //受理坐落
    private String jzmj; //建筑面积
    private String cjjg; //成交价格
    private String fkfs; //付款方式
    private String sfje; //首付金额
    private String dkyh; //贷款银行-
    private String dkje; //贷款金额

    private String jfxm; //甲方姓名
    private String jfdh; //甲方电话
    private String jfzjlx; //甲方证件类型
    private String jfzjhm; //甲方证件号码
    private String jfzz; //甲方住址
    private String jfbwtr; //甲方被委托人
    private String jfbwtrzjlx; //甲方被委托人证件类型
    private String jfbwtrzjhm; //甲方被委托人证件号码

    private String yfxm; //乙方姓名
    private String yfdh; //乙方电话
    private String yfzjlx; //乙方证件类型
    private String yfzjhm; //乙方证件号码
    private String yfzz; //乙方住址
    private String yfbwtr; //乙方被委托人
    private String yfbwtrzjlx; //乙方被委托人证件类型
    private String yfbwtrzjhm; //乙方被委托人证件号码

    private String jgzje; //监管资金额

    private String jgkhh; //监管开户行
    private String jszh; //监管开户行结算账户
    private String jfkhh; //甲方开户行
    private String jfjszh; //甲方开户行结算账户
}
