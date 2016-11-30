package battleship;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alexander Artigas
 */
public class battleshipFrame extends JFrame
{
    
    private battleshipPanel menu;
    private JButton left;
    private JButton right;
    private JButton bot;
    private JLabel welcome;
    
    public battleshipFrame()
    {
        
        super("Battleship");
        
        setMaximumSize(new Dimension(800, 600));
        
        welcome = new JLabel("Welcome to battleship!", SwingConstants.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        JPanel test1 = new JPanel();
        test1.setBounds(0,0, 400, 100);
        JPanel test2 = new JPanel();
        test2.setBounds(0,0, 400, 100);
        JPanel test3 = new JPanel();
        test3.setBounds(0, 0, 400, 100);
        
        menu = new battleshipPanel();
        left = new JButton();
        right = new JButton();
        bot = new JButton();
        
        add(menu, BorderLayout.CENTER);
        add(welcome, BorderLayout.NORTH);
        add(test2, BorderLayout.WEST);
        add(test1, BorderLayout.EAST);
        add(test3, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
        
    }
    
}
