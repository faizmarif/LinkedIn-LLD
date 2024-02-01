package org.example.model;

public class Message {
    private String text;
    private byte[] media;

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public byte[] getMedia() {
        return media;
    }

    public Message setMedia(byte[] media) {
        this.media = media;
        return this;
    }
}
