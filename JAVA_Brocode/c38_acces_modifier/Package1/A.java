package Package1;
import Package2.*;

public class A { 
    protected   String  protectedMessage   =  "This is protected Message";
    public static void main (String[] args) {


        C c = new C();
        // System.out.println(c.defaultMessage);      default is not visible from other Package (local to Package)
        System.out.println(c.publicMessage);       // public  is visible from other Package    (global to Packages)
    }
}
