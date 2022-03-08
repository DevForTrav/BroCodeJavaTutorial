package ProgressBarLesson;

import javax.swing.*;

public class ProgressBarDemo {

    JFrame frame;
    JProgressBar bar;

    ProgressBarDemo() {
        bar = new JProgressBar();
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);


        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(bar);
        frame.setVisible(true);

        fill();
    }
    public void fill() {
        int counter = 0;

        while (counter < 100) {
            bar.setValue(counter);
            try{
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter += 1;
        }

    }
}
