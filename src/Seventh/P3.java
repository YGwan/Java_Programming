package Seventh;

import javax.swing.*;
import java.awt.*;

public class P3 extends JFrame {

    public P3(String title) {
        super(title);
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container c = getContentPane();
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mult"));
        c.add(new JButton("div"));
        c.add(new JButton("calculate"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new P3("FlowLayout");
    }
}
