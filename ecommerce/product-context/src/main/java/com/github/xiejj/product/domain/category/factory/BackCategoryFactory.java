package com.github.xiejj.product.domain.category.factory;

import com.github.xiejj.product.application.category.model.CreateCategoryDto;
import com.github.xiejj.product.domain.category.model.BackCategory;
import com.github.xiejj.product.domain.category.model.BackSubCategory;
import com.github.xiejj.product.domain.category.model.BackSupCategory;
import com.github.xiejj.product.gateway.persistence.dao.DishBrandTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Component
public class BackCategoryFactory {
    @Autowired
    private DishBrandTypeDao dishBrandTypeDao;

    public BackCategory create(CreateCategoryDto createCategoryDto){
        BackCategory backCategory;
        if (createCategoryDto.getParentId() == null){
            backCategory = new BackSupCategory();
            backCategory.setBrandId(createCategoryDto.getBrandId());
            backCategory.setName(createCategoryDto.getName());
            backCategory.setTypeCode(StringUtils.isEmpty(createCategoryDto.getTypeCode()) ? getBackSupCategoryCode() : createCategoryDto.getTypeCode());
            backCategory.setAliasName(createCategoryDto.getAliasName());
            backCategory.setSort(createCategoryDto.getSort() == null ? getBackSupCategorySort() : createCategoryDto.getSort());
            backCategory.setDesc(createCategoryDto.getDishTypeDesc());
            backCategory.setEnabledFlag(true);

        }else {
            backCategory = new BackSubCategory();
            backCategory.setBrandId(createCategoryDto.getBrandId());
            backCategory.setName(createCategoryDto.getName());
            backCategory.setTypeCode(StringUtils.isEmpty(createCategoryDto.getTypeCode()) ? getBackSubCategoryCode() : createCategoryDto.getTypeCode());
            backCategory.setAliasName(createCategoryDto.getAliasName());
            backCategory.setSort(createCategoryDto.getSort() == null ? getBackSubCategorySort() : createCategoryDto.getSort());
            backCategory.setDesc(createCategoryDto.getDishTypeDesc());
            backCategory.setEnabledFlag(true);
        }
        return backCategory;
    }

    public Integer getBackSupCategorySort(){
        return dishBrandTypeDao.getBackSupCategorySort();
    }

    public Integer getBackSubCategorySort(){
        return dishBrandTypeDao.getBackSubCategorySort();
    }

    private String getBackSupCategoryCode(){
        return "";
    }

    private String getBackSubCategoryCode(){
        return "";
    }
}
