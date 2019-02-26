package com.github.xiejj.product.gateway.persistence.dao;

import com.github.xiejj.product.domain.category.model.BackSubCategory;
import com.github.xiejj.product.gateway.persistence.model.DishBrandType;

import java.util.List;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public class DishBrandTypeDao {
    public DishBrandType findById(final Long brandId, final Long id) {
        return null;
    }

    public List<Long> findByParentId(final Long brandId, final Long id) {
        return null;
    }

    public void disable(final Long brandId, final Long id) {

    }

    public Integer getBackSupCategorySort() {
        return 0;
    }

    public Integer getBackSubCategorySort() {
        return null;
    }

    public void save(final BackSubCategory backSubCategory) {

    }
}
