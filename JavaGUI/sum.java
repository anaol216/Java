package GUI;

import javax.swing.JOptionPane;

public class sum {

    sum() {

        double num1, num2;

        String n1 = JOptionPane.showInputDialog(null, "Enter first integer");
        String n2 = JOptionPane.showInputDialog(null, "Enter second integer");

        num1 = Double.parseDouble(n1);
        num2 = Double.parseDouble(n2);

        double sum = num1 - num2;
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new sum();
    }
}
