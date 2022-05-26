package Seventh;

import javax.swing.*;
import java.awt.*;

public class P7 extends JFrame {

    public P7(String title) {
        super(title);
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));

        Container c = getContentPane();
        c.add(new JLabel("Name"));
        c.add(new JTextField(""));
        c.add(new JLabel("Student Id"));
        c.add(new JTextField(""));
        c.add(new JLabel("Major"));
        c.add(new JTextField(""));
        c.add(new JLabel("Subjet"));
        c.add(new JTextField(""));
        setVisible(true);
    }

    public static void main(String[] args) {
        new P7("GridLayout2");
    }
}
