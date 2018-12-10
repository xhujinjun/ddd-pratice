package com.github.xiejj.product.web.goods;

import com.github.xiejj.product.application.goods.SpecificationTypeBiz;
import com.github.xiejj.product.application.goods.model.SpecificationTypeCreateDto;
import com.github.xiejj.product.application.goods.model.SpecificationTypeModifyDto;
import com.github.xiejj.product.domain.goods.model.SpecificationType;
import com.github.xiejj.product.web.base.Request;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@RestController
public class SpecificationTypeController {

    @Autowired
    private SpecificationTypeBiz specificationTypeBiz;

    @ApiOperation(value = "创建规格类别")
    public boolean create(Request<SpecificationTypeCreateRequest> request){
        SpecificationTypeCreateDto specificationTypeCreateDto = new SpecificationTypeCreateDto();
        specificationTypeCreateDto.setBrandId(request.getBrandId());
        specificationTypeCreateDto.setName(request.getContent().getName());
        specificationTypeCreateDto.setAliasName(request.getContent().getAliasName());
        specificationTypeCreateDto.setCreatorId(request.getOperatorId());
        specificationTypeCreateDto.setCreatorName(request.getOperatorName());

        boolean b = specificationTypeBiz.create(specificationTypeCreateDto);
        return b;
    }

    @ApiOperation(value = "修改规格类别")
    public SpecificationType modify(Request<SpecificationTypeModifyRequest> request){
        SpecificationTypeModifyDto specificationTypeModifyDto = new SpecificationTypeModifyDto();
        specificationTypeModifyDto.setBrandId(request.getBrandId());
        specificationTypeModifyDto.setName(request.getContent().getName());
        specificationTypeModifyDto.setAliasName(request.getContent().getAliasName());
        specificationTypeBiz.modify(specificationTypeModifyDto);
        return null;
    }

    @ApiOperation(value = "启用规格类别")
    public boolean enable(Request<Long> request){
        specificationTypeBiz.enable(request.getContent());
        return true;
    }

    @ApiOperation(value = "停用规格类别")
    public boolean disable(Request<Long> request){
        specificationTypeBiz.disable(request.getContent());
        return true;
    }
}
