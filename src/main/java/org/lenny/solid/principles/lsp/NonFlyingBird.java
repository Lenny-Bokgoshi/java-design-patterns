package org.lenny.solid.principles.lsp;

public abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(String name) {
        super(name);
    }

    // No fly() here – these birds can't fly
}
