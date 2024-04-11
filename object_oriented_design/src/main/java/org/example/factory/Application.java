package org.example.factory;

public class Application {

    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }


    static void configure(){
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }
        else if (System.getProperty("os.name").equals("Web Based Windows")) {
            dialog = new HtmlDialog();
        }
        else{
            throw new RuntimeException("ERROR! Unkown operating system.");
        }
    }
}
