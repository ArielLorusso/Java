package c7_MathClass;

import java.util.Scanner;

/*  NO IMPORT NEDDED
Math.floor(x)   Math.max(x,y)   Math.sqrt(x)    Math.sin(x)
Math.round(x)   Math.min(x,y)   Math.log(x)     Math.asin(z)
Math.ceil(x)    Math.abs(y)     Math.pow(x, y)  Math.sinh(x)
*/

public class math {

 public static void main(String[] args) {
  
  double x, y, z;
  Scanner scan = new Scanner(System.in);
    
  System.out.println("Enter side x: ");   x = scan.nextDouble();
  System.out.println("Enter side y: ");   y = scan.nextDouble();
  
  z = Math.sqrt((x*x)+(y*y));  
  System.out.println("The hypotenuse is : "+z);
  
  scan.close();   




  System.out.println( Math.round(5.5));  // 6
 }
}
