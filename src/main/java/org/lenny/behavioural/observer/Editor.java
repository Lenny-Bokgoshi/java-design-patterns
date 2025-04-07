package org.lenny.behavioural.observer;

import java.util.Objects;

public class Editor {
    private EventManager events;
    String file = "";

    void openFile(String filename) {
        this.file = filename;
        events.notify("open", file);
    }

    void saveFile() {
        if (!Objects.equals(file, "")) {
            events.notify("save", file);
        }
    }

    public EventManager getEvents() {
        return new EventManager("open", "save");
    }

}
