package c8_random_numbers;

import java.util.Random;

public class rand {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int x = rand.nextInt(6)+1; // (0~6)+1 = (1~7) 
		System.out.println(x);
		double y = rand.nextDouble();	 //  0.00~ 0.999
		System.out.println(y);
		boolean z = rand.nextBoolean();  //  True False
		System.out.println(z);
	}
}

