package com.github.xiejj.product.application.category;

import com.github.xiejj.product.application.category.model.CreateCategoryDto;
import com.github.xiejj.product.application.category.model.DisableCategoryDto;
import com.github.xiejj.product.application.category.model.EnableCategoryDto;
import com.github.xiejj.product.application.category.model.ModifyCategoryDto;
import com.github.xiejj.product.domain.category.command.Command.ErrorInfo;
import com.github.xiejj.product.domain.category.command.CreateCategoryCommand;
import com.github.xiejj.product.domain.category.event.CategoryCreateEvent;
import com.github.xiejj.product.domain.category.factory.BackCategoryFactory;
import com.github.xiejj.product.domain.category.model.BackCategory;
import com.github.xiejj.product.domain.category.model.BackSubCategory;
import com.github.xiejj.product.domain.category.model.BackSupCategory;
import com.github.xiejj.product.domain.category.repository.BackCategoryRepository;
import com.github.xiejj.product.domain.category.repository.BackSubCategoryRepository;
import com.github.xiejj.product.domain.category.repository.BackSupCategoryRepository;
import com.github.xiejj.product.gateway.eventbus.EventPublish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private BackCategoryFactory backCategoryFactory;

    /**
     * 创建商品类目
     */
    public void createCategory(final CreateCategoryCommand createCategoryCommand) {
        //check
        List<String> errorInfos = new ArrayList<>();
        if (!createCategoryCommand.isValid()){
            for (ErrorInfo errorInfo : createCategoryCommand.getValidationResult().getErrors()){
                errorInfos.add(errorInfo.getErrorMessage());
            }
            return;
        }

        //创建类目
        BackCategory backCategory = backCategoryFactory.create(createCategoryCommand);
        if (backCategory instanceof BackSupCategory) {
            backSupCategoryRepository.save((BackSupCategory) backCategory);
        } else if (backCategory instanceof BackSubCategory) {
            backSubCategoryRepository.save((BackSubCategory) backCategory);
        }
        //通知
    }

    /**
     * 修改商品类目
     */
    public void modifyCategory(final ModifyCategoryDto modifyCategoryDto) {
        //check
        //修改
        BackCategory backCategory = backCategoryRepository
                .getById(modifyCategoryDto.getBrandId(), modifyCategoryDto.getCategoryId());


        if (backCategory instanceof BackSupCategory) {
            BackSupCategory modifyBackSupCategory = new BackSupCategory();
            backCategory.modify(modifyBackSupCategory);
            backSupCategoryRepository.modify((BackSupCategory) backCategory);
        } else if (backCategory instanceof BackSubCategory) {
            BackCategory modifyBackSubCategory = new BackSubCategory();
            backCategory.modify(modifyBackSubCategory);
            backSubCategoryRepository.modify((BackSubCategory) backCategory);
        }
    }

    /**
     * 停用商品类目
     */
    @Transactional(rollbackFor = Throwable.class)
    public void disable(final DisableCategoryDto disableCategoryDto) {
        BackCategory backCategory = backCategoryRepository
                .getById(disableCategoryDto.getBranId(), disableCategoryDto.getCategoryId());
        backCategory.disable();
        if (backCategory instanceof BackSupCategory) {
            backSupCategoryRepository.disable((BackSupCategory) backCategory);
        }
        if (backCategory instanceof BackSubCategory) {
            backSubCategoryRepository.disable((BackSubCategory) backCategory);
        }
    }

    /**
     * 启用商品类目
     */
    @Transactional(rollbackFor = Throwable.class)
    public void enable(final EnableCategoryDto enableCategoryDto) {
        BackCategory backCategory = backCategoryRepository
                .getById(enableCategoryDto.getBranId(), enableCategoryDto.getCategoryId());
        backCategory.enable();
        if (backCategory instanceof BackSupCategory) {
            backSupCategoryRepository.enable((BackSupCategory) backCategory);
        }
        if (backCategory instanceof BackSubCategory) {
            backSubCategoryRepository.enable((BackSubCategory) backCategory);
        }
    }


}
