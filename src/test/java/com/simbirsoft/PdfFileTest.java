package com.simbirsoft;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class PdfFileTest {

    @Test
    void SimplePdfFileTest() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream("sample.pdf");
        PDF parsedPDF = new PDF(stream);
        Assertions.assertTrue((parsedPDF.text.contains("This is a small demonstration .pdf file")));
    }
}
