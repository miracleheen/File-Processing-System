package main.java.com.fileprocessor.service;

import main.java.com.fileprocessor.util.FileUtil;

import java.util.List;

public class FileService {
    public List<String> readFile(String fileName) {
        return FileUtil.readFileLines(fileName);
    }
}
