package com.gtmap.fundsupervision.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/23
 * @description 性别判断 id必须为18位身份证 1-男性 2-女性 3-不详
 */
public class SfzhCheckUtil {

    public static String sexCheck(String id){
        if (id.length() != 18){
            return "3";
        }
        String sex = id.substring(16, 17);
        int i = Integer.parseInt(sex);
        if (i < 0 || i > 1){
            return "3";
        }else if (i % 2 == 0){
            return "2";
        }else {
            return "1";
        }
    }

    public static Date birthdayCheck(String id){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (id.length() != 18){
                return sdf.parse("1970-01-01");
            }
            String birthday = id.substring(6, 10) + "-" + id.substring(10, 12) + "-" + id.substring(12, 14);
            Date parseDate = sdf.parse(birthday);
            return parseDate;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
