package Guan;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class MyFrame {

    public static void main(String[] args) {
        // Jframe is a GUI window to add components to:
        final int childDefaultWidth = 200;
        final int childDefaultHeight = 100;
        final int grid = 10; //leaving 10 pixel on the grid
        JFrame frame = new JFrame();

        //Setting up the setting for the Jframe
        frame.setTitle("Weight Tracking Device"); // Set the frame title
        frame.setSize(500,500); // set the x and y dimension of the frame.
        frame.setResizable(false); // prevent user from resizing the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application

        // Setting up background and Logo for the frame
        ImageIcon image = new ImageIcon("logo.PNG"); //create an ImageIcon
        frame.setIconImage(image.getImage()); // Change icon of frame
        frame.getContentPane().setBackground(new Color(200,220,255)); //Change color of the background

        // Layout Manager = Defines the natural layout for components within a container
        // FlowLayout = places components in a row, sized at their preferred size. If the horizontal space in the container is too small
        // It will use the next available row.

        //Use JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(new Color(250,150,150));
        panel.setLayout(new FlowLayout());

        //Setting up the title Image and title Label
        ImageIcon titleImage = new ImageIcon("titleImage.png"); //getting the icon for the titleLabel
        Image titleImg = titleImage.getImage(); // Transform the image
        Image newImg = titleImg.getScaledInstance(40,40, Image.SCALE_SMOOTH); //Transform the image smoothly
        titleImage = new ImageIcon(newImg);

        //Set up titleLabel
        JLabel titleLabel = new JLabel("Weight Tracking: ", titleImage, 0); // set the text of the label and create the label
        titleLabel.setVerticalAlignment(0); //set the vertical alignment to 0
        titleLabel.setFont(new Font("MV Boli", Font.BOLD, 16)); // Set font to MV BOLI, BOLD it, and set the size to 16
//        titleLabel.setBounds(grid,grid,childDefaultWidth,childDefaultHeight); // Set the size 200*100 and location as (0,0)

        panel.add(titleLabel); //TODO: add this to a Boarder Layout instead of a panel layout.

        //Text box and label for the date: coordinate something (0,1) and (0,2)
        JLabel dateLabel = new JLabel("Date: ");         //set dateLabel
        JTextField dateTextField = new JTextField("MM/DD/YYYY"); //set dateTextField
        panel.add(dateLabel);
        panel.add(dateTextField);


        // Add everything and show the frame.
        frame.add(panel);
        frame.setVisible(true);

    }

}
