package com.github.xiejj.product.domain.goods.model;

import com.github.xiejj.product.domain.DataOperator;
import com.github.xiejj.product.domain.Entity;
import lombok.Data;

/**
 * 做法类型
 * @author xiejinjun
 * @version 1.0 2018-12-07
 */
@Data
public class Cookingwaytype implements Entity<Cookingwaytype> {
    /**
     * 品牌标识
     */
    private Long brandId;

    /**
     * 属性类别名称
     */
    private String name;

    /**
     * 套餐内分组别名
     */
    private String aliasName;

    /**
     * 排序
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

    /**
     * 保存做法类型
     */
    public void save(){

    }

    public static void main(String[] args) {
        String xx = "{\"appType\":\"5\",\"brandID\":2479,\"content\":{\"postData\":{\"goodIds\":[],\"initSystemIds\":[{\"initSystemId\":10186588}],\"tableIds\":[],\"tickets\":[{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":1},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":2},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":3},{\"deliveryType\":15,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":4},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":11},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":19},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":20},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":5},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":22},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":6},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":7},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":13},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":8},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":10},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":9},{\"deliveryType\":0,\"documentPrintCount\":1,\"isPrintAllSubdish\":1,\"ticketTypeCode\":21}],\"brandIdenty\":2479,\"creatorId\":58455408859228160,\"creatorName\":\"先生\",\"deviceIdenty\":\"34:00:8a:92:93:88\",\"isGoods\":2,\"isTable\":2,\"name\":\"ui\",\"printerDeviceId\":138685178779377664,\"shopIdenty\":247900001,\"ticketType\":2,\"changed\":false},\"url\":\"/mind/innerApi/printerKitchen/add\"},\"deviceID\":\"34:00:8a:92:93:88\",\"opVersionUUID\":\"90fb257e5cc04e63aaf3c2568ebce411\",\"shopID\":247900001,\"systemType\":\"android\",\"versionCode\":\"2110080911\",\"versionName\":\"8.9.11\"}";
        System.out.println("xx = " + xx.getBytes().length);
    }
    /**
     * 修改做法类型
     */
    public void modify(){

    }

    /**
     * 启用做法类型
     */
    public void enable(){
        if (enabledFlag){

        }else {
            this.enabledFlag = true;
        }

    }

    /**
     * 禁用做法类型
     *      含义： 以后都不使用该做法类型了,但是之前使用过的可以继续查看做法类型信息
     */
    public void disable(){
        if (enabledFlag){
            this.enabledFlag = false;
        }else {

        }
    }

    /**
     * 删除做法类型
     */
    public void delete(){
        //这里应该要检查是否有商品使用过该做法类型吧？
    }

    @Override
    public boolean sameIdentityAs(final Cookingwaytype other) {
        return false;
    }
}
