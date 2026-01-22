package app.light.window;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Window extends JFrame implements ActionListener{

    public static final String DARK = "DARK";
    public static final String LIGHT = "LIGHT";

    private String modo = Window.LIGHT;

    private JButton buttonLight;

    public Window(String title) {

        super(title);

        buttonLight = new JButton("Alter Mode");
        buttonLight.addActionListener(this);

        this.getContentPane().setBackground(Color.white);
        this.setSize(500,500);
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(buttonLight);

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == buttonLight) {

            if (modo.equals(Window.LIGHT)) {

                this.getContentPane().setBackground(Color.black);
                this.modo = Window.DARK;

            }else {

                this.getContentPane().setBackground(Color.white);
                this.modo = Window.LIGHT;

            }


        }

    }


}
