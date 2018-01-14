package com.codecool.converter.formatter;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        String json = "[";

        if(data.size() > 1) {

            for(int rowNum = 1; rowNum < data.size(); rowNum++) {
                json += "\n {";
                for (int valueNum = 0; valueNum < data.get(rowNum).length; valueNum++) {
                    String attribute = data.get(0)[valueNum];
                    String value = data.get(rowNum)[valueNum];
                    json += "\n  " + attribute + ": " + value;
                }

                if (rowNum < data.size() - 1) {
                    json += "\n },";
                } else {
                    json += "\n }";
                }
            }
            json += "\n]";

        } else {
            json += "]";
        }

        System.out.println(json);
    }
}
