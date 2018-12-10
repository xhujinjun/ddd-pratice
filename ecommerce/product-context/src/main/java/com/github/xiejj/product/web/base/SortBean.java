package com.github.xiejj.product.web.base;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
public class SortBean {
    /** 排序列 */
    @ApiModelProperty(value="排序列")
    private String orderBy;
    /** 排序方向 */
    @ApiModelProperty(value="排序方向", allowableValues="ASC,DESC")
    private String orderType;
}
