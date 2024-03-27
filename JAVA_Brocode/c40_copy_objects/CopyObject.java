package c40_copy_objects;

public class CopyObject {
    public static void main (String[] args) {

        Car car1 = new Car("Chevrolet", "Camaro" ,2021 );
        Car car2 = new Car("Ford",      "mustang" ,2022);
        Car car3 = new Car(car1);

        // car2 = car1;  Does not copy but point to same memory
        //               we lost memory pointed by car2

        car2.copy(car1);    // made a copy method similar to constructor

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();
        System.out.println( car1.getMake());
        System.out.println( car1.getModel());
        System.out.println( car1.getYear());
        System.out.println( );
        System.out.println( car2.getMake());
        System.out.println( car2.getModel());
        System.out.println( car2.getYear());
        System.out.println( );
        System.out.println( car3.getMake());
        System.out.println( car3.getModel());
        System.out.println( car3.getYear());
    }
}