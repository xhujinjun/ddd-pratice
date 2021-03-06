package com.github.xiejj.product.domain.category.event;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public class CategoryDeleteEvent extends CategoryOperationEvent {
    private int operation = OperateCategoryEnum.DELETE.getBackValue();
}
