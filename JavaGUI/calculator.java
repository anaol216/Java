package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;

public class calculator implements ActionListener {
    JTextField textField;
    JFrame frame;
    JButton[] numberButtons = new JButton[10];
    JButton[] fButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public calculator() {
        frame = new JFrame("Calculator ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setTitle("Calculator");
        frame.setLayout(null);
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        decButton = new JButton(".");
        clrButton = new JButton("clear");

        fButtons[0] = addButton;
        fButtons[1] = subButton;
        fButtons[2] = mulButton;
        fButtons[3] = divButton;
        fButtons[5] = decButton;
        fButtons[4] = equButton;
        fButtons[6] = clrButton;

        for (int i = 0; i < 7; i++) {
            fButtons[i].addActionListener(this);
            fButtons[i].setFont(myFont);
            fButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        clrButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        for (int i = 7; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(divButton);
        for (int i = 4; i <= 6; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(mulButton);
        for (int i = 1; i <= 3; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(subButton);
        panel.add(numberButtons[0]);
        panel.add(decButton);
        panel.add(equButton);
        panel.add(addButton);

        frame.add(textField);
        frame.add(panel);
        frame.add(clrButton);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new calculator();
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton) {
            textField.setText("");

        }
    }
}
