package Windows;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Menu implements ActionListener{
    private JFrame menu = new JFrame("BreakDown");
    private JButton playB = new JButton("Play");
    private JButton settingsB = new JButton("Settings");
    private JButton aboutMeB = new JButton("About Me and by ego");
    private JButton helpB = new JButton("Help");
    //private Container contentPane = menu.getContentPane();
    private JLabel menuLabel = new JLabel("Menu");
    private JPanel myPanelForMenu = new JPanel();
    private JPanel myPanelForButtons = new JPanel();
    private Dimension sizeOfWindow = new Dimension(640,480);
    private Dimension invisibleBox = new Dimension(sizeOfWindow.width,5);
    public void myButtonsPannelSettings() {
        myPanelForButtons.setSize(300,380);
        myPanelForButtons.setLayout(new BoxLayout(myPanelForButtons,BoxLayout.Y_AXIS));
        myPanelForButtons.add(playB);
        myPanelForButtons.add(Box.createRigidArea(invisibleBox));
        myPanelForButtons.add(helpB);
        myPanelForButtons.add(Box.createRigidArea(invisibleBox));
        myPanelForButtons.add(settingsB);
        myPanelForButtons.add(Box.createRigidArea(invisibleBox));
        myPanelForButtons.add(aboutMeB);
    }
    public void myMenuPannelSettings(){
        myPanelForMenu.setSize(sizeOfWindow.width,100);
        menuLabel.setFont(new Font("Serif", Font.PLAIN, 80));
        myPanelForMenu.setLayout(new FlowLayout());
        myPanelForMenu.add(menuLabel);
    }
    public void setActionLisenerForButtons(){
        playB.addActionListener(this);
        helpB.addActionListener(this);
        settingsB.addActionListener(this);
        aboutMeB.addActionListener(this);
    }
    public void SetMyGui() {
        myMenuPannelSettings();
        myButtonsPannelSettings();
        setActionLisenerForButtons();
        //myPanelForButtons.setBackground(Color.pink);
        menu.setSize(640,480);
        menu.setLayout(new FlowLayout());
        menu.add(myPanelForMenu);
        menu.add(myPanelForButtons);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setTitle("Menu");
        menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==playB) {
            menu.dispose();
            Game gameWindow = new Game();
        }
        if(e.getSource()==helpB){
            Help helpWindow = new Help();
        }
        if(e.getSource()==aboutMeB){
            AboutMe aboutMeWindow = new AboutMe();
        }
        if(e.getSource()==settingsB){
            Settings settingsWindow = new Settings();
        }
    }
}
