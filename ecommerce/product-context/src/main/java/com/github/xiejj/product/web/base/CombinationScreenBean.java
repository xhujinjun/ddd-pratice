package com.github.xiejj.product.web.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class CombinationScreenBean<T> {

    @ApiModelProperty("分页对象")
    PageBean pageBean;

    @ApiModelProperty("排序对象")
    SortBean sortBean;

    @ApiModelProperty("筛选条件")
    private T condition;
}
