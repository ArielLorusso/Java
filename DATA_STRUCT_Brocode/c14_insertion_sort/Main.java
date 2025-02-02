package c14_insertion_sort;

public class Main{
	
	// Insertion sort = after comparing elements to the left,
	//				shift elements to the right to make room to insert a value
	
	//				Quadratic time O(n^2)
	//				small data set = decent
	//				large data set = BAD
	
	//				Less steps than Bubble sort
	//				Best case is O(n) compared to Selection sort O(n^2)
	
	public static void main(String[] args) {
		
		int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
		
		insertionSort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {  // iterate from element 1
			int temp = array[i];                // swap variable
			int j = i - 1;                      // index of comparison
			
			while(j >= 0 && array[j] > temp) {  // j from i-1 to 0
				array[j + 1] = array[j];        // shift to right
				j--;
			}
			array[j + 1] = temp;            // insert value in temp
		}
	}
}