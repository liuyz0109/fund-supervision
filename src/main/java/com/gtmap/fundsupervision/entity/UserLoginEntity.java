package com.gtmap.fundsupervision.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/14
 * @description 登录用户实体类
 */

@Data
public class UserLoginEntity implements Serializable {
    private String id;
    private String username;
    private String password;
}
