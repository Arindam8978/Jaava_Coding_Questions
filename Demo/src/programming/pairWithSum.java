package programming;

import java.util.HashSet;
public class pairWithSum {
	    public static void main(String[] args) {
	        int[] numbers = {2, 4, 7, 11, 5, 9};
	        int k = 16;

	        boolean foundPair = findPairWithSum(numbers, k);

	        if (foundPair) {
	            System.out.println("Pair with sum " + k + " found.");
	        } else {
	            System.out.println("Pair with sum " + k + " not found.");
	        }
	    }

	    public static boolean findPairWithSum(int[] numbers, int k) {
	        HashSet<Integer> set = new HashSet<>();

	        for (int num : numbers) {
	            int complement = k - num;

	            if (set.contains(complement)) {
	                return true;
	            }

	            set.add(num);
	        }

	        return false;
	    }
	}



