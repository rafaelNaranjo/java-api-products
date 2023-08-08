package com.rafael.app.utils;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.nio.file.Files;

public class FileUtil {

    public static String readFromFileToString(String filePath) throws Exception {
        File resource = new ClassPathResource(filePath).getFile();
        byte[] byteArray = Files.readAllBytes(resource.toPath());
        return new String(byteArray);
    }
}
