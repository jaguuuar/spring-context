package com.codecool.converter.formatter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(data);
        System.out.println(json);
    }
}
