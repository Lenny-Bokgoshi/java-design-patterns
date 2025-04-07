package org.lenny.behavioural.memento;

import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memento> mementoList = new ArrayList<>();

    public void saveState(Memento mem) {
        mementoList.add(mem);
        System.out.println("Current states saved is: " + mementoList.size());
    }

    public Memento restoreState(int index) {
        return mementoList.get(index);
    }
}
