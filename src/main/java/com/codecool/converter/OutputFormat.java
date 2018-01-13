package com.codecool.converter;

public enum OutputFormat {
    TABLE("table"),
    JSON("json"),
    XML("xml");

    private String typeName;

    OutputFormat(String typeName) {
        this.typeName = typeName;

    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}


