package c5_arithmetic_expressions;

public class expressions  {

 public static void main(String[] args) {
  
  // expression =     operands & operators
  // operands =  values, variables, numbers, quantity
  // operators = + - * / % 
  int num = 10;
  double res ; 
  
  res = num+3;
  System.out.println(res);      // 13.0
  res = num-3;
  System.out.println(res);      //  7.0
  res = num*3;
  System.out.println(res+"\n"); // 30.0

  res = num/3; 
  System.out.println(res);      // 3.0
  res = num/3.0F;
  System.out.println(res);      // 3.3333332538604736
  res = (double)num/3; 
  System.out.println(res+"\n"); // 3.3333333333333335

  System.out.println(num);      // n = 10
  res = num % 3; 
  System.out.println(res);      // 1....10/3 => 3*3 + 1.0 
  res = num % 3.33F;
  System.out.printf( "%.2f\n", res);   // 0.01...10/3.33 => 3*3.33 + 0.001

  System.out.println( num -= 1);  // 9 pre decremento  -- 
  System.out.println( num );      // 9  no existe pot incremento
 } 
}
