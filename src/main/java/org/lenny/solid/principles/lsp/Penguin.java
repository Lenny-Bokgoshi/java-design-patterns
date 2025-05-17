package org.lenny.solid.principles.lsp;

public class Penguin extends NonFlyingBird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says honk!");
    }
}
