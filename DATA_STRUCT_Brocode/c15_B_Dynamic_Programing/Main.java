package c15_B_Dynamic_Programing;


// recursion = When a thing is defined in terms of itself. - Wikipedia
//			   Apply the result of a procedure, to a procedure.  
//			   A recursive method calls itself. Can be a substitute for iteration.
//			   Divide a problem into sub-problems of the same type as the original.
//			   Commonly used with advanced sorting algorithms and navigating trees
    
//			   Advantages
//			   ----------
//			   easier to read/write
//			   easier to debug
    
//			   Disadvanages
//			   ---------
//			   sometimes slowe
//			   uses more memory

public class Main{	
	public static void main(String[] args) {
		
		walk(5);
		System.out.println( factorial(7));
		System.out.println( power(2, 8));		// 2*2*2*2*2*2*2*2
		System.out.println( towerExp(2, 4));	// ((2^2)^2)^2
		System.out.println( towerExp2(2, 2));	// (2^2) ^ (2^2)
	}

	private static void walk(int steps) {
		while (steps > 0)
		{
			System.out.println("You take a step!");
			steps--;
		}
	}

	private static long factorial(long num) {		
		long res = 1;
		while ( num  > 1)
		{
			res *= num;
			num--;
		}
		return res;
	}

	public static long power(long base, long power)  {		
		long res = 1;
		while ( power  > 0)
		{
			res = res * base;
			power--;
		}
		return res;
	}

	private static long towerExp (long base,int height)  {		

		long res = base;
		while ( height  > 1)
		{
			res =  power(res,base) ;  // x = (x^y)   9=3^3
			height--;
		}								//			 x=9^9
		return res;				//  ((3^3)^3)^3)^3.....
	}


	private static long towerExp2 (long base,int height)  {		

		while ( height  > 0)
		{
			base =  power(base,base) ;  // x = (x^y)   9=3^3
			height--;
		}								//			 x=9^9
		return base;				//  ((3^3)^3)^3)^3.....
	}
}