package c81_generics;
//import java.util.ArrayList;

public class B_GenericClass <Thing extends Number, Thing2 extends Number>{
    
     public static void main(String[] args) {

         
    /* /////////////////////////////////////////////////  OLD WAY  MANY OBJECTS

        MyIntegerClass      myInt    = new MyIntegerClass(  1   );
        MyDoubleClass       myDouble = new MyDoubleClass(  3.14 );
        MyCharacterClass    myChar   = new MyCharacterClass('@' );
        MyStringClass       myString = new MyStringClass("hello");

        System.out.println(    myInt.getValue() );
        System.out.println( myDouble.getValue() );
        System.out.println(   myChar.getValue() );
        System.out.println( myString.getValue() );  */
        //////////////////////////////////////////////// NEW GENERIC WAY 1 OBJ

        MyGenericClass<Integer>     myInt    = new MyGenericClass <>(  1   );
        MyGenericClass<Double>      myDouble = new MyGenericClass <>(  3.14 );
        MyGenericClass<Character>   myChar   = new MyGenericClass <>('@' );
        MyGenericClass<String>      myString = new MyGenericClass <>("hello");

        // FAMOUS APLICATION
        //         ArrayList <THING> myFriends =  new ArrayList<>();

        System.out.println(    myInt.getValue() );
        System.out.println( myDouble.getValue() );
        System.out.println(   myChar.getValue() );
        System.out.println( myString.getValue() );


    }

}