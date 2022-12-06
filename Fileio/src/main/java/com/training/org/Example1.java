package com.training.org;

import javafx.scene.shape.Path;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Example1 {
    // Name of the zip file
    String fileName = "C:\\Users\\admi\\Downloads\\business-price-indexes-march-2021-quarter-csv.zip";

try (
    FileInputStream fis = new FileInputStream(fileName);
    BufferedInputStream bis = new BufferedInputStream(fis);
    ZipInputStream zis = new ZipInputStream(bis)) {

        ZipEntry ze;
        //Buffer to store content
        byte[] buffer = new byte[2048];
        //Output path where I want to write the content of zip file
        Path outDir = Paths.get("C:\\Users\\admi\\Downloads\\output\\");
        while ((ze = zis.getNextEntry()) != null) {
            System.out.println(ze.getName()); // display name of zip file
            System.out.println(ze.getSize()); // display size of zip file
            Path filePath = outDir.resolve(ze.getName());
            try (FileOutputStream fos = new FileOutputStream(filePath.toFile());
                 BufferedOutputStream bos = new BufferedOutputStream(fos, buffer.length)) {

                int len;
                while ((len = zis.read(buffer)) > 0) {
                    bos.write(buffer, 0, len);
                }
            }
        }
    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    } catch (
    IOException e) {
        e.printStackTrace();
    }


}
