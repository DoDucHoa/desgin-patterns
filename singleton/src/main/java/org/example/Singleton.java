package org.example;

public class Singleton {
    private static Singleton instance;
    public String value;

    // Explain: The Singleton class defines the `getInstance` method that serves as an alternative to constructor
    // and lets clients access the same instance of this class over and over.
    private Singleton(String value) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
