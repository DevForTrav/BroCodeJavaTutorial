package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.cyan);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.orange);
        panel5.setBackground(Color.black);

        panel1.setPreferredSize(new Dimension(50,100));
        panel2.setPreferredSize(new Dimension(50,100));
        panel3.setPreferredSize(new Dimension(50,100));
        panel4.setPreferredSize(new Dimension(50,100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);
    }
}
