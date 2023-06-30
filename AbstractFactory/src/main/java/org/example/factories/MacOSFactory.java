package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.MacOSButton;
import org.example.checkboxs.CheckBox;
import org.example.checkboxs.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckbox();
    }
}
