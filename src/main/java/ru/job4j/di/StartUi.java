package ru.job4j.di;

import java.util.Objects;

public class StartUi {
    private ConsoleInput consoleInput;
    private Store store;

    public StartUi(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

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
