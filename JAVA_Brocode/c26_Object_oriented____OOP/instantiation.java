package c26_Object_oriented____OOP;


public class instantiation {

	public static void main(String[] args) {
		
		Car myCar1 = new Car(), 		// NEVER do this !
			myCar2 = new Car();			
										// same class diferent object pointer
		System.out.println(myCar1);		// same 
		System.out.println(myCar2);		//
		
		System.out.println(myCar1.make);
		System.out.println(myCar2.model);

		myCar1.drive();
		myCar1.brake();
	}
}