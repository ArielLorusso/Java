package c41_interface;

public class Hawk implements Predator {

    /*  @Override           Auto fix 
    public void Hunt() {
        // @TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Hunt'");
    } 
    
    */
    @Override
    public void hunt (){
    System.out.println("The Hawk Hunts");
    }

}
