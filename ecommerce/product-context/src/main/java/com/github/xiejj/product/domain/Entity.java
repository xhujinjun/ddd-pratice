package com.github.xiejj.product.domain;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
public interface Entity<T> {

    boolean sameIdentityAs(T other);

    // /**
    //  * 数据状态标识： 1:启用 2:禁用
    //  *
    //  * 个人觉得实体不应该有这个字段
    //  */
    // protected Boolean statusFlag;
}
