package com.gtmap.fundsupervision.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/22
 * @description 合同信息-创建协议使用VO
 */

@Data
public class ClfMmhtVo implements Serializable {
    private String htbh; //合同编号
    private String qzlx; //权证类型
    private String qzhm; //权证号码
    private String htrq; //合同日期
    private String slzl; //受理坐落
    private String jzmj; //建筑面积
}
