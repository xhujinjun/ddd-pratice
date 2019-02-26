package com.github.xiejj.product.gateway.eventbus;

import com.github.xiejj.product.domain.category.event.CategoryCreateEvent;
import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Component
public class EventPublish {
    @Autowired
    private EventBus eventBus;

    public void publish(final CategoryCreateEvent categoryCreateEvent) {
        eventBus.post(categoryCreateEvent);
    }
}
