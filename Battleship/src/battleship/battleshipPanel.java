package battleship;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Alexander Artigas
 */
public class battleshipPanel extends JPanel
{
    
    private JButton startGame;
    private JButton options;
    private JButton exit;
    
    public battleshipPanel()
    {
        
        setLayout(null);
        
        setPreferredSize(new Dimension(288, 288));
        
        startGame = new JButton("Start Game");
        options = new JButton("Options");
        exit = new JButton("Exit");

        startGame.setSize(100, 50); // Setting size of the button
        startGame.setLocation(90, 40); // Setting location of the button
        options.setSize(100, 50); // Setting size of the button
        options.setLocation(90, 110); // Setting location of the button
        exit.setSize(100, 50); // Setting size of the button
        exit.setLocation(90, 180); // Setting location of the button
        
        options.addActionListener(new option());
        exit.addActionListener(new exit());
        startGame.addActionListener(new game());
        
        add(startGame);
        add(options);
        add(exit);
    }
    
    private class exit implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            System.exit(0);
            
        }
        
    }
    
    private class game implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            // Creating a new JFrame 
            
            shipSelect ship = new shipSelect();
            ship.setVisible(true);
            
        }
        
    }
    
    private class option implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            //Creating a new JFrame 
            
            opMenu op = new opMenu();
            op.setVisible(true);
            
        }
        
    }
    
}
