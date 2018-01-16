package com.codecool.converter;

public enum OutputFormat {
    TABLE("table"),
    JSON("json"),
    XML("xml");

    private String formatName;

    OutputFormat(String typeName) {
        this.formatName = typeName;

    }

    public String getFormatName() {
        return formatName;
    }

}


