package com.github.xiejj.product.domain;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class DataOperator {
    /**
     * 创建者id
     */
    private Long creatorId;

    /**
     * 创建者名称
     */
    private String creatorName;

    /**
     * 更新者id
     */
    private Long updatorId;

    /**
     * 最后修改者姓名
     */
    private String updatorName;
}
