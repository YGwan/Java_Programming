package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class P7 extends JFrame {

    public P7() {
        setTitle("Key event listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        setSize(250,250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Key type");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            char ch = e.getKeyChar();
            System.out.println("Key pressed "+ ch +", "
            + code+", "+ KeyEvent.getKeyText(code));
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Key released");
        }
    }

    public static void main(String[] args) {
        new P7();
    }
}
