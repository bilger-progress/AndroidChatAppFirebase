package com.yahov.flashchatnewfirebase;

public class InstantMessage {
    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {

    }

    public String getMessage() {
        return this.message;
    }

    public String getAuthor() {
        return this.author;
    }
}
