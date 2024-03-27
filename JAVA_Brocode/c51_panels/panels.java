package c51_panels;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class panels {
    public static void main(String[] args) {

        JPanel panBlu = new JPanel();
        panBlu.setBackground(Color.BLUE);
        panBlu.setBounds(100,100,200,200);
        JPanel panRed = new JPanel();
        panRed.setBackground(Color.RED);
        panRed.setBounds(0,0,200,200);
        JPanel panGre = new JPanel();
        panGre.setBackground(Color.GREEN);
        panGre.setBounds(0,0,400,400);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        
        frame.add(panBlu);
        frame.add(panRed);
        frame.add(panGre);

    }

}
