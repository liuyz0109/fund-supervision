package com.gtmap.fundsupervision.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description 合同信息列表VO
 */

@Data
public class ClfMmhtListVo implements Serializable {
    private String htbh; //合同编号
    private String cqr; //产权人
    private String cqzl; //产权坐落
}
