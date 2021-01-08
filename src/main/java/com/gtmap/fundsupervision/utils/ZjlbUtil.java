package com.gtmap.fundsupervision.utils;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/27
 * @description 证件类别数字转名称
 */
public class ZjlbUtil {

    public static String zjlbNumToString(String zjlb){

        String zjlbString = "其它";

        switch (zjlb){
            case "1":
                zjlbString = "身份证";
                break;
            case "2":
                zjlbString = "港澳台身份证";
                break;
        }

        return zjlbString;
    }

}
