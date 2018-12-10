package com.github.xiejj.product.web.goods;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
@ApiModel(value = "商品属性规格类别创建")
public class SpecificationTypeCreateRequest {

    @ApiModelProperty(value = "规格类别名称",required=true)
    @NotBlank(message = "请填写名称")
    @Length(max=20,message="名称长度小于20")
    private String name;

    @ApiModelProperty(value = "第二语言")
    @Length(max=20,message="名称长度小于20")
    private String aliasName;
}
