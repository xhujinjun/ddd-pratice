package com.github.xiejj.product.domain.category.repository;

import com.github.xiejj.product.domain.category.model.BackSubCategory;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public interface BackSubCategoryRepository extends BaseRepository<BackSubCategory>{
    void save(BackSubCategory backSubCategory);

    void disable(BackSubCategory backSubCategory);

    void enable(BackSubCategory backCategory);
}
