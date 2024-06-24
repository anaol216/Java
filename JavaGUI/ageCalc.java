Alright, here's an example of a Java Swing application that calculates the age from a user's input birthdate:

```java
import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.*;
import javax.swing.text.DateFormatter;

public class AgeCalculator extends JFrame {

    public AgeCalculator() {
        setTitle("Age Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Create the GUI elements
        JLabel lblBirthdate = new JLabel("Birthdate:");
        JTextField tfBirthdate = new JTextField(10);
        DateFormatter dateFormatter = new DateFormatter(DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH));
        tfBirthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(dateFormatter));

        JLabel lblAge = new JLabel("Age:");
        JTextField tfAge = new JTextField(5);
        tfAge.setEditable(false);

        JButton btnCalculate = new JButton("Calculate Age");
        btnCalculate.addActionListener(e -> calculateAge(tfBirthdate, tfAge));

        // Organize the elements in a GridBagLayout
        JPanel content
