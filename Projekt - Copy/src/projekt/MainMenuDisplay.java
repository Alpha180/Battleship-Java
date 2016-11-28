
package projekt;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class MainMenuDisplay extends JFrame
{
    private JPanel buttonsPanel;
    private JPanel mainMenuDisplay;
    
    private JButton newGameButton;
    private JButton loadGameButton;
    private JButton exitButton;
    
    public MainMenuDisplay()
    {
        super("Battlefrigate");
        buttonsPanel = new JPanel();
        
        //set layout to
        setLayout(new GridLayout(4, 1));
        
        newGameButton = new JButton("New Game");
        loadGameButton = new JButton("Load Game");
        
        exitButton = new JButton("Exit");
    }
    
    private void buildButtonsPanel
}
