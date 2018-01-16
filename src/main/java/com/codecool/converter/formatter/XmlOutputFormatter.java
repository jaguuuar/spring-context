package com.codecool.converter.formatter;

import com.thoughtworks.xstream.XStream;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        XStream xStream = new XStream();
        xStream.alias("csv", List.class);
        xStream.alias("row", String[].class);
        xStream.alias("column", String.class);
        String xml = xStream.toXML(data);

        System.out.println(xml);
    }
}
