package com.codecool.converter;

import com.codecool.converter.formatter.JsonOutputFormatter;
import com.codecool.converter.formatter.OutputFormatter;
import com.codecool.converter.formatter.TableOutputFormatter;
import com.codecool.converter.formatter.XmlOutputFormatter;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(OutputFormat outputFormat) {

        switch (outputFormat) {
            case TABLE:
                return new TableOutputFormatter();
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
        }
        return null;
    }
}
