package SliderLesson;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();

        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);


        panel.add(label);
        panel.add(slider);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("degrees C = " + slider.getValue());
    }
}
