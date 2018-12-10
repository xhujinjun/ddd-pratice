package com.github.xiejj.product.web.category;

import com.github.xiejj.product.application.category.BackCategoryAppService;
import com.github.xiejj.product.application.category.model.DisableCategoryDto;
import com.github.xiejj.product.application.category.model.EnableCategoryDto;
import com.github.xiejj.product.web.base.Request;
import com.github.xiejj.product.web.category.model.CreatCategoryCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-09
 */
@Api(tags = "商品类目管理")
@RestController
@RequestMapping("/v1/categories")
public class BackCategoryController {
    @Autowired
    private BackCategoryAppService backCategoryAppService;

    @ApiOperation(value = "新增商品类目(大类/中类)")
    @PostMapping("/new")
    public void createProductCategory(CreatCategoryCommand creatCategoryCommand){
        backCategoryAppService.createCategory(creatCategoryCommand);
    }

    @ApiOperation(value = "修改商品类目")
    @PostMapping("/modify")
    public void modifyCategory(){

    }

    @ApiOperation("停用商品类目")
    @PostMapping("/disable")
    public void disable(Request<Long> request){
        DisableCategoryDto disableCategoryDto = new DisableCategoryDto();
        disableCategoryDto.setBranId(request.getBrandId());
        disableCategoryDto.setCategoryId(request.getContent());
        disableCategoryDto.setOperatorId(request.getOperatorId());
        disableCategoryDto.setOperatorName(request.getOperatorName());
        backCategoryAppService.disable(disableCategoryDto);
    }

    @ApiOperation("启用商品类目")
    @PostMapping("/enable")
    public void enable(Request<Long> request){
        EnableCategoryDto enableCategoryDto = new EnableCategoryDto();
        enableCategoryDto.setBranId(request.getBrandId());
        enableCategoryDto.setCategoryId(request.getContent());
        enableCategoryDto.setOperatorId(request.getOperatorId());
        enableCategoryDto.setOperatorName(request.getOperatorName());
        backCategoryAppService.enable(enableCategoryDto);
    }

    @ApiOperation(value = "删除商品类目")
    @DeleteMapping("/delete")
    public void deleteCategory(){

    }

    @ApiOperation(value = "修改商品类目展示顺序")
    @RequestMapping(value = "/sort")
    public void modifyCategorySort(){

    }
}
