package color.starter;

import color.AppContext;
import color.services.ColorService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {



    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        ColorService green = (ColorService) context.getBean("green");
        green.define();
        ColorService yellow = (ColorService) context.getBean("yellow");
        yellow.define();
        ColorService pink = (ColorService) context.getBean("pink");
        pink.define();
        ColorService white = (ColorService) context.getBean("white");
        white.define();
        ColorService black = (ColorService)context.getBean("black");
        black.define();

    }
}
