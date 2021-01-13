package com.gtmap.fundsupervision.myenum;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2021/1/13
 * @description 资金监管协议状态枚举类
 */
public enum ZjjgxyZtEnum {
    CAOGAO("101"),
    BIANGENGZHONG("103"),
    CHUCIQUEREN("201"),
    SHOUGONGCHEXIAO("301"),
    XITONGCHEXIAO("302"),
    JIAOYIJIESHU("303");

    private String code;

    ZjjgxyZtEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
