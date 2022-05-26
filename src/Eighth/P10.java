package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class P10 extends JFrame{

    private JLabel la = new JLabel("No Mouse Event");

    public P10() {
        setTitle("Mouse event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyMouseListener listener = new MyMouseListener();

        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.add(la);
        setSize(300,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            la.setText("MouseReleased("+e.getX()+", "+e.getY()+")");
        }


        @Override
        public void mouseEntered(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.CYAN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
        }
    }

    public static void main(String[] args) {
        new P10();
    }
}
