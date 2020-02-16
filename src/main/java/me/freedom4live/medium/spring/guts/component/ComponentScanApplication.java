package me.freedom4live.medium.spring.guts.component;

import me.freedom4live.medium.spring.guts.context.ContextDisplayRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "me.freedom4live.medium.spring.guts.bean",
                "me.freedom4live.medium.spring.guts.context");

        ContextDisplayRunner bean = context.getBean(ContextDisplayRunner.class);
        bean.run(args);

        context.close();
    }

}
