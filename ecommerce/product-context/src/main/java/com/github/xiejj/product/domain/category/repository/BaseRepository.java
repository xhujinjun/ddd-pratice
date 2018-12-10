package com.github.xiejj.product.domain.category.repository;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
public interface BaseRepository<T> {
    /**
     * 根据ID, 获取商品类目
     */
    T getById(Long brandId, Long Id);

    void save(T backCategory);
}
