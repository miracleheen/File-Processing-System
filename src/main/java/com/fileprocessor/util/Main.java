package main.java.com.fileprocessor.util;

import main.java.com.fileprocessor.processor.FileProcessor;
import main.java.com.fileprocessor.processor.FileProcessorFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        List<String> filesToProcess = List.of("article.txt", "document.txt", "report.txt");

        filesToProcess.forEach(file -> {
            FileProcessor fileProcessor = FileProcessorFactory.createProcessor(file);
            Future<?> future = executorService.submit(fileProcessor);

            try {
                future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();
    }
}