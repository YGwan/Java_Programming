package Seventh;

import javax.swing.*;
import java.awt.*;

public class P6 extends JFrame {

    public P6(String title) {
        super(title);
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,3));

        Container c = getContentPane();
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));
        c.add(new JButton("10"));
        c.add(new JButton("11"));
        c.add(new JButton("12"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new P6("GridLayout");
    }
}
