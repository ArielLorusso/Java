package Package2;
import Package1.*;

public class Asub extends A{
    private String  privateString   =   "This is private Message"; // Privated only class Asub cam see it
    public static void main (String[] args) {

    C c = new C();
    //A a = new A();            is included by import
    Asub asub = new Asub();
    System.out.println(c.defaultMessage);       // default is visible by same package
    System.out.println(c.publicMessage);        // Publict is visible by same package and others
    // System.out.println(a.protectedMessage);   protected is visible by same package and child ones only
    System.out.println(asub.protectedMessage);  // A. cant acces it from extern package  Asub can
    System.out.println(asub.privateString);     // Privated only Asub cam see it
 }
}