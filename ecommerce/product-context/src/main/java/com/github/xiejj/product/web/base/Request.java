package com.github.xiejj.product.web.base;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class Request<T> {
    @NotNull
    private Long brandId;

    /**
     * 门店下操作必填
     */
    private Long shopId;

    /**
     * 请求内容
     */
    @Valid
    private T content;

    /**
     * 操作者Id
     */
    private Long operatorId;

    /**
     * 操作者名称
     */
    private String operatorName;
}
