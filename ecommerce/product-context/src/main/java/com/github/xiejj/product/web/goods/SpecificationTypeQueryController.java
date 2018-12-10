package com.github.xiejj.product.web.goods;

import com.github.xiejj.product.application.goods.SpecificationTypeQueryBiz;
import com.github.xiejj.product.web.base.CombinationScreenBean;
import com.github.xiejj.product.web.base.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@RestController
public class SpecificationTypeQueryController {

    @Autowired
    private SpecificationTypeQueryBiz specificationTypeQueryBiz;
    /**
     * 组合筛选
     */
    public void combinationScreen(Request<CombinationScreenBean<SpecificationTypeScreenConditionRequest>> request){

        specificationTypeQueryBiz.queryPropertyTypesByPage();
    }

    /**
     * 规格类型明细
     * @param request
     */
    public void detail(Request<Long> request){

    }

    /**
     * 查询启用商品规格类别
     */
    public void enableSpecificationList(Request<CombinationScreenBean> request){

    }
}
