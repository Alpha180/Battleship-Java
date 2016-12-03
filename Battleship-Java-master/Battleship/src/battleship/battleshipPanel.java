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

        startGame.setSize(100, 50);
        startGame.setLocation(90, 40);
        options.setSize(100, 50);
        options.setLocation(90, 110);
        exit.setSize(100, 50);
        exit.setLocation(90, 180);
        
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
            
            shipSelect ship = new shipSelect();
            ship.setVisible(true);
            
        }
        
    }
    
}
