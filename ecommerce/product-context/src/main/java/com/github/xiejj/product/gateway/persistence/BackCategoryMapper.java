package com.github.xiejj.product.gateway.persistence;

import com.github.xiejj.product.domain.category.model.BackCategory;
import com.github.xiejj.product.domain.category.model.BackSubCategory;
import com.github.xiejj.product.domain.category.model.BackSupCategory;
import com.github.xiejj.product.domain.category.repository.BackCategoryRepository;
import com.github.xiejj.product.gateway.persistence.dao.DishBrandTypeDao;
import com.github.xiejj.product.gateway.persistence.model.DishBrandType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public class BackCategoryMapper implements BackCategoryRepository {
    @Autowired
    private DishBrandTypeDao dishBrandTypeDao;

    @Override
    public BackCategory getById(final Long brandId, final Long id) {
        DishBrandType dishBrandType = dishBrandTypeDao.findById(brandId, id);
        if (dishBrandType.getParentId() == null){
            List<Long> ids = dishBrandTypeDao.findByParentId(brandId, id);
            BackSupCategory backSupCategory = new BackSupCategory();
            backSupCategory.setSubId(ids);
            return backSupCategory;
        }else {
            return new BackSubCategory();
        }
    }

    @Override
    public void save(final BackCategory backCategory) {

    }

    @Override
    public void disable(final Long brandId, final Long Id) {

    }
}
