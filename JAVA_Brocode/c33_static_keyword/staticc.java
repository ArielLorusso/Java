package c33_static_keyword;

import java.util.ArrayList;

public class staticc {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Patrick");
		
		System.out.println(Friend.numberOfFriends);  // is static atribute thus shared between all 
													  //  same value for all friends  
		////////////////////// BONUS ArrayList of OBJ ///////////////////////////////////

		ArrayList <Friend> friend = new ArrayList <Friend>();
		friend.add( friend1);
		friend.add( friend2);
		friend.add( friend3);



	}
}
