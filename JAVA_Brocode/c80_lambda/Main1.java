package c80_lambda;

/* lambda expression = 	feature for Java 8 and above
* 						also known as an anonymous method
* 						a shorter way to write anonymous classes with only one method
*
*						need to use a functional interface or use a pre-defined functional interface
*						they contain only one abstract method
*						ex. ActionListener, Runnable, (user-defined)
*
*						A Lambda expression can be used in any place where a functional interface is required
*						How to use a lambda expression:
*						(arguments) -> {statement/s}
*/

public class Main1 {

    public static void main(String[] args) {

        //  WITHOUT LAMBDAS
        //  MyInterface myinterface = new MyInterface() {public void message();};

        //  WITH LAMBDAS
        
        String  name ="Ariel";    char  symbol = ';' ;
        MyInterface myInterface1 = (x,y) -> { // cant use local variable name 
                System.out.println("Aaa "+x);    // x is string in 
                System.out.println("im Scared"+y); // MyInterface.java
            };

        MyInterface myInterface2 = (x,y) -> { // another instance
                System.out.println("Aaa "+x +y);    // x is string in 
            };
        
        myInterface1.message(name,symbol);
        myInterface2.message(name,symbol);
//////////////////////////////////////////////////////////////////////////////////
        MyFrame myFrame = new MyFrame();
        myFrame.myButton.equals(myFrame); // just to avoid unused warning
	}
}