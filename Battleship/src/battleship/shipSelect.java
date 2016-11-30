package battleship;

import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander.Artigas001
 */
public class shipSelect extends JFrame
{
    
    protected JRadioButton[][] jRadioButtons = new JRadioButton[10][10];
    //private JRadioButton[][] ships;
    private JLabel welcome;
    private JButton Continue;
    //private JPanel selection;
    
    public shipSelect()
    {
        
        super("Select the positions of your ships");
        
        setMaximumSize(new Dimension(800, 600));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //selection.setLayout(new GridLayout(10, 10));
        
        //ships = new JRadioButton[][];
        
        welcome = new JLabel("Please place your ships", SwingConstants.CENTER);
        
        Continue = new JButton();
        
        Continue.setSize(100, 50);
        Continue.setLocation(64, 200);
        
        JPanel east = new JPanel();
        east.setBounds(0,0, 400, 100);
        JPanel west = new JPanel();
        west.setBounds(0,0, 400, 100);
        JPanel south = new JPanel();
        {
            add(Continue);
        }
        south.setBounds(0, 0, 400, 100);
        
        buildPanel();
        
        add(welcome, BorderLayout.NORTH);
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(south, BorderLayout.SOUTH);
        
        pack();
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
}
