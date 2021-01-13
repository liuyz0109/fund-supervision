package com.gtmap.fundsupervision.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/17
 * @description 登录用户user的账户id,用户姓名username,权限permission,角色role
 */

@Data
public class UserDataVo implements Serializable {
    private String id;
    private String username;
    private List<String> permissions;
    private List<String> roles;
}
