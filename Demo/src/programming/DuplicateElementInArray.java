package programming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7};
		 * 
		 * Set<Integer> uniqueElements = new HashSet<>(); Set<Integer> duplicateElements
		 * = new HashSet<>();
		 * 
		 * for (int num : array) { if (!uniqueElements.add(num)) {
		 * duplicateElements.add(num); } }
		 * 
		 * System.out.println("Duplicate elements in the array: " + duplicateElements);
		 */
        
        
        
int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 3};
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element found: " + array[i]);
                }
            }
        }
        
		
        
        
        char[] characters = {'a', 'b', 'c', 'a', 'd', 'e', 'b', 'f'};
        for (int i = 0; i < characters.length - 1; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.println("Duplicate character found: " + characters[i]);
                }
            }
        }
        
	}

}
