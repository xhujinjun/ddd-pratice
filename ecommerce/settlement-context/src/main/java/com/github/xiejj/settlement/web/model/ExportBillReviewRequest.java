package com.github.xiejj.settlement.web.model;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Data
public class ExportBillReviewRequest {
    /**
     * 模版名称
     */
    private String templateName;
    /**
     * 账单号
     */
    private Integer billNumber;
}
