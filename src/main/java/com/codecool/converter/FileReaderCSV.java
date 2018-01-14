package com.codecool.converter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderCSV {

    public String[] readData(String file) {

        String line;
        String cvsSplitBy = ",";
        String[] row = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                row = line.split(cvsSplitBy);
                System.out.println(row[0] + ", " + row[1]);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
        return row;
    }

}
