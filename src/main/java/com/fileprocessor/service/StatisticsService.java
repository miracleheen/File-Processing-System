package main.java.com.fileprocessor.service;

public class StatisticsService {
    public void printStatistics(String fileName, int wordCount, String longestWord) {
        System.out.println("File: " + fileName);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
    }
}
