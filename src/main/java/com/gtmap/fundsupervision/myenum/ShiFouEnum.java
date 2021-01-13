package com.gtmap.fundsupervision.myenum;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/13
 * @description 是否枚举类
 */
public enum ShiFouEnum {
    FOU("0"),
    SHI("1");

    private String code;

    ShiFouEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
