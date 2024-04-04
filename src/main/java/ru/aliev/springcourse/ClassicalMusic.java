package ru.aliev.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method");
    }

    @Override
    public String getSong() {
        return "Una mattina";
    }
}
