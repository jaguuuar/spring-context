package com.codecool.converter;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Component
public class FileReader {

    public List<String[]> readData(String file) throws IOException {

        List<String[]> data;

        try {
            CSVReader reader = new CSVReader(new java.io.FileReader(file));
            data = reader.readAll();

        } catch (FileNotFoundException ex) {
            Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.out.println(e.getMessage()));
            throw new FileNotFoundException("File not found");
        }

        return data;
    }
}
