package afMid;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.concurrent.Flow;

import javax.security.auth.login.AppConfigurationEntry;
import javax.swing.*;

public class miniMarket implements ActionListener {

    public static JButton bu1, bu2, bu3;
    public static JLabel l1, l2, l3, l4;

    int Tprice1 = 0;
    int Tprice2 = 0;
    int Tprice3 = 0;
    int Tprice = Tprice1 + Tprice2 + Tprice3;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setSize(400, 300);
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);

        ImageIcon i1 = new ImageIcon("");
        ImageIcon i2 = new ImageIcon("");
        ImageIcon i3 = new ImageIcon("");

        bu1 = new JButton();
        bu1.setIcon(i1);
        bu1.addActionListener(new miniMarket());
        bu2 = new JButton();
        bu2.setIcon(i2);
        bu2.addActionListener(new miniMarket());
        bu3 = new JButton();
        bu3.setIcon(i3);
        bu3.addActionListener(new miniMarket());

        l1 = new JLabel("price/unit: 25ETB   TotalPrice= ");
        l1.setHorizontalAlignment(bu1.RIGHT);
        l2 = new JLabel("price/unit: 50ETB    TotalPrice=");
        l2.setHorizontalAlignment(bu2.RIGHT);
        l3 = new JLabel("price/unit: 75ETB   TotalPrice= ");
        l3.setHorizontalAlignment(bu3.RIGHT);
        l4 = new JLabel("Total price of quantities you buy is ");

        pane1.add(b1);
        pane1.add(l1);
        pane1.add(b2);
        pane1.add(l2);
        pane1.add(b3);
        pane1.add(l3);
       

        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * // TODO Auto-generated method stub
         * throw new
         * UnsupportedOperationException("Unimplemented method 'actionPerformed'");
         */
        if (e.getSource() == bu2) {
            Tprice2++;
            Tprice += Tprice2;
            l2.setText(l2.getText() + Tprice2 + "ETB");
            l4.setText(l4.getText() + Tprice + "ETB");
        }
        if (e.getSource() == bu1) {
            Tprice1++;
            Tprice += Tprice1;
            l1.setText(l1.getText() + Tprice1 + "ETB");
            l4.setText(l4.getText() + Tprice + "ETB");
        }
        if (e.getSource() == bu3) {
            Tprice3++;
            Tprice += Tprice3;
            l3.setText(l3.getText() + Tprice3 + "ETB");
            l4.setText(l4.getText() + Tprice + "ETB");
        }
        /*
         * if (e.getSource() == bu1) {
         * Tprice1++;
         * Tprice += Tprice1;
         * l1.setText(l1.getText() + Tprice1);
         * l4.setText(l4.getText() + Tprice);
         * }
         */
    }
}
