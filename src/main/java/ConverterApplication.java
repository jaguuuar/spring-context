import com.codecool.converter.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConverterApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("converterAppContext.xml");
        Controller controller = (Controller) ctx.getBean("controller");

        controller.startController(args);
    }

}
