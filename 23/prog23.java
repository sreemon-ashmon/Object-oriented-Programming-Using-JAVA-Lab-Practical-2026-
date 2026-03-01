// Q) Write a program using Swing to accept values in two textboxes and display the results of mathematical operations in the third text box. Use four buttons add, subtract, multiply, and divide

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton add, sub, mul, div;
    SimpleCalculator() {

        setTitle("Simple Calculator");
        setSize(350, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(15);
        t3.setEditable(false);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");

        add(new JLabel("Enter First Number"));
        add(t1);

        add(new JLabel("Enter Second Number"));
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new JLabel("Result"));
        add(t3);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());
        double result = 0;
        if (e.getSource() == add)
            result = num1 + num2;
        else if (e.getSource() == sub)
            result = num1 - num2;
        else if (e.getSource() == mul)
            result = num1 * num2;
        else if (e.getSource() == div)
            result = num2 != 0 ? num1 / num2 : 0;
        t3.setText(String.valueOf(result));
    }
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
