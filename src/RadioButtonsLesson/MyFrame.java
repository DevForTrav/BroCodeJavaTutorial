package RadioButtonsLesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        pizzaButton = new JRadioButton("pizza");
        pizzaButton.addActionListener(this);
        hamburgerButton = new JRadioButton("hamburger");
        hamburgerButton.addActionListener(this);
        hotdogButton = new JRadioButton("hotdog");
        hotdogButton.addActionListener(this);

        ButtonGroup group = new ButtonGroup();

        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton) {
            System.out.println("Pizza is coming right up");
        } else if(e.getSource() == hamburgerButton) {
            System.out.println("Bringing your burger out in a  sec");
        } else if(e.getSource() == hotdogButton) {
            System.out.println("Bringing your hotdog out in a  sec");
        }
    }
}
