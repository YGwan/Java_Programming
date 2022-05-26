package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class P6 extends JFrame {

    public P6() {
        setTitle("Key event listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        setSize(250,250);
        c.setFocusable(true);
        c.requestFocus();
        setVisible(true);
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Key type");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Key pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Key released");
        }
    }

    public static void main(String[] args) {
        new P6();
    }
}
