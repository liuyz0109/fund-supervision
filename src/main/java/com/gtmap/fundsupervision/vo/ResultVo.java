package com.gtmap.fundsupervision.vo;

import lombok.Data;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/24
 * @description 返回结果类
 */

@Data
public class ResultVo<T> {
    private boolean success;
    private String msg;
    private T data;

    public ResultVo(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResultVo(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }
}
