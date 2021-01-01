package Guan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Tutorial {
    public static void main(String[] args) {

        // Create a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);

        // JPanel: a GUI component that functions as a container that holds other components
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setBounds(0,0,250,250);
        frame.add(panel);

        // JButton: A button that performs an action when clicked on
        JButton button = new JButton();
        button.setBounds(200,100,100,50);
        button.setText("CLICK ON ME");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display center the dialog when the button is pressed
                JDialog d = new JDialog(frame, "OMG YOU PRESSED!", true);
                d.setLocationRelativeTo(frame);
                d.setVisible(true);
            }
        });
        frame.add(button);


        //Button 2
        JButton button2 = new JButton();
        button2.setText("CLICK ON ME TOO");
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource() == button2) {
//                    System.out.println("HELLO WORLD");
//                }
//            }
//        }
//        );
        // USING LAMBDA TO MAKE IT EASIER
        button2.addActionListener(e -> System.out.println("HI"));
        button2.setFocusable(false); // it gets rid of the box next to the text of the button

        button2.setBounds(0,1,200,200);

        frame.add(button2);




        JLabel label = new JLabel();
        label.setText("HELLO BUDDY!");
        panel.add(label); // We can add the text into a panel : )


    }

}
