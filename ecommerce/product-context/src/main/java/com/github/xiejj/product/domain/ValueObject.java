package com.github.xiejj.product.domain;

import java.io.Serializable;

/**
 * 值对象
 *
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
public interface ValueObject <T> extends Serializable {
    boolean sameValueAs(T other);
}
