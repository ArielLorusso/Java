package c39_encapsulation;

public class Car  {
    
    private String make ;       // all atributes private
    private String model;       //only accesable by its methods
    private  int   year ;


    Car ( String make, String model, int year) {
        this.make  = make;
        this.model = model;
        this.year  = year;
    }
    // Getters
    public String getMake () { return this.make;  }
    public String getModel() { return this.model; }
    public int    getYear () { return this.year;  }
    //Setters
    public void setMake  (String make )  { this.make  = make;  }
    public void setModel (String model)  { this.model = model; }
    public void setYear  (  int  year )  { this.year  = year;  }

    String toStringg() {
      return make + "\n" + model +  "\n" + year;
    }
}