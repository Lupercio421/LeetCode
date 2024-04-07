package org.example.factory;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
