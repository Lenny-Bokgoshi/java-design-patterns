package org.lenny.solid.principles.srp;

/**
 * Only holds the data
 * */
public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
}
