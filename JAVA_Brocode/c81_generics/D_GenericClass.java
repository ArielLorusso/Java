package c81_generics;

public class D_GenericClass <Thing, Thing2> {

    Thing   x;
    Thing2  y;


    D_GenericClass(Thing x,Thing2 y)     { this.x = x; this.y = y; }
    public Thing2 getValue()              { return y;   }
}
