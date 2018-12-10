package com.github.xiejj.product.application.goods;

import com.github.xiejj.product.gateway.memory.SpecificationTypeMemoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Component
public class SpecificationTypeQueryBiz {

    @Autowired
    private SpecificationTypeMemoryDao specificationTypeMemoryDao;

    public void queryPropertyTypesByPage(){
        specificationTypeMemoryDao.findByPage();
    }
}
