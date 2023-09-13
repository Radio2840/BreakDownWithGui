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



    public void SetMyGui() {
        myPanelForButtons.setBounds(0,100,sizeOfWindow.width,380);
        myPanelForButtons.add(playB);
        myPanelForButtons.add(helpB);
        myPanelForButtons.add(settingsB);
        myPanelForButtons.add(aboutMeB);
        playB.addActionListener(this);
        myPanelForMenu.setBounds(0,0,sizeOfWindow.width,100);
        menuLabel.setFont(new Font("Serif", Font.PLAIN, 80));
        //myPanelForButtons.setBackground(Color.pink);
        menu.setSize(640,480);
        myPanelForMenu.setLayout(new FlowLayout());
        myPanelForMenu.add(menuLabel);
        menu.add(myPanelForMenu);
        menu.add(myPanelForButtons);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setTitle("Menu");
        menu.setLayout(null);
        menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==playB) {
            menu.dispose();
            Game gameWindow = new Game();
        }
    }
}
