package Eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class P3 extends JFrame {

    public P3() {
        setTitle("Action Event Listener Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action"))
                    b.setText("Biction");
                else
                    b.setText("Action");
                setTitle(b.getText());
            }
        });
        c.add(btn);
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P1();
    }


}
