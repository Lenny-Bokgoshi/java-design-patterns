package org.lenny.solid.principles.lsp;

public class Sparrow extends FlyingBird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high in the sky!");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says chirp chirp!");
    }
}
