package c81_generics;

import java.util.HashMap;

public class C_GenericBound {
//----------------------- Generic Class -----------------------
 
    public static void main(String args[]) {
       
        //bounded types = 	you can create the objects of a generic class to have data 
        //					of specific derived types ex.Number
        
        D_GenericClass <Integer,Integer>    myInt   = new D_GenericClass<>(1,9);
        D_GenericClass <Double,Double>     myDouble = new D_GenericClass<>(3.14,1.01);   
    //  D_GenericClass <Character,Character> myChar = new D_GenericClass<>('@','$');
    //  D_GenericClass <String,Character>  myString = new D_GenericClass<>("Hello",'!');
       
    // FAMOUS APLICATION
    //         HashMap <Integer, String> Users = new HashMap<>();
               
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
       //System.out.println(myChar.getValue());
       //System.out.println(myString.getValue());
    } 

}