package com.github.xiejj.settlement.domain.service;

import com.github.xiejj.settlement.domain.model.SettlementBill;
import com.github.xiejj.settlement.domain.model.TemplateVariable;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 结算账单模版
 *
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Slf4j
public class SettlementBillTemplate {
    private HSSFWorkbook workbook;
    private int sheetIndex;
    private String replacePattern;

    public SettlementBillTemplate(HSSFWorkbook workbook) {
        this.workbook = workbook;
    }
    public SettlementBillTemplate(HSSFWorkbook workbook, int sheetIndex, String replacePattern) {
        this.workbook = workbook;
        this.sheetIndex = sheetIndex;
        this.replacePattern = replacePattern;
    }
    public void fillWith(final SettlementBill bill) {
        HSSFSheet sheet = workbook.getSheetAt(sheetIndex);
        for (TemplateVariable v : bill.composeVariables()) {
            HSSFCell cell = sheet.getRow(v.getRowIndex()).getCell(v.getCellNum());
            String cellValue = cell.getStringCellValue();
            String replaceValue = v.getReplaceValue();
            if (replaceValue == null) {
                log.warn("{} -> {} 替换值为空，未从数据库中查出相应字段值", cellValue, replaceValue);
                continue;
            }
            log.info("{} -> {}", cellValue, replaceValue);

            if (cellValue.toLowerCase().contains(replacePattern)) {
                cell.setCellValue(cellValue.replace(replacePattern, replaceValue));
            } else {
                cell.setCellValue(replaceValue);
            }
        }
    }
}
