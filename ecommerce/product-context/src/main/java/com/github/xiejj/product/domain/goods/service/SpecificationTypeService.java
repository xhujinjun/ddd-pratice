package com.github.xiejj.product.domain.goods.service;

import com.github.xiejj.product.domain.goods.model.Specification;
import com.github.xiejj.product.domain.goods.model.SpecificationType;
import com.github.xiejj.product.domain.goods.repository.SpecificationRepository;
import com.github.xiejj.product.domain.goods.repository.SpecificationTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Service
@Slf4j
public class SpecificationTypeService {

    @Autowired
    private SpecificationTypeRepository specificationTypeRepository;
    @Autowired
    private SpecificationRepository specificationRepository;

    public void save(SpecificationType specificationType){
        //check
        Boolean exist = specificationTypeRepository.exist(specificationType);
        if (exist){
            //抛出异常
        }

        //store
        specificationTypeRepository.store(specificationType);
    }

    public void modify(SpecificationType specificationType){
        specificationType.modfiy();
    }

    public void delete(Long id){
        // //方案1：这种情况下实体就需要status_flag
        // SpecificationType specificationType = specificationTypeRepository.getById(id);
        // specificationType.delete();
        // specificationTypeRepository.deleteById(specificationType.getId());

        //方案2：这种情况下实体就不需要status_flag
        Long count = specificationRepository.countByType(id);
        if (count > 0){
            log.error("");
        }else {
            specificationTypeRepository.deleteById(id);
        }

    }

    /**
     * 启用： 不需要考虑
     * @param id
     */
    public void enable(Long id){
        SpecificationType specificationType = specificationTypeRepository.getById(id);
        specificationType.enable();
        specificationTypeRepository.enableById(specificationType);
    }

    /**
     * 停用： 需要考虑规格类型下是否有规则
     * @param id
     */
    public void disable(Long id){
        SpecificationType specificationType = specificationTypeRepository.cascadeById(id);
        specificationType.disable();
        specificationTypeRepository.disable(specificationType);
    }
}
