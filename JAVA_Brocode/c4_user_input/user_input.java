package c4_user_input;

import java.util.Scanner;

public class user_input {

 public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  
  System.out.println("What is your name? ");
  String name = scan.nextLine();
  
  System.out.println("How old are you? ");
  int age = scan.nextInt();
  scan.nextLine();
  
  System.out.println("What is your favorite food?");
  String food = scan.nextLine();
   
  System.out.println("Hello "+name);
  System.out.println("You are "+age+" years old");
  System.out.println("You like "+food);

  scan.close();
 } 
} 
