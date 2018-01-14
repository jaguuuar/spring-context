package com.codecool.converter.formatter;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        String table = "<table border=1 class=\"table table-striped table-bordered table-hover table-condensed\">";

        table += "\n <thead>\n  <tr>";

        for(int fieldNum = 0; fieldNum < data.get(0).length; fieldNum++) {
            table += " \n   <th>" + data.get(0)[fieldNum] + "</th>";
        }
        table += "\n  </tr>\n </thead>";

        table += "\n <tbody>";
        for(int rowNum = 1; rowNum < data.size(); rowNum++) {
            table += "\n  <tr>";
            for (int valueNum = 0; valueNum < data.get(rowNum).length; valueNum++) {
                table += " \n   <td>" + data.get(rowNum)[valueNum] + "</td>";
            }
            table += "\n  </tr>";
        }
        table += "\n </tbody>";
        table += "\n</table>";






//        if(data.size() > 1) {
//
//            for(int rowNum = 1; rowNum < data.size(); rowNum++) {
//                json += "\n {";
//                for (int valueNum = 0; valueNum < data.get(rowNum).length; valueNum++) {
//                    String attribute = data.get(0)[valueNum];
//                    String value = data.get(rowNum)[valueNum];
//                    json += "\n  " + attribute + ": " + value;
//                }
//
//                if (rowNum < data.size() - 1) {
//                    json += "\n },";
//                } else {
//                    json += "\n }";
//                }
//            }
//            json += "\n]";
//
//        } else {
//            json += "]";
//        }

        System.out.println(table);
    }
}
