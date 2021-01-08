package com.gtmap.fundsupervision.utils;

import java.util.UUID;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/24
 * @description UUID工具类
 */
public class UuidUtil {

    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static Integer getUuidNum(){
        Integer uuidNum=UUID.randomUUID().toString().hashCode();
        uuidNum = uuidNum < 0 ? -uuidNum : uuidNum; //String.hashCode() 值会为空
        return uuidNum;
    }

}
