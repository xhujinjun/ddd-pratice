package com.github.xiejj.product.domain.category.event;

import com.github.xiejj.product.domain.category.event.CategoryOperationEvent.OperateCategoryEnum;
import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public class CategoryEnbaleEvent {
    private int operation = OperateCategoryEnum.ENABLE.getBackValue();
}
