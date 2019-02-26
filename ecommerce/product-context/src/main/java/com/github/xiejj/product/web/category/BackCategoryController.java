package com.github.xiejj.product.web.category;

import com.github.xiejj.product.application.category.BackCategoryAppService;
import com.github.xiejj.product.application.category.model.DisableCategoryDto;
import com.github.xiejj.product.application.category.model.EnableCategoryDto;
import com.github.xiejj.product.application.category.model.ModifyCategoryDto;
import com.github.xiejj.product.domain.category.command.Command.ErrorInfo;
import com.github.xiejj.product.domain.category.command.CreateCategoryCommand;
import com.github.xiejj.product.web.base.Request;
import com.github.xiejj.product.web.category.model.CreatCategoryViewModel;
import com.github.xiejj.product.web.category.model.ModifyCategoryView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    public void createProductCategory(Request<CreatCategoryViewModel> command){
        //视图模型的验证(注解)


        CreateCategoryCommand createCategoryCommand = new CreateCategoryCommand();
        createCategoryCommand.setBrandId(command.getBrandId());
        createCategoryCommand.setShopId(command.getShopId());
        createCategoryCommand.setOperatorId(command.getOperatorId());
        createCategoryCommand.setOperatorName(command.getOperatorName());
        createCategoryCommand.setParentId(command.getContent().getParentId());
        createCategoryCommand.setName(command.getContent().getName());
        createCategoryCommand.setAliasName(command.getContent().getAliasName());
        createCategoryCommand.setTypeCode(command.getContent().getTypeCode());
        createCategoryCommand.setDishTypeDesc(command.getContent().getDishTypeDesc());
        createCategoryCommand.setSort(command.getContent().getSort());

        // List<String> errorInfos = new ArrayList<>();
        // if (!createCategoryCommand.isValid()){
        //     for (ErrorInfo errorInfo : createCategoryCommand.getValidationResult().getErrors()){
        //         errorInfos.add(errorInfo.getErrorMessage());
        //     }
        //     return;
        // }

        backCategoryAppService.createCategory(createCategoryCommand);
    }

    @ApiOperation(value = "修改商品类目")
    @PostMapping("/modify")
    public void modifyCategory(Request<ModifyCategoryView> command){
        ModifyCategoryDto modifyCategoryDto = new ModifyCategoryDto();
        backCategoryAppService.modifyCategory(modifyCategoryDto);
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
