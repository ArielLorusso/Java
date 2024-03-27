package c44_exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;



public class exception {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        try {

            
    
            System.out.println("enter int num to be divided"); 
            int x =  scan.nextInt();       // >2147483648 = system fail
    
            System.out.println("enter int num to divide"); 
            int y =  scan.nextInt();       // >2147483648 = system fail
    
            int z = x/y;
            System.out.println("result \n"+z); 
    
          //  scan.close();
        }
        catch(ArithmeticException e)
        {  System.out.println("cant divide 0");  }
        catch(InputMismatchException e)
        {  System.out.println("ENTER NUMBER");  }
        catch (Exception e)
        {  System.out.println("Unknown EXCEPTION");  }
        finally {  System.out.println("Allways do this");  
            scan.close();}
    }
}
