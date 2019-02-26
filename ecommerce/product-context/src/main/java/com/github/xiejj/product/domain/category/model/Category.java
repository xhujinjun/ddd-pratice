package com.github.xiejj.product.domain.category.model;

import com.github.xiejj.product.domain.Aggregation;
import lombok.Data;

/**
 * 商品类目
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Data
public abstract class Category implements Aggregation {
    protected Long id;
    /**
     * 商品类型名称
     */
    protected String name;

    /**
     * 商品类别编码
     */
    protected String typeCode;

    /**
     * 商品类型别名
     */
    protected String aliasName;

    /**
     * 排序
     */
    protected Integer sort;

    /**
     * 商品分类描述
     */
    protected String desc;

    /**
     * 1:启用;2:停用
     */
    protected Boolean enabledFlag;

    public Category(){
    }

    /**
     * 启用商品类目
     */
    public abstract void enable();

    /**
     * 停用商品里面
     * @return 是否可以停用商品分类
     */
    public abstract boolean disable();

}
