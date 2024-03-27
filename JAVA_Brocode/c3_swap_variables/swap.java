
package c3_swap_variables;
//**********************************************
public class swap {
	public static void main(String[] args) {
		
		String x = "water";
		String y = "Kool-Aid";
		String temp;
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}
//**********************************************