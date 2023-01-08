package com.simbirsoft;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class TextFileTest {
    @Test
    void TxtFileTest() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String textFile;
        try (InputStream stream = classLoader.getResourceAsStream("sample.txt")){
            textFile = IOUtils.toString(stream, StandardCharsets.UTF_8);
        }
        Assertions.assertTrue((textFile.contains
                ("I would love to try or hear the sample audio your app can produce")));
    }
}
