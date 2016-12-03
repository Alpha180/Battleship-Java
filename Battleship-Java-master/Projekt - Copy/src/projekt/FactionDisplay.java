package projekt;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class FactionDisplay extends JFrame
{
    private JPanel userFactionPanel;
    private JPanel enemyFactionPanel;
    private JPanel titlePanel;
    private JPanel selectedUserFactionPanel; // use if bug
    private JPanel selectedEnemyFactionPanel;
    
    private JList selectFactionsList;
    private JList enemyFactionsList;
    
    private JTextField selectedFaction;
    private JTextField selectedFaction2;
    
    private JLabel label;
    private JLabel titleLabel;
    
    private JLabel selectUserFaction;
    private JLabel selectEnemyFaction;
    private JLabel selectedUserFaction;
    private JLabel selectedEnemyFaction;
    
    private String userSelection;
    private String enemySelection;
    
    private String[] factions = {"U.S.A", "Germany", "U.S.S.R", "Japan"};
    private String[] allies = {"U.S.A", "U.S.S.R"};
    private String[] axis = {"Germany", "Japan"};
          
    
    public FactionDisplay()
    {
        super("Faction Selection");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        buildTitlePanel();
        buildUserFactionPanel();
        
        add(userFactionPanel, BorderLayout.WEST);
        add(titlePanel, BorderLayout.NORTH);
        
        pack();
        setVisible(true);
    }
    
    
    
    
    private void buildUserFactionPanel()
    {
        userFactionPanel = new JPanel();
        userFactionPanel.setLayout(new BorderLayout());
        
        selectFactionsList = new JList(factions);
        selectFactionsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectFactionsList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        selectUserFaction = new JLabel("Select Your Faction");
        selectedUserFaction = new JLabel("Your Faction: ");
        selectedFaction = new JTextField(10);
        
        selectFactionsList.addListSelectionListener(new UserListListener());
        
        userFactionPanel.add(selectUserFaction, BorderLayout.NORTH);
        userFactionPanel.add(selectFactionsList, BorderLayout.CENTER);
        userFactionPanel.add(selectedUserFaction, BorderLayout.SOUTH);
        userFactionPanel.add(selectedFaction, BorderLayout.SOUTH);
    }
    
    private void buildEnemyFactionPanel(String[] axisOrAlly)
    {
        enemyFactionPanel = new JPanel();
        enemyFactionPanel.setLayout(new BorderLayout());
        
        enemyFactionsList = new JList(axisOrAlly);
        enemyFactionsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        enemyFactionsList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        ///selectenemyfactionslist action listener
        
        selectEnemyFaction = new JLabel("Select Your Enemy");
        selectedEnemyFaction = new JLabel("Enemy Faction: ");
        selectedFaction2 = new JTextField(10);
        
        enemyFactionsList.addListSelectionListener(new EnemyListListener());
        
        enemyFactionPanel.add(selectEnemyFaction, BorderLayout.NORTH);
        enemyFactionPanel.add(enemyFactionsList, BorderLayout.CENTER);
        enemyFactionPanel.add(selectedEnemyFaction, BorderLayout.SOUTH);
        enemyFactionPanel.add(selectedFaction2, BorderLayout.SOUTH);
    }
    
    private void buildTitlePanel()
    {
        titlePanel = new JPanel();
        titleLabel = new JLabel("WHO SHALL FIGHT?");
        titlePanel.add(titleLabel);
    }
    
    private void addEnemyPanel()
    {
        add(enemyFactionPanel, BorderLayout.EAST);
    }
    
    private class UserListListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            userSelection = (String) selectFactionsList.getSelectedValue();
            
            selectedFaction.setText(userSelection);
            
            //if else axis allies panel
            if (userSelection.equals(factions[0]) || userSelection.equals(factions[2]))
            {
                buildEnemyFactionPanel(axis);
                add(enemyFactionPanel, BorderLayout.EAST);
            }
            else
            {
                buildEnemyFactionPanel(allies);
                add(enemyFactionPanel, BorderLayout.EAST);
            }
        }
    }
    
    private class EnemyListListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            enemySelection = (String) enemyFactionsList.getSelectedValue();
            selectedFaction2.setText(enemySelection);
        }
    }
    
    public static void main(String[] args)
    {
        new FactionDisplay();
    }
}
