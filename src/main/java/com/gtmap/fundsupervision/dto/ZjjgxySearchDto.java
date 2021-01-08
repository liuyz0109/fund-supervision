package com.gtmap.fundsupervision.dto;

import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/5
 * @description 资金监管协议查询条件
 */

@Data
public class ZjjgxySearchDto {
     private String searchQdrq; //签订日期
     private String searchJsrq; //结束日期
     private String searchXybh; //协议编号
     private String searchZrf; //转让方
     private String searchSrf; //受让方
     private String searchDjbh; //登记编号
     private String searchXyzt; //协议状态
     private String searchJgyh; //监管银行
     private String searchHtbh; //合同编号
}
