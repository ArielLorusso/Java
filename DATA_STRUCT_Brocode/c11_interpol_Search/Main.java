package c11_interpol_Search;
import java.lang.Math;

public class Main{

			

    public static void main(String args[]){   


    	// interpolation search =  improvement over binary search best used for "uniformly" distributed data
    	//					     "guesses" where a value might be based on calculated probe results
    	//				             if probe is incorrect, search area is narrowed, and a new probe is calculated

    	
    	//						  average case: O(log(log(n)))
    	//						  worst case: O(n) [values increase exponentially]


    	int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    	int[] array3 = {1, 2, 4, 8, 16,32,64,128,256,512,1024,2048,4096,8192,16384,32765,65536};

        // MUST BE STRICTLY INCREASING  best for lineal growth
    	int index = interpolationSearch(array1, 2);	
    	if(index != -1) {
        	System.out.println("Element found at index: "+ index);
    	}
    	else {
    		System.out.println("Element not found");
    	}

        // MUST BE STRICTLY DECREASING  best for lineal shrink
        index = interpolationSearchInver(array2, 2);	
    	if(index != -1) {
        	System.out.println("Element found at index: "+ index);
    	}
    	else {
    		System.out.println("Element not found");
    	}

    	index = interpolationSearchExp(array3, 8192);	
    	if(index != -1) {
        	System.out.println("Element found at index: "+ index);
    	}
    	else {
    		System.out.println("Element not found");
    	}
       // MUST BE STRICTLY INCREASING  best for lineal growth
       index = interpolationSearch(array3, 8192);	
        if(index != -1) {
            System.out.println("Element found at index: "+ index);
        }
        else {
            System.out.println("Element not found");
        }

    }



	private static int interpolationSearch(int[] array, int value) {

		int high = array.length - 1;    // bounds of search area
		int low = 0;                    // starts covering all data

    // While value is between our bounds  &  bounds >= 0
		while(value >= array[low] && value <= array[high] && low <= high) {
    // PROBE = position =   low + domain * value-min / image
    //                  =   low + slope  * dif
            int probe = low + (high - low) * (value - array[low]) / 
					    (array[high] - array[low]);
			
		
			System.out.println("probe: " + probe);
			
			if(array[probe] == value) {         // FOUND
				return probe;
			}
			else if(array[probe] < value) {     // BIGGER VALUE
				low = probe + 1;                //      low > prove
			}
			else {                              // LOWER VALUE
				high = probe -1;                //      high < prove
			}
		}
		
		return -1;
	}
    
    private static int interpolationSearchInver(int[] array, int value) {
        int high = array.length - 1;    // bounds of search area
		int low = 0;                    // starts covering all data

    // While value is between our bounds  &  bounds >= 0    // CHANGE
		while(value <= array[low] && value >= array[high] && low <= high) {
    // PROBE = position =   low + domain * value-min / image
    //                  =   low + slope  * dif
            int probe = low + (high - low) * (value - array[low]) / 
					    (array[high] - array[low]);         // SAME
			
		
			System.out.println("probe: " + probe);
			
			if(array[probe] == value) {         // FOUND
				return probe;
			}
			else if(array[probe] < value) {     // BIGGER VALUE
				high = probe - 1;                //      low > prove
			}
			else {                              // LOWER VALUE
				low = probe +1;                //      high < prove
			}
		}
		
		return -1;
	}

	private static int interpolationSearchExp (int[] array, int value) {

		int high = array.length - 1;    // bounds of search area
		int low = 0;                    // starts covering all data

    // While value is between our bounds  &  bounds >= 0
		while(value >= array[low] && value <= array[high] && low <= high) {
    // PROBE = position =   low + domain * value-min / image
    //                  =   low + slope  * dif
            
		double slope = (double)(high - low)/(array[high] - array[low]);
		double probe = (low + slope * (value - array[low]));
	  	
		int  	prob = (int) Math.pow(2,probe);		//  2^probe  ( exponential)
		if (prob>high) { prob = (high+low)/2;}		// probe out range -> average
		System.out.println("probe: " + prob);		//   show probe for analisis 

			if(array[prob] == value) {         // FOUND
				return prob;
			}
			else if(array[prob] < value) {     // BIGGER VALUE
				low = prob + 1;                //      low > prove
			}
			else {                              // LOWER VALUE
				high = prob -1;                //      high < prove
			}
            
		}
		return -1;
	}
}