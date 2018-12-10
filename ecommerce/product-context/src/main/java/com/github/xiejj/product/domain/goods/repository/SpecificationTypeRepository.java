package com.github.xiejj.product.domain.goods.repository;

import com.github.xiejj.product.domain.goods.model.SpecificationType;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
public interface SpecificationTypeRepository {

    SpecificationType getById(Long id);

    boolean deleteById(Long id);

    void enableById(SpecificationType id);

    SpecificationType cascadeById(Long id);

    void disable(SpecificationType specificationType);

    Boolean exist(SpecificationType specificationType);

    /**
     * 存储
     * @param specificationType
     */
    void store(SpecificationType specificationType);
}
