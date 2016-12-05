package battleship;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Alexander.Artigas001
 */
public class shipSelect extends JFrame
{
    
    protected JRadioButton[][] jRadioButtons = new JRadioButton[10][10];
    private JLabel welcome;
    private JButton Continue;
    private JButton Return;
    
    public shipSelect()
    {
        
        super("Select the positions of your ships");
        
        setResizable(false); // Cannot resize the window
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EmptyBorder panelBorder = new EmptyBorder(10, 10, 10, 10); // Setting the border
        
        welcome = new JLabel("Place your ships", SwingConstants.CENTER);
        
        welcome.setBorder(panelBorder);
        
        Continue = new JButton("Continue");
        Return = new JButton("Return");
        
        Continue.setSize(100, 25); // Setting size of the button
        Continue.setLocation(20, 245); // Setting location of the button
        Return.setSize(100, 25); // Setting size of the button
        Return.setLocation(150, 245); // Setting location of the button
        
        Continue.addActionListener(new start());
        
        // Creating panels
        
        JPanel east = new JPanel();
        east.setBorder(panelBorder);
        JPanel west = new JPanel();
        west.setBorder(panelBorder);
        JPanel south = new JPanel();
        {
            add(Continue);
            add(Return);
        }
        south.setBorder(panelBorder);
        
        buildPanel();
        
        add(welcome, BorderLayout.NORTH);
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(south, BorderLayout.SOUTH);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    void buildPanel()
    {
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 10));
        
        // Creating radio button grid
        
        for (int i = 0; i < 10; i++) 
        {
            
            for (int j = 0; j < 10; j++) 
            {
                
                JRadioButton btn = new JRadioButton();
                btn.setName("Btn[" + i + "," + j + "]");
                panel.add(btn);
                // can be used for other operations
                jRadioButtons[i][j] = btn;
                
            }
            
        }
        
        panel.setBounds(0,0, 400, 100); // Setting the bounds of the panel
        
        add(panel, BorderLayout.CENTER);
        
    }
    
    private class start implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            // Creating a new JFrame
            
            Game g = new Game();
            g.setVisible(true);
            
        }
        
    }
    
}
