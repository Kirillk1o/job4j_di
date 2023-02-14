package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDi {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUi ui = context.getBean(StartUi.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.input();
    }
}
