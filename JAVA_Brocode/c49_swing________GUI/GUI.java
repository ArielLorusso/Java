package c49_swing________GUI;
/*
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
*/
public class GUI {
    
    public static void main(String[] args) {


        /*
        String  path = "C:\\Users\\ariel\\OneDrive\\Documentos\\Visual_Studio_Projecs\\JAVA\\BroCode\\c49_swing_GUI";
        JFrame frame = new JFrame();
        frame.setSize(400,400);                                         // size
        frame.setTitle("Hello World Window GUI");                       // title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           // END
        frame.setResizable(false);                                      // resize                         
        ImageIcon image = new ImageIcon( path + "/ea.png");             // Icon
        frame.setIconImage(image.getImage());                   
        frame.getContentPane().setBackground(Color.green);              // color
        frame.setVisible(true);                                         // show              
         */
        MyFrame frame = new MyFrame();
        frame.setSize(200,200);
    }
}