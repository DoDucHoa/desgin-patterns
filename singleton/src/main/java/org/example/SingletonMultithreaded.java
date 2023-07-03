package org.example;

public final class SingletonMultithreaded {
    private static SingletonMultithreaded instance;
    public String value;

    // Explain: The Singleton class defines the `getInstance` method that serves as an alternative to constructor
    // and lets clients access the same instance of this class over and over.
    private SingletonMultithreaded(String value) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        this.value = value;
    }

    // Explain: The `getInstance` method is static. It returns a static field of the class. This implementation
    // of the Singleton pattern is called "lazy" because the Singleton instance is not created until the `getInstance()`
    // method is called for the first time.
    public static SingletonMultithreaded getInstance(String value) {
        if (instance == null) {
            instance = new SingletonMultithreaded(value);
        }
        return instance;
    }
}
