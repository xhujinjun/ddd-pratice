package com.github.xiejj.product.domain.category.repository;

import com.github.xiejj.product.domain.category.model.BackSupCategory;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public interface BackSupCategoryRepository extends BaseRepository<BackSupCategory>{

    void disable(BackSupCategory backCategory);

    void enable(BackSupCategory backCategory);

    void modify(BackSupCategory backCategory);
}
