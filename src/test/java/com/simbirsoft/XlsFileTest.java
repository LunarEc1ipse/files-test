package com.simbirsoft;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XlsFileTest {

    @Test
    void SimpleXlsFileTest() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream("sample.xls");
        XLS xlsFile = new XLS(stream);
        String stringCellValue = xlsFile.excel
                .getSheetAt(0).getRow(4)
                .getCell(1).getStringCellValue();
        assertEquals("Kathleen", stringCellValue);
    }
}
