package c42_polymorfism;

public class Boat extends Vehicle {

    @Override               // Not necesary nut good prectice
    public void go() {
        System.out.println("boat go");
    }
}