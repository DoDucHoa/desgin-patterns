package org.example;

import org.example.factories.GUIFactory;
import org.example.factories.MacOSFactory;
import org.example.factories.WindowsFactory;

public class Main {
    private static Application configureApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            application = new Application(factory);
        } else {
            factory = new WindowsFactory();
            application = new Application(factory);
        }
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}