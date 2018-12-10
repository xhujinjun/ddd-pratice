package com.github.xiejj.product.domain.goods.model;

import com.github.xiejj.product.domain.DataOperator;
import com.github.xiejj.product.domain.Entity;
import lombok.Data;
import org.springframework.util.Assert;

/**
 * 规格类型 实体
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class SpecificationType implements Entity<SpecificationType> {
    private Long id;
    /**
     * 品牌标识
     */
    private Long brandId;

    /**
     * 属性类别名称(唯一性)
     */
    private String name;

    /**
     * 套餐内分组别名
     */
    private String aliasName;

    /**
     * 排序(目前没有使用，默认为0)
     */
    private Integer sort;

    /**
     * 启用标识：1:启用;2:停用
     */
    private Boolean enabledFlag;

    /**
     * 数据操作者
     */
    private DataOperator dataOperator;

    public void save(){
        Assert.notNull(brandId, "");
        Assert.notNull(name, "");
        //校验name是否品牌下重复
        //保存
    }

    /**
     * 修改
     */
    public void modfiy(){
        Assert.notNull(id, "");
        //校验name是否品牌下重复
        //更新
    }

    /**
     * 启用
     */
    public void enable(){
        Assert.notNull(id, "");
        this.enabledFlag = true;
    }

    /**
     * 停用
     */
    public void disable(){
        Assert.notNull(id, "");
        this.enabledFlag = false;
    }

    @Override
    public boolean sameIdentityAs(final SpecificationType other) {
        return false;
    }

    // /**
    //  * 因为实体没有status_flag了，所以实体就没有该行为了，直接用reposity
    //  * 删除
    //  */
    // public void delete(){
    //     //校验是否有对应的规范
    //     this.statusFlag = false;
    // }
}
