package com.codecool.converter.formatter;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        for(String[] row: data) {
            for (String element: row) {
                System.out.print(element + "\t\t");
            }
            System.out.println();
        }
    }
}
