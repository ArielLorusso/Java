package c49_swing________GUI;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame(){        
        this.setVisible(true);                                      //show     best practice do it at end
        String  path = "C:\\Users\\ariel\\OneDrive\\Documentos\\Visual_Studio_Projecs\\JAVA\\BroCode\\c49_swing_GUI";
        this.setSize(400,400);                          // size
        this.setTitle("Hello World Window GUI");                // title
        
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  // NOTHING cant Alt+F4  kill by task-man
        //this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);        // DEFAULT still runs but invidible           
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );       // END PROG.
        this.setResizable(false);  //cant resize       

        ImageIcon image = new ImageIcon( path + "/ea.png");           // ICON
        this.setIconImage(image.getImage());

        Color violet = new Color(100,000,100) ;              // new Color(0x640064)   //Color.GRAY
        this.getContentPane().setBackground(violet) ;
         
    }
}
