package com.github.xiejj.product.gateway.persistence;

import com.github.xiejj.product.domain.category.event.CategoryCreateEvent;
import com.github.xiejj.product.domain.category.event.Event;
import com.github.xiejj.product.domain.category.model.BackSubCategory;
import com.github.xiejj.product.domain.category.repository.BackSubCategoryRepository;
import com.github.xiejj.product.gateway.eventbus.EventPublish;
import com.github.xiejj.product.gateway.persistence.dao.DishBrandTypeDao;
import com.github.xiejj.product.gateway.persistence.dao.EventDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public class BackSubCategoryMapper implements BackSubCategoryRepository {
    @Autowired
    private DishBrandTypeDao dishBrandTypeDao;
    @Autowired
    private EventDao eventDao;
    @Autowired
    private EventPublish eventBus;
    @Override
    public BackSubCategory getById(final Long brandId, final Long Id) {
        return null;
    }

    @Override
    public void save(final BackSubCategory backSubCategory) {
        dishBrandTypeDao.save(backSubCategory);
        List<Event> events = backSubCategory.getEvents();
        eventDao.batchSave(events);

        events.forEach(event -> eventBus.publish((CategoryCreateEvent) event));
        backSubCategory.clearEvents();
    }

    @Override
    public void disable(final BackSubCategory backSubCategory) {

    }

    @Override
    public void enable(final BackSubCategory backCategory) {

    }

    @Override
    public void modify(final BackSubCategory backCategory) {

    }
}
