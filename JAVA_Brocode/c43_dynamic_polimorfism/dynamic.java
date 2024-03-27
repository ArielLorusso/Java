package c43_dynamic_polimorfism;
import java.util.Scanner;

public class dynamic {
    
    
    // Dinamic          during execution runtime
    //polymorfism       Object type change 
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner scan = new Scanner(System.in);
        short choise;                          // 32767 max


        //do {}
        System.out.println("choose  '1'=Dog '2'=cat"); 
        choise =(short)  scan.nextInt();       // >2147483648 = system fail
        System.out.println("choosen : "+ choise);
        // while ( ! (choise==1 || choise==2 ) );
        

        if      (choise==1)   { animal = new Cat();     }
        else if (choise==2)   { animal = new Dog();     }
        else                  { animal = new Animal();  }
        animal.speak();
        scan.close();
    }
}
