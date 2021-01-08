package com.gtmap.fundsupervision.vo;

import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/5
 * @description 资金监管协议vo
 */

@Data
public class ZjjgxyVo {
    private String djbh; //登记编号
    private String xybh; //协议编号
    private String ywxx; //业务细项
    private String zrf; //转让方
    private String srf; //受让方
    private String zqr; //支取人
    private String fwzl; //房屋坐落
    private String qzhm; //权证号码
    private String jgzh; //监管账号
    private String jgje; //监管金额
    private String htbh; //合同编号
    private String dqblr; //当前办理人
    private String bldw; //办理单位
    private String qdrq; //签订日期
    private String xyzt; //协议状态
    private String jgyh; //监管银行
}
