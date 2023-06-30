package org.example.factories;

import org.example.buttons.Button;
import org.example.checkboxs.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
