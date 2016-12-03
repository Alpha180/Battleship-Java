package battleship;

import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.io.*;
import sun.audio.*;


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
    
    public battleshipFrame() throws FileNotFoundException, IOException
    {
        
        super("Battleship");
        
        String gongFile = "Menu.wav";
        InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
        
        setSize(new Dimension(300, 300));
        setResizable(false);
        
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
        
        setLocationRelativeTo(null);
        
        //pack();
        setVisible(true);
        
        
    }
    
}
