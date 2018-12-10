package com.github.xiejj.product.web.goods;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class SpecificationTypeScreenConditionRequest {
    @ApiModelProperty(value = "属性类别名称")
    private String keyword;

    @ApiModelProperty(value = "状态", allowableValues = "1,2")
    private Integer enabledFlag;
}
