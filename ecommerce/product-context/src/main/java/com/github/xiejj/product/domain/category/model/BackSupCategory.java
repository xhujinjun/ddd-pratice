package com.github.xiejj.product.domain.category.model;

import lombok.Data;

import java.util.List;

/**
 * 商品后端 - 父级类目
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Data
public class BackSupCategory extends BackCategory {
    /**
     * 子类目ID
     */
    private List<Long> subId;

    @Override
    public void enable() {

    }

    @Override
    public boolean disable() {
        if (subId != null && subId.size()>0){
            return false;
        }
        this.enabledFlag = false;
        return true;
    }

    @Override
    public <T extends BackCategory> void modify(final T backCategory) {

    }
}
