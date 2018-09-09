package com.github.xiejj.settlement.interfaces.file;

import com.github.xiejj.settlement.domain.service.OutputStreamProvider;
import com.github.xiejj.settlement.domain.service.SettlementBillTemplate;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
public interface WorkbookWriter {
    void writeTo(HSSFWorkbook workbook, String targetPath);

    void writeTo(final OutputStreamProvider streamPrivider, final SettlementBillTemplate template,
                        final String templateName);
}
