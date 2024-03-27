package c15_array;

public class Main {
	public static void main( String[] args ) {


// WITH ASIGNATION
		String[] cars = {"Camaro","Corvette","Tesla"};
		cars[0] = "Mustang";
		System.out.println(cars[0]);

// ALOCATION ONLY
		String[] moto = new String[3] ;
		moto[0] = "Harley";
		moto[1] = "Queen";
		moto[2] = "Davison";

		System.out.println(moto[0]);

	}
}