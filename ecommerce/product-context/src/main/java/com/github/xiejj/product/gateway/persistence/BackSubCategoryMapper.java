package com.github.xiejj.product.gateway.persistence;

import com.github.xiejj.product.domain.category.model.BackSubCategory;
import com.github.xiejj.product.domain.category.repository.BackSubCategoryRepository;
import com.github.xiejj.product.gateway.persistence.dao.DishBrandTypeDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public class BackSubCategoryMapper implements BackSubCategoryRepository {
    @Autowired
    private DishBrandTypeDao dishBrandTypeDao;

    @Override
    public BackSubCategory getById(final Long brandId, final Long Id) {
        return null;
    }

    @Override
    public void save(final BackSubCategory backSubCategory) {

    }

    @Override
    public void disable(final BackSubCategory backSubCategory) {

    }

    @Override
    public void enable(final BackSubCategory backCategory) {

    }
}
