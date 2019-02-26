package com.github.xiejj.product.domain.category.event;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public abstract class Event {
    private String uuid;

    private Date createdTime;

    public Event(){
        this.uuid = UUID.randomUUID().toString();
        this.createdTime = new Date();
    }
}
