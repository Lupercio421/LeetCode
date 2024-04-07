package org.example.factory;

public abstract class Dialog {

    public abstract Button createButton();

    public void render(){
        Button okButton = createButton();
        okButton.onClick(this.closeDialog);
        okButton.render();
    }
}
