import com.codecool.converter.OutputFormat;
import com.codecool.converter.SimpleCsvConverter;

public class ConverterApplication {

    public static void main(String[] args) {

        System.out.println("Application run");

        ConverterApplication conApp = new ConverterApplication();

        if(args.length == 0) {
            System.out.println("No input file defined");
            System.exit(0);
        } else if(args.length == 1 && !args[0].contains(".csv")) {
            System.out.println("No input file defined");
            System.exit(0);
        } else if(args.length > 1 && !args[1].contains(".csv")) {
            System.out.println("No input file defined");
            System.exit(0);
        }

        String filePath = args[0];

        if( args.length > 1) {
            filePath = args[1];
        }

        OutputFormat outputFormat = conApp.getOutputFormat(args);

        SimpleCsvConverter simpleCsvConverter = new SimpleCsvConverter();
        simpleCsvConverter.convert(filePath, outputFormat);

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
                System.out.println("No output defined");
                System.exit(0);
            }
        }

        return outputType;
    }

}
