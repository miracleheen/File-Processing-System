package main.java.com.fileprocessor.processor;

public class FileProcessorFactory {
    public static FileProcessor createProcessor(String fileName) {
        return new FileProcessor(fileName);
    }
}
