package com.github.xiejj.product.domain.category.repository;

import com.github.xiejj.product.domain.category.model.BackCategory;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public interface BackCategoryRepository extends BaseRepository<BackCategory>{

    void disable(Long brandId, Long Id);
}
