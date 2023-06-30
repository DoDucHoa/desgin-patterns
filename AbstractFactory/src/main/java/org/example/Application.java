package org.example;

import org.example.buttons.Button;
import org.example.checkboxs.CheckBox;
import org.example.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
