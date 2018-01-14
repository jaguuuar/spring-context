package com.codecool.converter.formatter;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        String xml = "<root>";

        if(data.size() > 1) {

            for(int rowNum = 1; rowNum < data.size(); rowNum++) {
                xml += "\n <row>";

                for(int valueNum = 0; valueNum < data.get(rowNum).length; valueNum++) {
                    xml += "\n  <" + data.get(0)[valueNum] + ">";
                    xml += data.get(rowNum)[valueNum];
                    xml += "</" + data.get(0)[valueNum] + ">";
                }
                xml += "\n </row>";
            }
        }
        xml += "\n</root>";

        System.out.println(xml);
    }
}
