package app.light.window;

import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {

        Window win = new Window("Light System");

        SwingUtilities.invokeLater(() -> {

            win.setVisible(true);

        });


    }
}
