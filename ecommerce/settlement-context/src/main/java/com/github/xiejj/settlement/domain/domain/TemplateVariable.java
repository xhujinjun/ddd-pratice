package com.github.xiejj.settlement.domain.domain;

import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Data
public class TemplateVariable {
    private int rowIndex;
    private int cellNum;
    private String replaceValue;

    public TemplateVariable(final int rowIndex, final int cellNum, final String replaceValue) {
        this.cellNum = cellNum;
        this.rowIndex = rowIndex;
        this.replaceValue = replaceValue;
    }
}
