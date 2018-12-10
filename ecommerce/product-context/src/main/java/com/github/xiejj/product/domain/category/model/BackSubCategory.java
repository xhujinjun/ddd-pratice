package com.github.xiejj.product.domain.category.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 商品后端 - 子级类目
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Data
@Slf4j
public class BackSubCategory extends BackCategory {
    // /**
    //  * 父类目ID
    //  */
    // private Long parentId;

    /**
     * 父类目
     */
    private BackSupCategory backSupCategory;

    @Override
    public void modify() {

    }

    @Override
    public void enable() {
        if (!backSupCategory.getEnabledFlag()){
            log.error("先启用父类目！");
        }else {
            this.enabledFlag = true;
        }
    }

    @Override
    public boolean disable() {
        this.enabledFlag = false;
        return false;
    }
}
