package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
@Scope("prototype")
public class StartUi {
    @Autowired
    private ConsoleInput consoleInput;
    @Autowired
    private Store store;

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public void input() {
        var rsl = consoleInput.askStr("privet");
        if (rsl.equals("privet")) {
            System.out.println("poka");
        }
    }
}
