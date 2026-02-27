// Q) Using Swing, create a button named "Click Me".
// When clicked, display "Hello! You clicked the button" in a textbox.

import javax.swing.*;
import java.awt.event.*;

public class ButtonMessage extends JFrame implements ActionListener {

    JButton btn;
    JTextField text;

    ButtonMessage() {
        setTitle("Button Demo");

        btn = new JButton("Click Me");
        text = new JTextField(20);

        btn.addActionListener(this);

        setLayout(new java.awt.FlowLayout());
        add(btn);
        add(text);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        text.setText("Hello! You clicked the button");
    }

    public static void main(String[] args) {
        new ButtonMessage();
    }
}
