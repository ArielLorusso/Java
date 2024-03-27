package c41_interface;

public class Fish implements Predator, Prey {

    @Override
    public void flee() {  
        // @TODO Auto-generated method stub
        //System.out.println("Fish Flees");
    }

    @Override
    public void hunt() {
        // @TODO  Auto-generated method stub
        System.out.println("Fish Hunts");
    }
    
}
