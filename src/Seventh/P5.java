package Seventh;

import javax.swing.*;
import java.awt.*;

public class P5 extends JFrame {

    public P5(String title) {
        super(title);
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(30,20));

        c.add(new JButton("north"), BorderLayout.NORTH);
        c.add(new JButton("center"), BorderLayout.CENTER);
        c.add(new JButton("south"), BorderLayout.SOUTH);
        c.add(new JButton("east"), BorderLayout.EAST);
        c.add(new JButton("west"), BorderLayout.WEST);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P5("BorderLayout");
    }
}
