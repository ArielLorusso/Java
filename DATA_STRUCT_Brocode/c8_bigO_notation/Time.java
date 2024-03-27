// FUNCTION AS PARAMETER

package c8_bigO_notation;

public class Time {
    
    long startTime;
    long endTime;
    long elapsedTime;
    Object call;

    Time(Object call){
        this.startTime = System.nanoTime();
        this.call = 1;
    }
    public void Timmer(){
        this.startTime = System.nanoTime();
        //do stuff
        this.endTime = System.nanoTime();
        this.elapsedTime = endTime - startTime;
    }
}
