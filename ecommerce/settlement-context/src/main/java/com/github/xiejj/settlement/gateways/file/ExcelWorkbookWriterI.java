package com.github.xiejj.settlement.gateways.file;

import com.github.xiejj.settlement.domain.service.OutputStreamProvider;
import com.github.xiejj.settlement.domain.service.SettlementBillTemplate;
import com.github.xiejj.settlement.interfaces.file.WorkbookWriter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Component;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Component
public class ExcelWorkbookWriterI implements WorkbookWriter {
    @Override
    public void writeTo(final HSSFWorkbook workbook, final String targetPath) {

    }

    @Override
    public void writeTo(final OutputStreamProvider streamPrivider, final SettlementBillTemplate template,
                        final String templateName) {

    }
}
