import javax.swing.*;
import java.awt.*;

public class Alignment {
    Alignment() {
        JFrame frame = new JFrame("Align");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(300, 150);
        JPanel p1 = new JPanel(new GridLayout(2, 1));
        JPanel p2 = new JPanel(new GridLayout(2, 2));
        JPanel p3 = new JPanel(new GridLayout(3, 1));
        JCheckBox r1 = new JCheckBox("Snap to Grid");
        JCheckBox r2 = new JCheckBox("Show Grid");
        p1.add(r1);
        p1.add(r2);
        JLabel l1 = new JLabel("X: ");
        JTextField t1 = new JTextField(4);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        JLabel l2 = new JLabel("Y: ");
        JTextField t2 = new JTextField(4);
        t2.setHorizontalAlignment(JTextField.RIGHT);
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("cancel");
        JButton b3 = new JButton("Help");
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
    }

    public static void main(String[] args) {
        new Alignment();
    }
}