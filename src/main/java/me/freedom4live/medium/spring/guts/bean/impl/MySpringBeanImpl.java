package me.freedom4live.medium.spring.guts.bean.impl;

import lombok.extern.slf4j.Slf4j;
import me.freedom4live.medium.spring.guts.bean.MySpringBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class MySpringBeanImpl implements MySpringBean {

    @Override
    public void doAction() {
        log.info("DOING METHOD! CURRENT CLASS: {}", this.getClass().toString());
    }

    @PostConstruct
    public void init() {
        log.info("INIT METHOD! CURRENT CLASS: {}", this.getClass().toString());
    }

    @PreDestroy
    public void preDestroy() {
        log.info("PRE DESTROY METHOD! CURRENT CLASS: {}", this.getClass().toString());
    }

}
