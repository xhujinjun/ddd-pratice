package com.github.xiejj.product.domain.category.model;
import com.google.common.collect.Lists;
import java.util.Date;

import com.github.xiejj.product.domain.category.event.CategoryCreateEvent;
import com.github.xiejj.product.domain.category.event.CategoryModifyEvent;
import com.github.xiejj.product.domain.category.event.Event;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 商品后端 - 子级类目
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Data
@Slf4j
public class BackSubCategory extends BackCategory {
    private List<Event> events;
    // /**
    //  * 父类目ID
    //  */
    // private Long parentId;

    /**
     * 父类目
     */
    private BackSupCategory backSupCategory;

    public BackSubCategory(){
        CategoryCreateEvent categoryCreateEvent = new CategoryCreateEvent();
        events.add(categoryCreateEvent);
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

    public void clearEvents() {
        this.events = null;
    }

    @Override
    public <T extends BackCategory> void modify(final T backCategory) {
        //修改
        this.name = backCategory.name;

        //事件
        CategoryModifyEvent event = new CategoryModifyEvent();
        event.setOperation(0);
        event.setBrandIdenty(0L);
        event.setDishTypeIds(Lists.newArrayList());
        event.setUuid("");
        event.setCreatedTime(new Date());
        events.add(event);
    }
}
