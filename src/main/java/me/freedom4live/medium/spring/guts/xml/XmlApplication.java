package me.freedom4live.medium.spring.guts.xml;

import me.freedom4live.medium.spring.guts.context.ContextDisplayRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {

    public static void main(String[] args) throws Exception {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ContextDisplayRunner runner = context.getBean(ContextDisplayRunner.class);
        runner.run(args);

        context.close();
    }

}
