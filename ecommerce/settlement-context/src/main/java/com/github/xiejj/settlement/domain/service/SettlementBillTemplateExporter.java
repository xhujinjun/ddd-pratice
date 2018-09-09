package com.github.xiejj.settlement.domain.service;

import com.github.xiejj.settlement.domain.domain.SettlementBill;
import com.github.xiejj.settlement.interfaces.file.WorkbookReader;
import com.github.xiejj.settlement.interfaces.file.WorkbookWriter;
import com.github.xiejj.settlement.repositories.SettlementBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Service
public class SettlementBillTemplateExporter {
    @Autowired
    private WorkbookReader reader;

    @Autowired
    private WorkbookWriter writer;
    @Autowired
    private SettlementBillRepository repository;

    /**
     * 根据模版和张丹号生成结算单并导出
     *
     * @param templateName 模版名称
     * @param billNumber 账单号
     * @param streamProvider 数据流
     */
    public void export(String templateName, Integer billNumber, OutputStreamProvider streamProvider){
        //采用重载
        SettlementBill bill = repository.settlemntBillBy(templateName, billNumber);

        SettlementBillTemplate template = new SettlementBillTemplate(reader.readFrom(templateName));
        template.fillWith(bill);
        writer.writeTo(streamProvider, template, templateName);
    }
}
