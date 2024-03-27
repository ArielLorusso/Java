package c41_interface;

public class interfac {
    
    public static void main (String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish  fish= new Fish() ;
        fish.hunt();
        fish.flee();
    }
}