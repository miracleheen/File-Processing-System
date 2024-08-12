package main.java.com.fileprocessor.processor;

import main.java.com.fileprocessor.processor.Strategy.LongestWordStrategy;
import main.java.com.fileprocessor.processor.Strategy.WordCountStrategy;
import main.java.com.fileprocessor.service.FileService;
import main.java.com.fileprocessor.service.StatisticsService;
import main.java.com.fileprocessor.processor.Strategy.ProcessingStrategy;

import java.util.List;

public class FileProcessor implements Runnable {
    private final String fileName;

    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        FileService fileService = new FileService();
        List<String> lines = fileService.readFile(fileName);

        ProcessingStrategy wordCountStrategy = new WordCountStrategy();
        ProcessingStrategy longestWordStrategy = new LongestWordStrategy();

        int wordCount = (int) wordCountStrategy.process(lines);
        String longestWord = (String) longestWordStrategy.process(lines);

        StatisticsService statisticsService = new StatisticsService();
        statisticsService.printStatistics(fileName, wordCount, longestWord);
    }
}
