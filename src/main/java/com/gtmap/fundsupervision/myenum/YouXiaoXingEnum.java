package com.gtmap.fundsupervision.myenum;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/13
 * @description 有效性枚举
 */
public enum  YouXiaoXingEnum {
    YOUXIAO("1"),
    WUXIAO("2");

    private String code;

    YouXiaoXingEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
