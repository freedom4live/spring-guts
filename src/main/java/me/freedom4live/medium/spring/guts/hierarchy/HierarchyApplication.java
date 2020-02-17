package me.freedom4live.medium.spring.guts.hierarchy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import lombok.extern.slf4j.Slf4j;
import me.freedom4live.medium.spring.guts.context.ContextDisplayRunner;

@Slf4j
public class HierarchyApplication {
    
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext parentContext = new ClassPathXmlApplicationContext("parentContext.xml");
        GenericGroovyApplicationContext childContext = new GenericGroovyApplicationContext("childContext.groovy");
        childContext.setParent(parentContext);
        
        ContextDisplayRunner runner = childContext.getBean(ContextDisplayRunner.class);
        runner.run(args);
        
        parentContext.close();
        childContext.close();
    }
    
}
