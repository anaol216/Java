import javax.swing.*;

public class LabelIncrementer {
    private static int labelValue = 0;
    private static JLabel label;

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Label Incrementer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        
        label = new JLabel("Value: " + labelValue);
        frame.add(label, "Center");

        
        JButton button = new JButton("Increment");
        button.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(frame, "Do you want to increment the label?", "Increment Label", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                labelValue++;
                label.setText("Value: " + labelValue);
            }
        });
        frame.add(button, "South");

        frame.setVisible(true);
    }
}
