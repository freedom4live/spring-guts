package me.freedom4live.medium.spring.guts.config;

import me.freedom4live.medium.spring.guts.context.ContextDisplayRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ContextDisplayRunner bean = context.getBean(ContextDisplayRunner.class);
        bean.run(args);

        context.close();
    }

}
