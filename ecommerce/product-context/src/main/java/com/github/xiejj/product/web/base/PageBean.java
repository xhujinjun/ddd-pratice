package com.github.xiejj.product.web.base;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
public class PageBean {
    /**
     * current page number
     */
    private int current = 1;

    /**
     * number of data items per page
     */
    private int pageSize = 10;

    /**
     * total number of data items
     */
    @ApiModelProperty(hidden = true)
    private long total;
}
