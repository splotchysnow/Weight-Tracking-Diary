package Guan;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public static void main(String[] args) {
        // Jframe is a GUI window to add components to:
        JFrame frame = new JFrame();

        frame.setTitle("Weight Tracking Device"); // Set the frame title
        frame.setSize(420,420); // set the x and y dimension of the frame.
        frame.setResizable(false); // prevent user from resizing the frame.
        frame.setVisible(true); // Set the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application

        ImageIcon image = new ImageIcon("logo.PNG"); //create an ImageIcon
        frame.setIconImage(image.getImage()); // Change icon of frame
        frame.getContentPane().setBackground(new Color(200,220,255)); //Change color of the background

    }

}
