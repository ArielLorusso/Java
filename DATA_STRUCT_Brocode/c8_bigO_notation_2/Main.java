package c8_bigO_notation_2;

import java.util.ArrayList;


////////////////


public class Main {

    public static void main(String[] args) {

        ArrayList<Long> cons = new ArrayList<Long>();
        ArrayList<Long> line = new ArrayList<Long>();
     //   ArrayList<Long> nlog = new ArrayList<Long>();
        //ArrayList[][] cuad  = new ArrayList[1000][1000];
        ArrayList<ArrayList<Long>> cuad = new ArrayList<ArrayList<Long>>(); //all same type
        DynamicArray cuadd  = new DynamicArray(10000);              // flexible but slow
        //DynamicArray cuaddd = new DynamicArray(10000);

        long startTime;
        long endTime;
        long elapsedTime;
/////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Const:\t make\t");
        Timer timer = new Timer(() -> {  cons.add(0L);    } );
        timer.go();                // prints( elapsedTime );
        cons.removeAll(cons);
/////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Lineal:\t make\t");
        timer = new Timer(() -> { 
            for( long i = 0; i < 1000000; i++){
		        line.add(i);                   // LINEAL O(N)
		    }   ; } );
            timer.go();                // prints( elapsedTime );
        line.clear();
/////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Cuadd:\t make\t");
        timer = new Timer(() -> { 
            for(long i = 0; i < 1000; i++){
                ArrayList<Long> aux1 = new ArrayList<Long>();
                for(long j = 0; j < 1000; j++){
                    aux1.add(j);           // CUADRATIC O(N^2)
                }
                cuadd.add(aux1);
                //aux1.clear();         // DO NOT CLEAR DATA
            } ; } );
        timer.go();                // prints( elapsedTime );
       // for(i = 0; i < 1000; i++){    cuadd.delete(cuadd);}
/////////////////////////////////////////////////////////////////////////////////////
        startTime = System.nanoTime();
        for(int k = 0; k < 1000; k++){
            ArrayList<Long> aux1 = new ArrayList<Long>();   // is local to for{}
            for(long j = 0; j < 1000; j++){
		        aux1.add(j);                            // CUADRATIC O(N^2)
		    }
            cuad.add(k, aux1);
            //aux1.clear();          // DO NOT CLEAR DATA
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Cuad:\t make\t" + elapsedTime +" ns");
      //  cuad.clear();
        /////////////////////////////////////////////////////////////////////////////////////
        /*
        startTime = System.nanoTime();
        for(int k = 0; k < 10000; k++){
            DynamicArray aux1 = new DynamicArray(10000);   // local to for
            for(long j = 0; j < 10000; j++){
                aux1.add(j);           // CUADRATIC O(N^2)
            }
            cuaddd.add(aux1);
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Cuaddd:\t make\t" + elapsedTime +" ns"); 
        */
        
        //System.out.println(cons);
        //System.out.println(line);
        //System.out.println(cuad);             
        //System.out.println(cuadd);      // WORKS
        //System.out.println(cuadd);


    }
}
