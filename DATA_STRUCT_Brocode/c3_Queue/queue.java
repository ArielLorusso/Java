import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;


public class queue{

    public static void main(String args[])

    {    	

    	//Priority Queue = A FIFO data structure that serves elements
    	//                             with the highest priorities first 
    	//				  before elements with lower priority
    	
		//Strings in (enqueue :add) order

		Queue<Double> queue = new LinkedList<>();
		queue.offer(3.0);	//enqueue add offer
    	queue.offer(2.5);
    	queue.offer(4.0);
    	queue.offer(1.5);
    	queue.offer(2.0);
    	
    	while(! queue.isEmpty()) {
    		System.out.println( queue.poll() ); // poll remove dequeue
    	}
	
	//Strings in reverse priority order
  		//Queue<String> pQueue = new PriorityQueue<>();
	//Strings in reverse priority order
    	Queue<String> pQueue = new PriorityQueue<>(Collections.reverseOrder());
    	
    	pQueue.offer("B");
    	pQueue.offer("C");
    	pQueue.offer("A");
    	pQueue.offer("F");
    	pQueue.offer("D");
    	
    	while(!pQueue.isEmpty()) {
    		System.out.println( pQueue.poll());
    	}
    }
}