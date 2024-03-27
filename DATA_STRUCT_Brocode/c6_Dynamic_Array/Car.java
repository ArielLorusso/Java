package c6_Dynamic_Array;

public class Car {
    
    String  model;
    int     price;

    public Car(String model,int price)
    {
        this.model = model;
        this.price = price;
    }

    public void model(String model)
    {
        this.model = model;
    }

    @Override
    public String toString() {
        return model +", $"+ price +'\n';    
    }
}
