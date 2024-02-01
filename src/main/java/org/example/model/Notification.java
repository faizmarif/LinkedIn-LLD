package org.example.model;

public class Notification {
    private String text;

    public String getText() {
        return text;
    }

    public Notification setText(String text) {
        this.text = text;
        return this;
    }
}
