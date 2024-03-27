package c77_anonimous_object;

import java.awt.*;      // ArrayList
import java.util.*;     //
import javax.swing.*;   // GUI


public class anonimous {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/*   NORMAL WAY
		ImageIcon AC = new ImageIcon("src\\cards\\1.png");
		JLabel AClabel = new JLabel(AC);
		deck.add(AClabel);
		
		ImageIcon TwoC = new ImageIcon("src\\cards\\2.png");
		JLabel TwoClabel = new JLabel(TwoC);
		deck.add(TwoClabel);         	... repeat for all 52 cards :(
		*/

		for(int i =1;i<= 53;i++) { //  Add Anonimous Objects Label
			deck.add(new JLabel(new ImageIcon("BroCode/c77_anonimous_object/all/"+i+".png"))); // NO NAME
			frame.add(deck.get(i-1)); //Array list starts from 0
		}
			
		//frame.add(deck.get(0));
		//frame.add(deck.get(1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
        frame.getContentPane().setBackground( new Color(0x005500) ); // ALSO ANONIMOUS Color
		frame.setLayout(new FlowLayout());      //adjust frames to fit screen
		frame.setVisible(true);
	}
}
