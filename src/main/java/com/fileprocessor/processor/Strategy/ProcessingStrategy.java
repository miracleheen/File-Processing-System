package main.java.com.fileprocessor.processor.Strategy;

import java.util.List;

public interface ProcessingStrategy {
    Object process(List<String> lines);
}
