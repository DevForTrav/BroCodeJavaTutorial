package PanelsLesson;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Bro, do you code?");
        label.setForeground(Color.white);
        label.setBounds(0, 0, 200, 5);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(0,250,500,250);


        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title Goes Here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
//        frame.setResizable(false);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(blackPanel);

    }

}
