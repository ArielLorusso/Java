package c69_mouse_Listener;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
                                    //  MouseListener extends EventListener
public class MyFrame extends JFrame implements MouseListener{
    JLabel label1;
    JLabel label2;
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);	
		
		 label1 = new JLabel();
		label1.setBounds(0, 0, 100, 100);
		label1.setBackground(Color.red);
		label1.setOpaque(true);
		label1.setText("I dont Listen");

        label2 = new JLabel();
		label2.setBounds(200, 0, 100, 100);
		label2.setBackground(Color.red);
		label2.setOpaque(true);
		label2.addMouseListener(this);        // LISTENER IS IN 2nd LABEL
        label2.setText("Click Me !");

		this.add(label1);
        this.add(label2);
		this.setVisible(true);
	}

    // MouseEvent in a classs witch extends InputEvent

    @Override // Invoked when the mouse button has been clicked (pressed and released)
        public void mouseClicked(MouseEvent e) {      // if you move mouse is not click
            System.out.println("You clicked the mouse");
            label1.setBackground(Color.magenta);
        }
        
        @Override           // Invoked when a mouse button has been pressed on a component
        public void mousePressed(MouseEvent e) {
            System.out.println("You pressed the mouse");
            label1.setBackground(Color.yellow);
        }
        
        @Override       // Invoked when a mouse button has been released on a component
        public void mouseReleased(MouseEvent e) {
            System.out.println("You released the mouse");
            label1.setBackground(Color.green);
        }
        
        @Override       // Invoked when the mouse enters a component
        public void mouseEntered(MouseEvent e) {
            System.out.println("You entered the component");
            label1.setBackground(Color.blue);
        }
        
        @Override       // Invoked when the mouse exits a component
        public void mouseExited(MouseEvent e) {
            System.out.println("You exited the component");
            label1.setBackground(Color.red);
        }
}

