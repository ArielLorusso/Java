package c80_lambda;

import javax.swing.JFrame;
import javax.swing.JButton;


public class MyFrame extends JFrame{

    JButton myButton  = new JButton("MY BUTTON 1");
    JButton myButton2 = new JButton("MY BUTTON 2");


    MyFrame(){
/*  /////////////////////////////// OLD WAY ////////////////////////
        myButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This is the button 1");
            }
        });     
///////////////////////////////////////////////////////////////   */
        myButton.addActionListener(
            (e) -> System.out.println("This is the button 1")       
        );	
        myButton2.addActionListener(
            (e) -> System.out.println("This is the button 2")        
        );	
        
        this.add(myButton);
        this.add(myButton2);
        myButton.setBounds(100, 100, 200, 100);
        myButton2.setBounds(100, 200, 200, 100);        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}