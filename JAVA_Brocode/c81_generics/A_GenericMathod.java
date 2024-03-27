package c81_generics;

/* GENERICS = Enable types (class & interface) to be parameters when defining
 *          clases, insterfaces & methods
 *     
 *      God: no need of multiple versions for diferent datatypes 
 * 
 */   


//----------------------- Generic Method -----------------------

public class A_GenericMathod {

    // Generic method        <T> usual name T = Thing
    public static < Thing > void displayArray(Thing[] array) {
 
       for( Thing x : array) { System.out.print(x+", "); }
    }
   
    // Generic method with generic return type 
    public static <T> T firstElement(T[] array) {
 
        return array[0];
    }

    public static void main(String args[]) {
       
       Integer[] intArray = {1, 2, 3, 4, 5};
       Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
       Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
       String[] stringArray = {"B","Y","E"};

       System.out.print("Integer Array: ");     displayArray(intArray);
       System.out.println("\n"+firstElement(intArray));
 
       System.out.print("Double Array: ");      displayArray(doubleArray);
       System.out.println("\n"+ firstElement(doubleArray));
 
       System.out.print("Character Array: ");   displayArray(charArray);
       System.out.println("\n"+firstElement(charArray));
       
       System.out.print("String Array: ");      displayArray(stringArray);
       System.out.println("\n"+firstElement(stringArray));
       
    }
    
 }
 