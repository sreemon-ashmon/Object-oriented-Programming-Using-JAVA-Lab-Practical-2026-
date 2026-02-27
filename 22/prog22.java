// 22) Write a Java program to accept a number then check whether a given number is even or odd and display the result in the second textbox.

import javax.swing.*;
import java.awt.event.*;

public class EvenOddCheck extends JFrame implements ActionListener {

    JTextField numField, resultField;
    JButton checkBtn;

    EvenOddCheck() {
        setTitle("Even Odd Checker");

        numField = new JTextField(10);
        resultField = new JTextField(15);
        checkBtn = new JButton("Check");

        checkBtn.addActionListener(this);

        setLayout(new java.awt.FlowLayout());
        add(new JLabel("Enter Number:"));
        add(numField);
        add(checkBtn);
        add(resultField);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(numField.getText());

            if (num % 2 == 0)
                resultField.setText("Even Number");
            else
                resultField.setText("Odd Number");

        } catch (Exception ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new EvenOddCheck();
    }
}
