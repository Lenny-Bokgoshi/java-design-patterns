package org.lenny.behavioural.state;

public class Game {
    private State state = new WelcomeScreenState(this);

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
