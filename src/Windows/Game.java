package Windows;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingDeque;


public class Game implements KeyListener {
    JFrame gameframe=new JFrame("Game");
    JLabel plank = new JLabel();
    JLabel score = new JLabel("50");
    JLabel life = new JLabel();
    JPanel scorepanel = new JPanel();
    JLabel scoreLabel = new JLabel("SCORE: ");
    JLabel ball = new JLabel();
    JPanel gamepanel = new JPanel();
    JPanel deathZone = new JPanel();
    JPanel bricksZone = new JPanel();
    Random rand = new Random();
    public int ballX;
    public int ballY;

    public int velocityX = 2;
    public int velocityY = 2;



    public void myplanksettings(){
        //plank.setBounds(290, 380, 50, 5);
        try {
            BufferedImage image = ImageIO.read(new File("src/Images/plankDemo.png"));
            ImageIcon icon = new ImageIcon(image);
            plank.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void scorePanelSettings(){
        try {
            BufferedImage image = ImageIO.read(new File("src/Images/3lifes.png"));
            ImageIcon icon = new ImageIcon(image);
            life.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        scorepanel.setBounds(0,0,gameframe.getWidth(),50);
        scorepanel.setBackground(Color.BLUE);
        scorepanel.setLayout(new BoxLayout(scorepanel, BoxLayout.X_AXIS));
        scorepanel.add(scoreLabel);
        scorepanel.add(Box.createRigidArea(new Dimension(10, 0)));
        scorepanel.add(score);
        scorepanel.add(Box.createRigidArea(new Dimension(10, 0)));
        scorepanel.add(life);
        scorepanel.setVisible(true);
    } // JUST ADD OVERLAY
    public void ballSettings(){
        ball.setSize(10,10);


    }
    public void ballBehivor(){

    }
    public void deadZoneSettings(){
        deathZone.setLayout(new FlowLayout(FlowLayout.CENTER));
        deathZone.setSize(gameframe.getWidth(),50);
        deathZone.setBackground(Color.black);
    }
    public Color ColorRGB(){
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color(r,g,b);
    }
    public List<JLabel> generatebricks(){
        List<JLabel> bricks = new ArrayList();
        for(int i=0;i<42;i++) {
            JLabel forMyPeace = new JLabel();
            forMyPeace.setBackground(ColorRGB());
            forMyPeace.setVisible(true);
            forMyPeace.setOpaque(true);
            forMyPeace.setPreferredSize(new Dimension(60, 10));
            forMyPeace.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            bricks.add(forMyPeace);
        }
        return bricks;
    }
    public void brickZoneSettings(){
        bricksZone.setLayout(new GridLayout(7, 6, 5, 5));
        bricksZone.setSize(gameframe.getWidth(),300);
        bricksZone.setBackground(Color.BLACK); // brick 80x30 ^^
        List<JLabel> myListofBricks = generatebricks();
        myListofBricks.forEach((n) -> bricksZone.add(n));

    }
    public void gamepanelPanelSettings(){


        gamepanel.setSize(gameframe.getWidth(), gameframe.getHeight()-gamepanel.getHeight());

        gamepanel.setLayout(new BoxLayout(gamepanel, BoxLayout.Y_AXIS));
        deadZoneSettings();
        brickZoneSettings();
        ballSettings();

        gamepanel.add(scorepanel);
        gamepanel.add(Box.createRigidArea(new Dimension(gameframe.getWidth(),5)));
        gamepanel.add(bricksZone);
        gamepanel.add(Box.createRigidArea(new Dimension(gameframe.getWidth(),100)));
        gamepanel.add(plank);
        gamepanel.add(ball);
        gamepanel.add(deathZone);


        gamepanel.setBackground(Color.black);
    }
    Game() {
        gameframe.addKeyListener(this);
        gameframe.setSize(640,480);
        ballBehivor();
        myplanksettings();
        scorePanelSettings();
        gamepanelPanelSettings();
        gameframe.add(gamepanel,BorderLayout.CENTER);
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameframe.setVisible(true);
        gameframe.getContentPane().setBackground(Color.black);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        int x = plank.getX();
        int y = plank.getY();
            switch(e.getKeyChar()) {
                case 'a':
                    if(x==9){
                        break;
                    }
                    else {
                        plank.setLocation(x-8,341);
                    }


                    break;
                case 'd':
                    if(x==569){
                        break;
                    }
                    else {
                        plank.setLocation(x+8,341);
                    }


                    break;
                default:
                    // code block
            }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = plank.getX();
        int y = plank.getY();
        System.out.println(x);

        switch(e.getKeyCode()) {
            case 37:
                if(x==9){
                    break;
                }
                else {
                    plank.setLocation(x-8,341);
                }
                plank.setLocation(x-8,341);
                break;
            case 39:
                if(x==569){
                    break;
                }
                else {
                    plank.setLocation(x+8,y);
                }
                break;
            default:
                // code block
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    public static void main(String[] args) {
        new Game();
    }
}
