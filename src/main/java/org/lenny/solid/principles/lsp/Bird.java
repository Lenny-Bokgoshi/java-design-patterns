package org.lenny.solid.principles.lsp;

public abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}
