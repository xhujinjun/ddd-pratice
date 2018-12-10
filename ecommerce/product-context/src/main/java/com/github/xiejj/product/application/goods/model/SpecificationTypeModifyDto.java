package com.github.xiejj.product.application.goods.model;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class SpecificationTypeModifyDto {
    private Long id;

    private Long brandId;

    private String name;

    private String aliasName;

    private Long updatorId;

    private String updatorName;
}
