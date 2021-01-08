package com.gtmap.fundsupervision.utils;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/28
 * @description 资金监管协议状态码转汉字
 */
public class ZjjgxyZtUtil {

    public static String zjjgxyZtNumToString(String ztNum){

        String zjjgxyZtString = "状态码异常";

        switch (ztNum){
            case "101":
                zjjgxyZtString = "草稿";
                break;
            case "103":
                zjjgxyZtString = "变更中";
                break;
            case "201":
                zjjgxyZtString = "初次确认";
                break;
            case "301":
                zjjgxyZtString = "手工撤销";
                break;
            case "302":
                zjjgxyZtString = "系统撤销";
                break;
            case "303":
                zjjgxyZtString = "交易结束";
                break;
        }

        return zjjgxyZtString;
    }

}
