package com.codecool.converter;

import com.codecool.converter.formatter.OutputFormatter;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    public void convert(String file, OutputFormat outputFormat) throws IOException {
        List<String[]> data = this.fileReader.readData(file);
        OutputFormatter outputFormatter = this.outputFormatterFactory.createByFormat(outputFormat);
        outputFormatter.printToConsole(data);
    }

}
