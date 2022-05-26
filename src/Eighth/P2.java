package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2 extends JFrame {

    public P2() {
        setTitle("Action Event Listener Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(350,150);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action")) b.setText("Biction");
            else b.setText("Action");
            setTitle(b.getText());
        }

    }

    public static void main(String[] args) {
        new P2();
    }
}
