// Q) write a swing program to accept a value in a textbox then reverse that number and display the result in the second textbox.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumber extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton reverse;

    ReverseNumber() {

        setTitle("Reverse Number");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEditable(false);

        reverse = new JButton("Reverse");

        add(new JLabel("Enter Number"));
        add(t1);

        add(reverse);

        add(new JLabel("Reversed Number"));
        add(t2);

        reverse.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String num = t1.getText();
        String reversed = new StringBuilder(num).reverse().toString();
        t2.setText(reversed);
    }

    public static void main(String[] args) {
        new ReverseNumber();
    }
}
