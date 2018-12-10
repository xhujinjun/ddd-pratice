package com.github.xiejj.product.application.category.model;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public class EnableCategoryDto {
    /**
     * 品牌ID
     */
    private Long branId;

    /**
     * 商品类目ID
     */
    private Long categoryId;

    /**
     * 操作者Id
     */
    private Long operatorId;

    /**
     * 操作者名称
     */
    private String operatorName;
}
