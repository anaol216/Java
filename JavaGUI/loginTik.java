package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
//import java.awt.desktop;

import javax.swing.*;

public class loginTik implements ActionListener {
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        JPanel panel2 = new JPanel(new BorderLayout());

        ImageIcon image = new ImageIcon("C:/Users/atina/Downloads/tiktok-logo-24.png");
        ImageIcon image1 = new ImageIcon("C:\\Users\\atina\\Downloads\\tiktok-logo-24 (1).png");

        Image pImage = image1.getImage().getScaledInstance(100, 200, Image.SCALE_SMOOTH);
        image1 = new ImageIcon(pImage);

        // Create the image panel and add the image
        JLabel imageLabel = new JLabel(image1);
        panel2.add(imageLabel, BorderLayout.CENTER);

        frame.setSize(540, 400);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(panel);
        frame.add(panel2);

        panel.setLayout(null);
        panel.setBounds(250, 0, 280, 400);
        panel.setBackground(new Color(0, 255, 0));

        panel2.setBounds(0, 0, 250, 400);
        panel2.setBackground(new Color(20, 90, 90));
        // panel2.add(image1,BorderLayout.CENTER);

        userlabel = new JLabel("User ");
        userlabel.setBounds(10, 70, 60, 30);
        panel.add(userlabel);

        userText = new JTextField();
        userText.setBounds(100, 70, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 100, 60, 30);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 100, 165, 25);
        panel.add(passwordField);

        button = new JButton("login");
        button.setBounds(80, 200, 80, 25);
        button.addActionListener(new loginTik());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        success.setText(null);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordField.getText();
        System.out.println(user + ", " + password);
        try {
            Desktop.getDesktop().browse(new URI("https://www.tiktok.com/login"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
