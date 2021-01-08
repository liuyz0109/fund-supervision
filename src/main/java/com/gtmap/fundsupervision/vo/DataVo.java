package com.gtmap.fundsupervision.vo;

import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/15
 * @description layui-vo
 */
@Data
public class DataVo<T> {
    private Integer code; //响应码
    private String msg; //响应信息
    private Integer count; //数据总数量
    private List<T> data; //具体数据
}
