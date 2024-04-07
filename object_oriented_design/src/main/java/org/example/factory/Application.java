package org.example.factory;

public class Application {

    private Dialog dialog;

    private void initialize(){
        if (config.OS = "Windows"){
            dialog = new WindowsDialog();
        }
        else if (config.OS = "Web") {
            dialog = new WebDialog();
        }
        else{
            throw new RuntimeException("ERROR! Unkown operating system.");
        }
    }

    public void main(String[] args){
        this.initialize();
        dialog.render();
    }
}
