package com.mycompany.app;

/**
 * Simple App class.
 */
public class App {
    private String message;

    public App() {
        this.message = "Hello World!";
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
