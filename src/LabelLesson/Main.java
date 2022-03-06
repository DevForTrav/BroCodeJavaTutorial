package LabelLesson;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setForeground(Color.white);

        JFrame frame = new JFrame();

        frame.setTitle("JFrame Title Goes Here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.add(label);
    }
}
