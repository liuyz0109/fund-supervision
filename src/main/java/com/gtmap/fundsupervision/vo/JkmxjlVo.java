package com.gtmap.fundsupervision.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/25
 * @description 交款明细记录Vo
 */

@Data
public class JkmxjlVo implements Serializable {
    private String jkrq;
    private String jkje;
    private String pos;
    private String ljjkje;
    private String sfwcjk;
    private String yhjyls;
}
