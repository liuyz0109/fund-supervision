package com.gtmap.fundsupervision.vo;

import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/5
 * @description 资金监管协议统计vo
 */

@Data
public class ZjjgxyCountVo {
    private String bldw; //办理单位
    private String jgyh; //监管银行
    private String jgsl; //监管数量
    private String jzmj; //建筑面积
    private String cjje; //成交金额
    private String jgje; //监管金额
    private String rzje; //入账金额
    private String zqje; //支取金额
    private String jyje; //结余金额-入账减去支取
    private String fx; //付息
}
