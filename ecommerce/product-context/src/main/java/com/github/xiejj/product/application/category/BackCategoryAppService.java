package com.github.xiejj.product.application.category;

import com.github.xiejj.product.application.category.model.DisableCategoryDto;
import com.github.xiejj.product.application.category.model.EnableCategoryDto;
import com.github.xiejj.product.domain.category.model.BackCategory;
import com.github.xiejj.product.domain.category.model.BackSubCategory;
import com.github.xiejj.product.domain.category.model.BackSupCategory;
import com.github.xiejj.product.domain.category.repository.BackCategoryRepository;
import com.github.xiejj.product.domain.category.repository.BackSubCategoryRepository;
import com.github.xiejj.product.domain.category.repository.BackSupCategoryRepository;
import com.github.xiejj.product.web.category.model.CreatCategoryCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Service
public class BackCategoryAppService {

    @Autowired
    private BackCategoryRepository backCategoryRepository;

    @Autowired
    private BackSubCategoryRepository backSubCategoryRepository;

    @Autowired
    private BackSupCategoryRepository backSupCategoryRepository;

    public void createCategory(final CreatCategoryCommand creatCategoryCommand) {
        BackCategory backCategory;
        if (creatCategoryCommand.getParentId() == null){
            backCategory = new BackSupCategory();
            backSupCategoryRepository.save((BackSupCategory) backCategory);
        }else {
            backCategory = new BackSubCategory();
            backSubCategoryRepository.save((BackSubCategory) backCategory);
        }
    }

    /**
     * 停用商品类目
     */
    @Transactional(rollbackFor = Throwable.class)
    public void disable(final DisableCategoryDto disableCategoryDto) {
        BackCategory backCategory = backCategoryRepository.getById(disableCategoryDto.getBranId(), disableCategoryDto.getCategoryId());
        backCategory.disable();
        if (backCategory instanceof BackSupCategory){
            backSupCategoryRepository.disable((BackSupCategory) backCategory);
        }
        if (backCategory instanceof BackSubCategory){
            backSubCategoryRepository.disable((BackSubCategory) backCategory);
        }
    }

    /**
     * 启用商品类目
     */
    @Transactional(rollbackFor = Throwable.class)
    public void enable(final EnableCategoryDto enableCategoryDto) {
        BackCategory backCategory = backCategoryRepository.getById(enableCategoryDto.getBranId(), enableCategoryDto.getCategoryId());
        backCategory.enable();
        if (backCategory instanceof BackSupCategory){
            backSupCategoryRepository.enable((BackSupCategory) backCategory);
        }
        if (backCategory instanceof BackSubCategory){
            backSubCategoryRepository.enable((BackSubCategory) backCategory);
        }
    }
}
