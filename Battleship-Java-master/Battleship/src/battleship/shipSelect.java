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
        
        setResizable(false);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EmptyBorder panelBorder = new EmptyBorder(10, 10, 10, 10);
        
        welcome = new JLabel("Place your ships", SwingConstants.CENTER);
        
        welcome.setBorder(panelBorder);
        
        Continue = new JButton("Continue");
        Return = new JButton("Return");
        
        Continue.setSize(100, 25);
        Continue.setLocation(20, 245);
        Return.setSize(100, 25);
        Return.setLocation(150, 245);
        
        Continue.addActionListener(new start());
        
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
        
        //JRadioButton[][] jRadioButtons = new JRadioButton[10][];
        //ButtonGroup bg = new ButtonGroup();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 10));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JRadioButton btn = new JRadioButton();
                //btn.addActionListener(listener);
                btn.setName("Btn[" + i + "," + j + "]");
                //bg.add(btn);
                panel.add(btn);
                // can be used for other operations
                jRadioButtons[i][j] = btn;
            }
        }
        
        panel.setBounds(0,0, 400, 100);
        
        add(panel, BorderLayout.CENTER);
        
    }
    
    private class start implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            
            Game g = new Game();
            g.setVisible(true);
            
        }
        
    }
    
}
