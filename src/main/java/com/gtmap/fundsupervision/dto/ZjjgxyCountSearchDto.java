package com.gtmap.fundsupervision.dto;

import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/5
 * @description 资金监管协议统计查询条件dto
 */

@Data
public class ZjjgxyCountSearchDto {
    private String searchJyrq; //交易日期
    private String searchJsrq; //结束日期
    private String searchJgyh; //监管银行
    private String searchBldw; //办理单位
}
