package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class P5 extends JFrame {

    private JLabel la = new JLabel("hello");
    public P5() {
        setTitle("Mouse event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());
        la.setSize(50,20);
        la.setLocation(30,30);
        c.add(la);
        setSize(250,250);
        setVisible(true);

    }

    class MyMouseListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }
    }
    public static void main(String[] args) {
        new P4();
    }

}
