package c42_polymorfism;

public class polimorfism {
    public static void main (String[] args) {
        Car  car  = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        //  polimorfism using an object as more than 1 datatype
        //  store group of obj as array of parent class for example
        Vehicle [] racers   =  {car,bike,boat};
        // object is parent type of every object
        //Object  [] instance =  {car,bike,boat};
        for (Vehicle x :  racers) { x.go();}
    }
}
