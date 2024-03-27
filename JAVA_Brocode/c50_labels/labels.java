package c50_labels;

import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;

public class labels {
    public static void main(String[] args) {

        
        
        
        String  path = "C:\\Users\\ariel\\OneDrive\\Documentos\\Visual_Studio_Projecs\\JAVA\\BroCode\\c50_labels";
        ImageIcon image = new ImageIcon( path + "/ea2.png");           // ICON
        MyFrame frame = new MyFrame();
        
        JLabel label  = new JLabel();            // Create
        frame.add(label);
        frame.setSize(500,500 ); 
        

        label.setText("Bro you code ? come with");    // Text  
        label.setIcon(image);                             //  image
        label.setIconTextGap(50);
        label.setHorizontalTextPosition(JLabel.CENTER);   // LEFT  RIGT    CENTER  of image
        label.setVerticalTextPosition(JLabel.TOP);       // TOP  BOTTOM   CENTER  of image
        label.setVerticalAlignment(JLabel.TOP);          //                       img within lable
        label.setHorizontalAlignment(JLabel.CENTER);     //                       img within lable
        
        
        label.setFont(new Font("Lucida Console",Font.PLAIN,20));
        /*    https://www.tutorialbrain.com/css_tutorial/css_font_family_list/
        |Arial  |Arial Black |Courier  |Georgia  |Lucida  |Lucida Console |Consolas |Myanmar Text               
        |Impact |Trebuchet MS |Times New Roman |Ebrima 
        |Franklin Gothic Medium (BOLD)| Malgun Gothic | MS Gothic      
        |Comic Sans MS |MV Boli |Segoe Print |Segoe Script     
        Symbol |Webdings |Wingdings                   https://web.mit.edu/jmorzins/www/fonts.html   */
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        Color blu = new Color(0x0050A0);
        label.setForeground(blu);
        Border border = BorderFactory.createLineBorder(blu, 30);
        label.setBorder(border);

        frame.pack();
        label.setBounds(100,100,200,200);
        //frame.setLayout(null);
    }

}
