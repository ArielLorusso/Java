//  Done by Gpt but does not work

public class secondSmallest {

    public static int secondSmallestNumber(int S, int D) {
        // check if the input is valid
        if (S < 1 || S > 81 || D < 1 || D > 9) {
            return -1; // invalid input
        }
    
        // compute the smallest number with the given sum and number of digits
        int smallest = (int) Math.pow(10, D - 1);
        int currentSum = Integer.toString(smallest).chars().map(Character::getNumericValue).sum();
        int diff = S - currentSum;
        if (diff > 0) {
            smallest += Math.min(diff, 9) * (int) Math.pow(10, D - 1);
            D--;
        }
    
        while (D > 0) {
            int smallestDigit = Math.min(9, diff);
            smallest += smallestDigit * (int) Math.pow(10, D - 1);
            diff -= smallestDigit;
            D--;
        }
    
        // compute the second smallest number
        if (S == 1) {
            return smallest + 1;
        } else {
            int secondSmallest = smallest + 9;
            int i = 2;
            while (i < S && secondSmallest < Math.pow(10, D) - 1) {
                secondSmallest += 9;
                i++;
            }
    
            return secondSmallest;
        }
    }


    public static void main(String args[]){    
    System.out.println(secondSmallestNumber( 15, 8));//5.4

    }
}
