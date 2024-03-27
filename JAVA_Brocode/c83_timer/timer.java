package c83_timer;

import java.util.Calendar;
//import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timer {

	public static void main(String[] args) {
		
		// Timer = 		A facility for threads to schedule tasks     (Keeps time on background)
		//				for future execution in a background thread
		
		// TimerTask = 	A task that can be scheduled for one-time   (Task to execute when times come)
		//				or repeated execution by a Timer
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {// add anonimous inner class 
				  // 1 previously unimplemented method run from TimerTask
			int counter = 10;
			@Override              
			public void run() {
				if(counter>0) {
					System.out.println(counter+" seconds");
					counter--;
				}
				else {
					System.out.println("HAPPY NEW YEAR!");
					timer.cancel();
				}
			}		
		};

/*	Syntax of an anonymous class expression is like the invocation of a constructor,
	except that there is a class definition contained in a block of code. 
		
	Test t = new Test() 				// Test can be interface,abstract/concrete class
	{
		public void test_method()		// data members and methods 
   		{  ................  }   
	};
	*/
	
		Calendar date = Calendar.getInstance();			//sering calendar date
		//timer.schedule(task, 3000);              // 3 sec delay (3000ms)
		//timer.schedule(task, date.getTime());  
		//timer.scheduleAtFixedRate(task, 0, 1000); // delay period ms
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		

		date.set(Calendar.YEAR,	 	2020);
		date.set(Calendar.MONTH,Calendar.DECEMBER);	    // its almost new year
		date.set(Calendar.DAY_OF_MONTH,31);
		date.set(Calendar.HOUR_OF_DAY, 23);
		date.set(Calendar.MINUTE,	   59);
		date.set(Calendar.SECOND,	   50);
		date.set(Calendar.MILLISECOND, 00);
		

	}

}
