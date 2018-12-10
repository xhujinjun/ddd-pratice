package com.github.xiejj.product.domain.category.model;

import lombok.Data;

/**
 * 商品后端 - 父级类目
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Data
public class FrontSupCategory extends FrontCategory {
    @Override
    public void modify() {

    }

    @Override
    public void enable() {

    }

    @Override
    public boolean disable() {
        return false;
    }
}
