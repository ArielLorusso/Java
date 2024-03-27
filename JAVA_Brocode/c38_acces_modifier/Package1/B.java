package Package1;
import Package2.*;

public class B {

    Asub asub = new Asub();
    public static void main (String[] args) {

    //System.out.println(asub.protectedMessage);  // B. cant acces it in local package  only A & Asub can
    }
}
