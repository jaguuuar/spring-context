package com.codecool.converter;

import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class Controller {

    private SimpleCsvConverter simpleCsvConverter;

    public Controller(SimpleCsvConverter simpleCsvConverter) {
        this.simpleCsvConverter = simpleCsvConverter;
    }

    public void startController(String[] args) throws IOException {

        String filePath = this.getFilePath(args);
        OutputFormat outputFormat = this.getOutputFormat(args);
        this.simpleCsvConverter.convert(filePath, outputFormat);
    }

    public OutputFormat getOutputFormat(String[] args) {

        OutputFormat outputType = OutputFormat.TABLE;

        if(args.length > 1) {
            if (args[0].equals("table")) {
                outputType = OutputFormat.TABLE;
            }
            else if (args[0].equals("json")) {
                outputType = OutputFormat.JSON;
            }
            else if (args[0].equals("xml")) {
                outputType = OutputFormat.XML;
            }
            else {
                Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.out.println(e.getMessage()));
                throw new UnsupportedOperationException("Wrong output format");
            }
        }
        return outputType;
    }

    public String getFilePath(String[] args) {

        String filePath;
        try {
            filePath = args[0];
            if( args.length > 1 ){
                filePath = args[1];
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.out.println(e.getMessage()));
            throw new UnsupportedOperationException("No input file defined");
        }

        return filePath;
    }

}
