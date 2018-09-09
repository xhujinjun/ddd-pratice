package com.github.xiejj.settlement.gateways.file;

import com.github.xiejj.settlement.interfaces.file.WorkbookReader;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Component;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
@Component
public class ExcelWorkbookReader implements WorkbookReader {
    @Override
    public HSSFWorkbook readFrom(final String templateName) {
        return null;
    }
}
