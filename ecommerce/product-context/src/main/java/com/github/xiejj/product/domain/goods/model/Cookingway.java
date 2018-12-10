package com.github.xiejj.product.domain.goods.model;

import com.github.xiejj.product.domain.DataOperator;
import com.github.xiejj.product.domain.Entity;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 做法
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class Cookingway  {

    private Long id;

    private String uuid;
    /**
     * 品牌标识
     */
    private Long brandId;

    /**
     * 属性类别id
     */
    private Long cookingwayTypeId;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 别名
     */
    private String aliasName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 价格
     */
    private BigDecimal reprice;

    /**
     * 是否被固化：1 是，固化后不允许被修改 2否
     */
    private Boolean isCure;

    /**
     * 启用标识：1:启用;2:停用
     */
    private Integer enabledFlag;

    /**
     * 数据操作者
     */
    private DataOperator dataOperator;
}
