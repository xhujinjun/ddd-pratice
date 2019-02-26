package com.github.xiejj.product.domain.category.event;

import lombok.Data;
import lombok.Getter;

import java.util.List;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public class CategoryOperationEvent extends Event{
    /**
     * 品牌id
     */
    protected Long brandIdenty;
    /**
     * 商品类别ids
     */
    protected List<Long> dishTypeIds;


    @Getter
    public enum OperateCategoryEnum {
        /**
         * 新增
         */
        ADD(1, "新增"),
        /**
         * 品牌修改
         */
        UPDATE(2, "修改"),
        /**
         * 删除
         */
        DELETE(3, "删除"),
        /**
         * 启用
         */
        ENABLE(4, "启用"),
        /**
         * 停用
         */
        DISABLE(5, "停用");

        private Integer backValue;
        private String viewValue;

        OperateCategoryEnum(Integer backValue, String viewValue) {
            this.backValue = backValue;
            this.viewValue = viewValue;
        }
    }

}
