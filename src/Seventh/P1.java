package Seventh;

import javax.swing.*;
import java.awt.*;

public class P1 extends JFrame {

   public P1() {
       setTitle("300x300 Swing Frame");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(300, 300);
       createMenu();

       Container contentPane = getContentPane();
       JButton button = new JButton("Click");
       contentPane.add(button);
       setVisible(true);

   }

   private void createMenu() {
       JMenuBar mBar = new JMenuBar();
       JMenu screenMenu = new JMenu("Screen");
       screenMenu.add(new JMenuItem("Load"));
       screenMenu.add(new JMenuItem("Hide"));
       screenMenu.add(new JMenuItem("Exit"));

       mBar.add(screenMenu);
       setJMenuBar(mBar);
   }

   public static void main(String[] args) {

        P1 frame = new P1();
    }
}