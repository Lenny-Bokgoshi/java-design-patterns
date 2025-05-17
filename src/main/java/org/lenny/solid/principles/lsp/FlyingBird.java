package org.lenny.solid.principles.lsp;

public abstract class FlyingBird extends Bird {
    public FlyingBird(String name) {
        super(name);
    }

    public abstract void fly();
}
