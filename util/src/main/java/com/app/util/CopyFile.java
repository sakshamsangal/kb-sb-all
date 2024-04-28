package com.app.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFile {
    public static void main(String[] args) {
        copyFile("src/main/resources/msg.properties", "src/main/resources/msg2.properties");
    }


    public static void copyFile(String srcLoc, String desLoc) {
        File srcFile = new File(srcLoc);
        File desFile = new File(desLoc);
        try {
            Files.copy(srcFile.toPath(), desFile.toPath(), REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
