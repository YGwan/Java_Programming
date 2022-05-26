package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class P4 extends JFrame {

    private JLabel la = new JLabel("hello");
    public P4() {
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


    class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    public static void main(String[] args) {
        new P4();
    }

}
