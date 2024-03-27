package c39_encapsulation;

public class encapsule {
    public static void main (String[] args) {

        Car car = new Car("Chevy", "Camaro" ,2021);
        //System.out.println(car.make);      
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}

