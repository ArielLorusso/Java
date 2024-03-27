package c33_static_keyword;

public class Friend {

	String name;
	
	static int numberOfFriends;
	
	Friend(String name){
		this.name=name;
		numberOfFriends++;
	}	
}