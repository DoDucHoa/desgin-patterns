package org.example;

import org.example.factory.Dialog;
import org.example.factory.HtmlDialog;
import org.example.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
}