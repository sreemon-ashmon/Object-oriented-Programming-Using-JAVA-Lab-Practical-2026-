// Q) Write a Java program using Swing component to count the words.

import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {

    JTextArea text;
    JButton btn;
    JTextField result;

    WordCounter() {
        setTitle("Word Counter");

        text = new JTextArea(5, 20);
        btn = new JButton("Count Words");
        result = new JTextField(10);

        btn.addActionListener(this);

        add(new JScrollPane(text));
        add(btn);
        add(result);

        setLayout(new java.awt.FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String str = text.getText().trim();
        if (str.isEmpty()) {
            result.setText("0");
        } else {
            String words[] = str.split("\\s+");
            result.setText(String.valueOf(words.length));
        }
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}
