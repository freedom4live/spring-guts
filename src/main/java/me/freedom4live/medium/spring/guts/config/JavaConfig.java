package me.freedom4live.medium.spring.guts.config;

import me.freedom4live.medium.spring.guts.bean.MySpringBean;
import me.freedom4live.medium.spring.guts.bean.impl.MySpringBeanImpl;
import me.freedom4live.medium.spring.guts.context.ContextDisplayRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public MySpringBean mySpringBean() {
        return new MySpringBeanImpl();
    }

    @Bean
    public ContextDisplayRunner contextDisplayRunner() {
        return new ContextDisplayRunner();
    }

}
