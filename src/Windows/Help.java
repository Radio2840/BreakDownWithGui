package Windows;

import javax.swing.*;
import java.awt.*;

public class Help {
    JFrame gameframe=new JFrame("Game");
    JLabel fortest=new JLabel("TEST");
    Help() {
        fortest.setBounds(320,240,100,100);
        fortest.setBackground(Color.magenta);
        fortest.setFont(new Font(null,Font.PLAIN,25));
        gameframe.setSize(640,480);
        gameframe.add(fortest);
        gameframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameframe.setLayout(null);
        gameframe.setVisible(true);
    }
}
