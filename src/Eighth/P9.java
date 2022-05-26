package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class P9 extends JFrame {

    public P9() {
        setTitle("Mouse event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouserListener());
        setSize(250,250);
        setVisible(true);
        setFocusable(true);
        c.requestFocus();
    }

    class MyMouserListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse pressed : "+e.getButton()+" at ("+e.getX()+", "+e.getY()+")");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse released : "+e.getButton()+" at ("+e.getX()+", "+e.getY()+")");

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse clicked : "+e.getButton()+" at ("+e.getX()+", "+e.getY()+")");
        }
    }

    public static void main(String[] args) {
        new P9();
    }
}
