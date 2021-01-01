package Guan;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public static void main(String[] args) {
        // Jframe is a GUI window to add components to:
        JFrame frame = new JFrame();

        //Setting up the setting for the Jframe
        frame.setTitle("Weight Tracking Device"); // Set the frame title
        frame.setSize(420,420); // set the x and y dimension of the frame.
        frame.setResizable(false); // prevent user from resizing the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setLayout(null);

        // Setting up background and Logo for the frame
        ImageIcon image = new ImageIcon("logo.PNG"); //create an ImageIcon
        frame.setIconImage(image.getImage()); // Change icon of frame
        frame.getContentPane().setBackground(new Color(200,220,255)); //Change color of the background

        //Setting up the title Image and title Label
        ImageIcon titleImage = new ImageIcon("titleImage.png"); //getting the icon for the titleLabel
        Image titleImg = titleImage.getImage(); // Transform the image
        Image newImg = titleImg.getScaledInstance(40,40, Image.SCALE_SMOOTH); //Transform the image smoothly
        titleImage = new ImageIcon(newImg);

        JLabel titleLabel = new JLabel("Weight Tracking: ", titleImage, 0); // set the text of the label and create the label
        titleLabel.setVerticalAlignment(0); //set the vertical alignment to 0
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 16)); // Set font to MV BOLI, BOLD it, and set the size to 16
        titleLabel.setBounds(0,0,200,100); // Set the size 200*100 and location as (0,0)
        frame.add(titleLabel);
//        frame.pack(); //Automatically adjust the size of all component in the GUI automatically

        // Run the frame
        frame.setVisible(true); // Set the frame visible
    }

}
