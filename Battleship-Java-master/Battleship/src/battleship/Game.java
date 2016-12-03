package battleship;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Alexander.Artigas001
 */
public class Game extends JFrame
{
    
    private JRadioButton[][] xRadioButtons = new JRadioButton[10][10];
    private JRadioButton[][] zRadioButtons = new JRadioButton[10][10];
    private JButton fire;
    private JLabel Carrier;
    private JLabel Battleship;
    private JLabel Cruiser;
    private JLabel Submarine;
    private JLabel Destroyer;
    private JLabel Carrier2;
    private JLabel Battleship2;
    private JLabel Cruiser2;
    private JLabel Submarine2;
    private JLabel Destroyer2;
    
    public Game()
    {
        
        super("Fight!");
        
        setSize(new Dimension(500, 500));
        setResizable(false);
        
        EmptyBorder panelBorder = new EmptyBorder(10, 10, 10, 10);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        fire = new JButton("Fire");
        
        JPanel south = new JPanel();
        {
            add(fire);
        }
        
        buildPanel();
        buildPanel2();
        buildPanel3();
        buildPanel4();
        
        south.setBorder(panelBorder);
        
        add(south, BorderLayout.SOUTH);
        
        fire.setBounds(0, 0, 400, 100);
        fire.setSize(100, 25);
        fire.setLocation(151, 455);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    void buildPanel()
    {
        
        //JRadioButton[][] jRadioButtons = new JRadioButton[10][];
        //ButtonGroup bg = new ButtonGroup();
        JPanel panel = new JPanel();
        //panel.setSize(500, 500);
        panel.setLayout(new GridLayout(10, 10));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JRadioButton btn = new JRadioButton();
                //btn.addActionListener(listener);
                btn.setName("Btn[" + i + "," + j + "]");
                //bg.add(btn);
                panel.add(btn);
                // can be used for other operations
                xRadioButtons[i][j] = btn;
            }
        }
        
        panel.setBounds(0,0, 400, 100);
        
        EmptyBorder panelBorder = new EmptyBorder(10, 10, 10, 10);
        
        panel.setBorder(panelBorder);
        
        add(panel, BorderLayout.CENTER);
        pack();
    }
    
    void buildPanel2()
    {
        
        //JRadioButton[][] jRadioButtons = new JRadioButton[10][];
        //ButtonGroup bg = new ButtonGroup();
        JPanel panel2 = new JPanel();
        panel2.setSize(100, 100);
        panel2.setLayout(new GridLayout(10, 10));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JRadioButton btn = new JRadioButton();
                //btn.addActionListener(listener);
                btn.setName("Btn[" + i + "," + j + "]");
                //bg.add(btn);
                panel2.add(btn);
                // can be used for other operations
                zRadioButtons[i][j] = btn;
            }
        }
        
        panel2.setBounds(0,0, 400, 100);
        
        EmptyBorder panelBorder = new EmptyBorder(10, 10, 10, 10);
        
        panel2.setBorder(panelBorder);
        
        add(panel2, BorderLayout.NORTH);
        pack();
    }
    
    void buildPanel3()
    {
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(5, 1));
        
        Carrier = new JLabel("Carrier", SwingConstants.RIGHT);
        Battleship = new JLabel("Battleship", SwingConstants.RIGHT);
        Cruiser = new JLabel("Cruiser", SwingConstants.RIGHT);
        Submarine = new JLabel("Submarine", SwingConstants.RIGHT);
        Destroyer = new JLabel("Destroyer", SwingConstants.RIGHT);
        
        panel3.add(Carrier);
        panel3.add(Battleship);
        panel3.add(Cruiser);
        panel3.add(Submarine);
        panel3.add(Destroyer);
        
        panel3.setBounds(0,0, 400, 100);
        
        panel3.setBorder(BorderFactory.createTitledBorder("Enemy Ships"));
        
        add(panel3, BorderLayout.EAST);
        pack();
    }
    
    void buildPanel4()
    {
        
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(5, 1));
        
        Carrier2 = new JLabel("Carrier");
        Battleship2 = new JLabel("Battleship");
        Cruiser2 = new JLabel("Cruiser");
        Submarine2 = new JLabel("Submarine");
        Destroyer2 = new JLabel("Destroyer");
        
        panel4.add(Carrier2);
        panel4.add(Battleship2);
        panel4.add(Cruiser2);
        panel4.add(Submarine2);
        panel4.add(Destroyer2);
        
        panel4.setBounds(0,0, 400, 100);
        
        panel4.setBorder(BorderFactory.createTitledBorder("Friendly Ships"));
        
        add(panel4, BorderLayout.WEST);
        pack();
    }
    
}
