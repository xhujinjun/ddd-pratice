package com.github.xiejj.product.application.category.model;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public class ModifyCategoryDto {

    private Long categoryId;

    private Long parentId;

    private String name;

    private String aliasName;

    private String typeCode;

    private String dishTypeDesc;

    private Integer sort;

    private Long brandId;

    /**
     * 门店下操作必填
     */
    private Long shopId;

    /**
     * 操作者Id
     */
    private Long operatorId;

    /**
     * 操作者名称
     */
    private String operatorName;
}
