package c8_bigO_notation;

import java.util.ArrayList;

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
        long i ;
/////////////////////////////////////////////////////////////////////////////////////
        startTime = System.nanoTime();
	        cons.add( 1L );                // CONSTANT  O(1)
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Const:\t make\t" + elapsedTime +" ns");
        cons.removeAll(cons);
/////////////////////////////////////////////////////////////////////////////////////
        startTime = System.nanoTime();
        for(i = 0; i < 1000000; i++){
		    line.add(i);                   // LINEAL O(N)
		}
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Lineal:\t make\t" + elapsedTime +" ns");
        for(i = 0; i < 1000000; i++){
		    line.remove(0);                   // LINEAL O(N)
		}
/////////////////////////////////////////////////////////////////////////////////////
        startTime = System.nanoTime();
        for(int k = 0; k < 20000; k++){
            ArrayList<Long> aux1 = new ArrayList<Long>();   // local to for
            for(long j = 0; j < 20000; j++){
		        aux1.add(j);           // CUADRATIC O(N^2)
		    }
            cuad.add(k, aux1);
            aux1.clear();
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Cuad:\t make\t" + elapsedTime +" ns");
        cuad.clear();
/////////////////////////////////////////////////////////////////////////////////////
     startTime = System.nanoTime();
    for(i = 0; i < 10000; i++){
        ArrayList<Long> aux1 = new ArrayList<Long>();
        for(long j = 0; j < 10000; j++){
            aux1.add(j);           // CUADRATIC O(N^2)
        }
        cuadd.add(aux1);
    }
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Cuadd:\t make\t" + elapsedTime +" ns");
    for(i = 0; i < 10000; i++){
//        cuadd.delete(cuadd);
    }
/////////////////////////////////////////////////////////////////////////////////////
 /*      startTime = System.nanoTime();
        for(int k = 0; k < 10000; k++){
            DynamicArray aux1 = new DynamicArray(10000);   // local to for
            for(long j = 0; j < 10000; j++){
                aux1.add(j);           // CUADRATIC O(N^2)
            }
            cuaddd.add(aux1);
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Cuaddd:\t make\t" + elapsedTime +" ns"); */   

        //System.out.println(cons);
        //System.out.println(line);
        System.out.println(cuad.get(50));             // Does not work
        System.out.println(cuadd.get(50));      // WORKS
        //System.out.println(cuadd);


    }
}
