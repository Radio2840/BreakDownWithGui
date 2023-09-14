package Windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.file.Path;

public class Game implements KeyListener {
    JFrame gameframe=new JFrame("Game");
    JLabel plank=new JLabel();

    Game() {

        plank.setBounds(320,340,90,10);
        plank.setBackground(Color.orange);
        plank.setOpaque(true);
        gameframe.addKeyListener(this);
        gameframe.setSize(640,480);
        gameframe.add(plank);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameframe.setLayout(null);
        gameframe.setVisible(true);
        gameframe.getContentPane().setBackground(Color.black);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int x = plank.getX();
        int y = plank.getY();
        switch(e.getKeyChar()) {
            case 'a':
                plank.setLocation(x-6,y);
                break;
            case 'd':
                plank.setLocation(x+6,y);
                break;
            default:
                // code block
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = plank.getX();
        int y = plank.getY();
        switch(e.getKeyCode()) {
            case 37:
                plank.setLocation(x-6,y);
                break;
            case 39:
                plank.setLocation(x+6,y);
                break;
            default:
                // code block
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
