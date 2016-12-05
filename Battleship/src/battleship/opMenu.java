package battleship;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Alexander Artigas
 */
public class opMenu extends JFrame
{
    
    private JLabel options;
    private JButton musicOnOff;
    private JButton Return;
    
    public opMenu()
    {
        
        // Creating the options menu
        
        super("Select the positions of your ships");
        
        setSize(500, 150); // Setting window size
        
        setResizable(false); // Cannot resize window
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        options = new JLabel("Options", SwingConstants.CENTER);
        
        add(options, BorderLayout.NORTH);
        
        buildPanel(); // Creating the center panel with buttons
        
    }
    
    void buildPanel()
    {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        musicOnOff = new JButton("Music On/Off");
        
        musicOnOff.setSize(150, 25); // Setting size of the button
        musicOnOff.setLocation(170, 30); // Setting location of the button
        
        Return = new JButton("Return");
        
        Return.setSize(150, 25); // Setting size of the button
        Return.setLocation(170, 80); // Setting location of the button
         
        add(Return);
        
        musicOnOff.addActionListener(new fileCheck());
        Return.addActionListener(new back());
        
        add(musicOnOff);
        
        panel.setBounds(0,0, 400, 100); // Setting bounds
        
        add(panel, BorderLayout.CENTER);
        
    }
    
    private class fileCheck implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            
            
        }
            
    }   

    private class back implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            
            
        }
            
    }   

}
