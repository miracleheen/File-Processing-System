package main.java.com.fileprocessor.processor.Strategy;

import java.util.List;

public class WordCountStrategy implements ProcessingStrategy {
    @Override
    public Integer process(List<String> lines) {
        int wordCount = 0;
        for (String line : lines) {
            wordCount += line.split("\\s+").length;
        }
        return wordCount;
    }
}
