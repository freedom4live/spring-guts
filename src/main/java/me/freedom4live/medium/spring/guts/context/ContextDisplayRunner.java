package me.freedom4live.medium.spring.guts.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Slf4j
@Component
public class ContextDisplayRunner implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) {
        log.info("Application Context display name: {}", applicationContext.getDisplayName());
        log.info("Application Context class: {}", applicationContext.getClass().toString());

        log.info("PRINTING BEANS!!!!");
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(beanDefName -> {
            Object bean = applicationContext.getBean(beanDefName);

            log.info("BEAN NAME: {}, BEAN CLASS: {}", beanDefName, bean.getClass().toString());
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

}
