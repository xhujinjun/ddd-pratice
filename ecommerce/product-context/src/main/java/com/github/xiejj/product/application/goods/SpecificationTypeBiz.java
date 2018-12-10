package com.github.xiejj.product.application.goods;
import com.github.xiejj.product.domain.DataOperator;

import com.github.xiejj.product.application.goods.model.SpecificationTypeCreateDto;
import com.github.xiejj.product.application.goods.model.SpecificationTypeModifyDto;
import com.github.xiejj.product.domain.goods.model.SpecificationType;
import com.github.xiejj.product.domain.goods.repository.SpecificationTypeRepository;
import com.github.xiejj.product.domain.goods.service.SpecificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Component
public class SpecificationTypeBiz {
    @Autowired
    private SpecificationTypeService specificationTypeService;
    @Autowired
    private SpecificationTypeRepository specificationTypeRepository;

    public boolean create(SpecificationTypeCreateDto specificationTypeCreateDto){
        SpecificationType specificationType = new SpecificationType();
        specificationType.setBrandId(specificationTypeCreateDto.getBrandId());
        specificationType.setName(specificationTypeCreateDto.getName());
        specificationType.setAliasName(specificationTypeCreateDto.getAliasName());
        specificationType.setSort(0);
        specificationType.setEnabledFlag(false);

        DataOperator dataOperator = new DataOperator();
        dataOperator.setCreatorId(specificationTypeCreateDto.getCreatorId());
        dataOperator.setCreatorName(specificationTypeCreateDto.getCreatorName());

        specificationType.setDataOperator(dataOperator);

        specificationTypeService.save(specificationType);

        //事件通知
        return false;
    }

    /**
     * 只是适合动态更新
     * @param specificationTypeModifyDto
     * @return
     */
    public SpecificationType modify(SpecificationTypeModifyDto specificationTypeModifyDto){
        SpecificationType specificationType = specificationTypeRepository.getById(specificationTypeModifyDto.getId());
        specificationType.setName(specificationTypeModifyDto.getName());
        specificationType.setAliasName(specificationTypeModifyDto.getAliasName());

        DataOperator dataOperator = new DataOperator();
        dataOperator.setUpdatorId(specificationTypeModifyDto.getUpdatorId());
        dataOperator.setUpdatorName(specificationTypeModifyDto.getUpdatorName());
        specificationType.setDataOperator(dataOperator);
        specificationTypeService.modify(specificationType);
        //事件通知
        return null;
    }

    public boolean enable(Long id){
        specificationTypeService.enable(id);
        //事件通知
        return true;
    }

    public boolean disable(Long id){
        specificationTypeService.disable(id);
        //事件通知
        return true;
    }
}
