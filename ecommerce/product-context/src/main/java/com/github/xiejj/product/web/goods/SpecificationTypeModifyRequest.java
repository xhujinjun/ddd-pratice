package com.github.xiejj.product.web.goods;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class SpecificationTypeModifyRequest {

    @NotNull
    @ApiModelProperty(value = "规格类别主键Id")
    private Long id;

    @ApiModelProperty(value = "规格类别名称",required=true)
    @Length(max=20,message="名称长度小于20")
    private String name;

    @ApiModelProperty(value = "第二语言")
    @Length(max=20,message="名称长度小于20")
    private String aliasName;
}
