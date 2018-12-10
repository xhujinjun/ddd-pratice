package com.github.xiejj.product.domain;

import lombok.Getter;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Getter
public enum EnableFlagEnum {
    Enable(1, "启用"),
    Disable(2,"禁用");
    private Integer code;

    private String value;

    EnableFlagEnum(final int code, final String value) {
        this.code = code;
        this.value = value;
    }
}
