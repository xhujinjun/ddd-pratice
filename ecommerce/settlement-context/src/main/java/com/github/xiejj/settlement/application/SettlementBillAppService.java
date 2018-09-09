package com.github.xiejj.settlement.application;

import com.github.xiejj.settlement.application.exception.ApplicationException;
import com.github.xiejj.settlement.domain.service.OutputStreamProvider;
import com.github.xiejj.settlement.domain.service.SettlementBillTemplateExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 结算账单应用服务
 *
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Component
public class SettlementBillAppService {
    @Autowired
    private SettlementBillTemplateExporter exporter;

    public void exportByTemplate(String templateName, Integer billNumber, OutputStreamProvider streamProvider){
        try {
            exporter.export(templateName, billNumber, streamProvider);
        } catch (Exception e) {
            throw new ApplicationException("Failed to export settlement bill file.", e);
        }
    }
}
