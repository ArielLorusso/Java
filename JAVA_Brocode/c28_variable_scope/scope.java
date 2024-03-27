package c28_variable_scope;


public class scope {
 public static void main(String[] args) {
  
  //local =  declared inside a method
  //   visible only to that method
  
  //global  = declared outside a method, but within a class
  //   visible to all parts of a class
  
  MyDice dice = new MyDice();
  dice.roll() ;

 }
}

