package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class P8 extends JFrame {

    private JLabel[] keyMessage;
    public P8() {
        setTitle("Key Listener Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());
        keyMessage = new JLabel[3];

        keyMessage[0] = new JLabel(" geyKeyCode() ");
        keyMessage[1] = new JLabel(" geyKeyChar() ");
        keyMessage[2] = new JLabel(" geyKeyText() ");

        for(int i=0; i<keyMessage.length; i++) {
            c.add(keyMessage[i]);
            keyMessage[i].setBackground(Color.yellow);
        }
        setSize(300,150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
        setVisible(true);
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new P8();
    }
}
