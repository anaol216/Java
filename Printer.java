import javax.swing.*;
import java.awt.*;

public class Printer {
    Printer() {
        JFrame frame = new JFrame("Align");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(500, 250);
        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new GridLayout(4, 1));
        JPanel p3 = new JPanel(new FlowLayout());
        JPanel p4 = new JPanel(new FlowLayout());
        JPanel p5 = new JPanel(new GridLayout(3, 1));
        JPanel p6 = new JPanel(new GridLayout(3, 1));
        JTextArea t1 = new JTextArea(5, 3);
        JTextArea t2 = new JTextArea(5, 2);
        JTextArea t3 = new JTextArea(5, 3);
        JCheckBox c1 = new JCheckBox("Image");
        JCheckBox c2 = new JCheckBox("Text");
        JCheckBox c3 = new JCheckBox("Code");
        JCheckBox c4 = new JCheckBox("Print to File");
        JRadioButton r1 = new JRadioButton("Selection");
        JRadioButton r2 = new JRadioButton("Selection");
        JRadioButton r3 = new JRadioButton("Selection");
        p5.add(c1);
        p5.add(c2);
        p5.add(c3);
        p6.add(r1);
        p6.add(r2);
        p6.add(r3);
        JLabel l1 = new JLabel("Printer: MyPrinter");
        p1.add(l1, BorderLayout.NORTH);
        JLabel l2 = new JLabel("Print Quality: ");
        String[] arr = { "High", "Middle", "Low" };
        JList<String> list = new JList<>(arr);
        list.setVisibleRowCount(1);
        p3.add(l2);
        p3.add(list);
        p3.add(c4);
        p1.add(p3, BorderLayout.SOUTH);
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("cancel");
        JButton b3 = new JButton("Setup");
        JButton b4 = new JButton("Help");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p4.add(t1);
        p4.add(p5);
        p4.add(t2);
        p4.add(p6);
        p4.add(t3);
        p1.add(p4, BorderLayout.CENTER);
        frame.add(p1);
        frame.add(p2, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new Printer();
    }
}