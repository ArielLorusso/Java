package c7_LinkedLists_vs_ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;



public class Main{

	public static void main(String[] args) {

		LinkedList<Long> linkedList = new LinkedList<Long>();
		ArrayList<Long> arrayList = new ArrayList<Long>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		long i;


        startTime = System.nanoTime();
        for(i = 0; i < 10000000; i++){
			linkedList.add(i);              // Java  AUTOBOXING autom aticaly pu in Integuer wrapper
		}
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t make\t" + elapsedTime +" ns");


        startTime = System.nanoTime();
        for(i = 0; i < 10000000; i++){
			arrayList.add(i);      
		}
		endTime = System.nanoTime();
        elapsedTime = endTime - startTime;			
        System.out.println("ArrayList:\t make\t" + elapsedTime +" ns");


		// ****************LinkedList****************
		startTime = System.nanoTime();      // Returns the current value of 
                                //  the running Java Virtual Machine's 
                                //  high-resolution time source, in nanoseconds. 
		
		//linkedList.get(0);
		//linkedList.get(500000);
		i=linkedList.get(9111000);
		//linkedList.remove(0);
		//linkedList.remove(500000);
		//linkedList.remove(999999);
		
		endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
		System.out.println("LinkedList:\t get\t" + elapsedTime +" ns "+ i);
        startTime = System.nanoTime();
//		linkedList.get(0);
        linkedList.add(i);              // Java  AUTOBOXING
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
		System.out.println("LinkedList:\t add\t" + elapsedTime +" ns");
		// ****************ArrayList****************	
		
		startTime = System.nanoTime();
		
		//arrayList.get(0);
		//arrayList.get(500000);
		i = arrayList.get(9111000);
		//arrayList.remove(0);
		//arrayList.remove(500000);
		//arrayList.remove(999999);
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;	
		System.out.println("ArrayList:\t get\t" + elapsedTime +" ns "+ i);
		
        startTime = System.nanoTime();
        arrayList.add(i);               // automaticaly pu in Integuer wrapper
//		arrayList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
		System.out.println("ArrayList :\t add\t" + elapsedTime +" ns");
	}
}