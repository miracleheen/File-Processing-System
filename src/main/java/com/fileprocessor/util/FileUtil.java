package main.java.com.fileprocessor.util;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FileUtil {
    public static List<String> readFileLines(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading file: " + fileName);
        }
    }
}
