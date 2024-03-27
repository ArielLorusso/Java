package c16_Merge_Sort;

public class Main2{
	
    public static void main(String args[])
    {   	
    	// merge sort = recursively divide array in 2, sort, re-combine
    	// run-time complexity = O(n Log n)
    	// space complexity    = O(n)
    	
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        int[] array2 = {6, 1, 5, 4, 2};
        
        MergeSort merge = new MergeSort(array2);
        merge.getClass();
       
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

        int []x = {5,0}; 
        int y = 5;
        test(x);        // changes : function recives pointer to data
        test(y);        // does not change instances copy

        System.out.println("\n"+ x[0] +", "+ y);

    }

    private static void test( int[] x)
    {
        x[0] = x[0] + x[0];
    }

    private static void test( int x)
    {
        x = x + x;
    }

}

