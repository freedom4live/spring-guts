package me.freedom4live.medium.spring.guts.groovy;

import me.freedom4live.medium.spring.guts.context.ContextDisplayRunner;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class GroovyApplication {

    public static void main(String[] args) throws Exception {
        GenericGroovyApplicationContext context = new GenericGroovyApplicationContext("applicationContext.groovy");

        ContextDisplayRunner runner = context.getBean(ContextDisplayRunner.class);
        runner.run(args);

        context.close();
    }

}
