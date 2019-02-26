package com.github.xiejj.product.web.category.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@ApiModel(value="新增商品类目请求")
@Data
public class CreatCategoryViewModel {

    @ApiModelProperty(value = "父类型ID",required = false)
    private Long parentId;

    @Length(max=100, message="名称不能超过100个字符")
    @NotNull
    @ApiModelProperty(value = "菜品类型名称",required = true)
    private String name;

    @Length(max=64, message="别名不能超过64个字符")
    @ApiModelProperty(value = "菜品类型别名",required = true)
    private String aliasName;

    @Length(max=64, message="编码不能超过64个字符")
    @ApiModelProperty(value = "类别编码",required = false)
    private String typeCode;

    @Length(max=200, message="描述不能超过200个字符")
    @ApiModelProperty(value = "菜品分类描述",required = true)
    private String dishTypeDesc;

    @ApiModelProperty(value = "终端展示排序")
    @Max(value=99999999,message="请输入8个范围以内的字符")
    @Digits(integer=8,fraction=0,message="请输入合理范围内的数值：0≤数值≤99999999")
    private Integer sort;
}
