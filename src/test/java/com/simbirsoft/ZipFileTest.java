package com.simbirsoft;

import net.lingala.zip4j.ZipFile;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class ZipFileTest {
    final String pass = "12345678";

    @Test
    void simpleZipFileTest() throws Exception {
        try (ZipFile zipFile = new ZipFile("src\\test\\resources\\sample.zip")) {
            zipFile.setPassword(pass.toCharArray());
            zipFile.extractAll("src\\test\\resources\\new");
        }
        File file = new File("src\\test\\resources\\new\\sample.txt");
        String parsedFile = FileUtils.readFileToString(file, "UTF-8");
        Assertions.assertTrue((parsedFile.contains
                ("I would love to try or hear the sample audio your app can produce")));
    }
}
