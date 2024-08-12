package main.java.com.fileprocessor.processor.Strategy;

import java.util.List;

public class LongestWordStrategy implements ProcessingStrategy {
    @Override
    public String process(List<String> lines) {
        String longestWord = "";
        for (String line : lines) {
            for (String word : line.split("\\s+")) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}
