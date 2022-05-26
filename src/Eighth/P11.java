package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class P11 extends JFrame {

    private final JLabel la = new JLabel("Hello");

    public P11() {
        setTitle("Assignment");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        c.add(la);
        la.setSize(100,20);
        la.setLocation(50,50);
        setSize(500,500);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();

    }

    class MyKeyListener extends KeyAdapter {


        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            Component c = (Component)e.getSource();
            if(keyCode == KeyEvent.VK_F1) {
                c.setBackground(Color.GREEN);
            } else if(keyCode == KeyEvent.VK_5) {
                c.setBackground(Color.YELLOW);
            } else if(keyCode == KeyEvent.VK_UP) {
                la.setLocation(la.getX(), la.getY()-10);
            } else if(keyCode == KeyEvent.VK_DOWN) {
                la.setLocation(la.getX(), la.getY()+10);
            }else if(keyCode == KeyEvent.VK_LEFT) {
                la.setLocation(la.getX()-10, la.getY());
            }else if(keyCode == KeyEvent.VK_RIGHT) {
                la.setLocation(la.getX()+10, la.getY());
            }


        }
    }

    public static void main(String[] args) {
        new P11();
    }
}
