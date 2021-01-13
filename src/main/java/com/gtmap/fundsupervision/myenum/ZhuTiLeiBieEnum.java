package com.gtmap.fundsupervision.myenum;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/13
 * @description 主体类别枚举类
 */
public enum ZhuTiLeiBieEnum {
    BUY("0"),
    SALE("1");

    private String code;

    ZhuTiLeiBieEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
