package Windows;

import javax.swing.*;
import java.awt.*;

public class AboutMe {

        JFrame aboutMeFrame=new JFrame("About me");
        JLabel aboutMeLabel=new JLabel("About me");
        JLabel AboutMeMore = new JLabel();

        AboutMe() {

            aboutMeFrame.setSize(640,480);
            aboutMeFrame.setBackground(Color.BLACK);
            aboutMeLabel.setBounds(0,0,aboutMeFrame.getWidth(),100);
            AboutMeMore.setBounds(0,100,aboutMeFrame.getWidth(),aboutMeFrame.getHeight()-aboutMeLabel.getHeight());
            AboutMeMore.setText("Hello my nick id Radio do not ask why." + "\n"+
                    "I doing this game for my learn gui. My code is a total spaggetii but I plan to fix it later." + "\n"+
                    "I am learning Gui for my first time. Mabe is better for me if I use book and not internet =-=");
            aboutMeLabel.setBackground(Color.gray);
            aboutMeLabel.setFont(new Font("Sofia",Font.PLAIN,80));
            aboutMeFrame.add(aboutMeLabel);
            aboutMeFrame.add(AboutMeMore);
            aboutMeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            aboutMeFrame.setLayout(new FlowLayout());
            aboutMeFrame.setVisible(true);
        }
    }

