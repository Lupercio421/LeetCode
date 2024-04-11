package org.example.factory;

public class HTMLButton implements Button {
    @Override
    public void render() {
        // Render a HTML representation of a button
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
//        Bind a web browser click event
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
