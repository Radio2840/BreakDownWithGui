package Windows;

import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame gameframe=new JFrame("Game");
    JLabel fortest=new JLabel("TEST");
    Game() {
        fortest.setBounds(320,240,100,100);
        fortest.setBackground(Color.magenta);
        fortest.setFont(new Font(null,Font.PLAIN,25));
        gameframe.setSize(640,480);
        gameframe.add(fortest);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameframe.setLayout(null);
        gameframe.setVisible(true);
    }
}
