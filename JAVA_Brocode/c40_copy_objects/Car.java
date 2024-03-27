package c40_copy_objects;

public class Car  {
    
    private String make ;       // all atributes private
    private String model;      
    private  int   year ;

    Car ( String make, String model, int year) {
        this.make  = make;
        this.model = model;
        this.year  = year;
    }
    Car ( Car x) {                  //copy constructor
        this.make  = x.make;
        this.model = x.model;
        this.year  = x.year;
    }

    public void copy(Car x){            //faster ?
        this.setMake(x.make);       //this.make  = x.make;
        this.setModel(x.model);     //this.model = x.model;
        this.setYear(x.year);       //this.year  = x.year;
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