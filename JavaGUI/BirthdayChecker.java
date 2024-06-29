
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.Period;

public class BirthdayChecker extends JFrame {
    public BirthdayChecker() {
        setTitle("Birthday Checker");
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel dobLabel = new JLabel("Date of Birth (YYYY-MM-DD):");
        JTextField dobField = new JTextField();

        JButton checkButton = new JButton("Check Birthday");
        checkButton.addActionListener(e -> {
            String dobString = dobField.getText();
            LocalDate dob = LocalDate.parse(dobString);
            LocalDate today = LocalDate.now();

            if (dob.getMonth() == today.getMonth() && dob.getDayOfMonth() == today.getDayOfMonth()) {
                JOptionPane.showMessageDialog(this, "Today is your birthday! Happy birthday!");
            } else {
                int age = Period.between(dob, today).getYears();
                JOptionPane.showMessageDialog(this, "Today is not your birthday. You are " + age + " years old.");
            }
        });

        add(dobLabel);
        add(dobField);
        add(new JLabel());
        add(checkButton);

        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BirthdayChecker();
    }
}
