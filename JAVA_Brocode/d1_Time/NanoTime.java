package d1_Time;

public class NanoTime {
    public void test(){
       int num = 0;
       int i;
       for(i=0; i< 10001; i++){  
          num =num+i;
          System.out.print(num+", ");
       } 
       //System.out.print(num+","+i);
    }
    
    public static void main(String args[]){       

       long begin = System.nanoTime();               // Start time
       new NanoTime().test();
       long end = System.nanoTime();                 // End time
       long time = end-begin;
       System.out.println();       
       System.out.println("Elapsed Time : "+ time +"ns");
       System.out.println("Elapsed Time : "+(double)time/1000000+"ms");
       System.out.println("last number : " + (10001 * 10001/2 -10001/2));
    }
 }