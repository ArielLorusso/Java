package c28_variable_scope;

import java.util.Random;

public class MyDice {
     
 Random random;
 int number;
 
 MyDice(){
  random = new Random();
  // roll();
 }
 
 void roll() {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}