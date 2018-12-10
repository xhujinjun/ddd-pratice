package com.github.xiejj.product.domain.category.model;

import lombok.Data;

/**
 * 商品后端类目
 *
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Data
public abstract class BackCategory extends Category{
    protected Long brandId;
}
