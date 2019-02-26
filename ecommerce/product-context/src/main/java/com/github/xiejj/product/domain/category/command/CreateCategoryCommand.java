package com.github.xiejj.product.domain.category.command;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public class CreateCategoryCommand extends CategoryCommand {
    private Long brandId;

    /**
     * 门店下操作必填
     */
    private Long shopId;

    /**
     * 操作者Id
     */
    private Long operatorId;

    /**
     * 操作者名称
     */
    private String operatorName;

    private Long parentId;

    private String name;

    private String aliasName;

    private String typeCode;

    private String dishTypeDesc;

    private Integer sort;

    public CreateCategoryCommand(){

    }
    @Override
    public boolean isValid() {
        return false;
    }
}
