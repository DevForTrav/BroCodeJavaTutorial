package JOptionPaneLesson;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE );

//        int answer = JOptionPane.showConfirmDialog(null, "Hellerrrrr!!", "title", JOptionPane.YES_NO_CANCEL_OPTION);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name );
        String[] responses = {"No, you're awesome!", "Thank you!", "*blush*"};

        JOptionPane.showOptionDialog(
                null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                0
        );


    }
}
