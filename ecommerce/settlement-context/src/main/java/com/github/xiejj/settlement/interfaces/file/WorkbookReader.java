package com.github.xiejj.settlement.interfaces.file;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
public interface WorkbookReader {
    HSSFWorkbook readFrom(final String templateName);
}
