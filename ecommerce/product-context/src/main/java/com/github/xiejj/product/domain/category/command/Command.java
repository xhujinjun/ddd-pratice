package com.github.xiejj.product.domain.category.command;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-10
 */
@Data
public abstract class Command {
    protected Date date;

    protected ValidationResult validationResult;

    /**
     * 验证模型
     * @return
     */
    public abstract boolean isValid();

    @Data
    public static class ValidationResult {
        List<ErrorInfo> errors;
    }

    @Data
    public static class ErrorInfo {
        String errorMessage;
    }
}
