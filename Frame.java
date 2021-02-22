import java.awt.Component;

import javax.swing.*;

public class Frame extends JFrame {
private static final long serialVersionUID = 1L;
private Component add;
public Frame(){
super("kółko i krzyżyk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setLocation(700,100);
        setVisible(true);

JPanel buttonsPanel = new Buttons();
add = add(buttonsPanel);
}


}   