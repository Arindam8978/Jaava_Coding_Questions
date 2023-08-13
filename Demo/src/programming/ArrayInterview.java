package programming;

public class ArrayInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int arrMatrix [][]= {{2,5,8},{7,9,10},{3,4,1}};
		  int min = arrMatrix[0][0];
		  
		  for (int i = 0; i < arrMatrix.length; i++) { //row
			  for (int j = 0; j <arrMatrix[0].length; j++) {
		  
		  if (arrMatrix[i][j]<min)
		  { 
			  min = arrMatrix[i][j];
		  }
		  
		  } 
			  
		  
		  }
		  System.out.println(min);
		 
		//Alternate way using collection 
		
		/*
		 * int[][] matrix = { {5, 2, 9}, {1, 7, 3}, {8, 4, 6} };
		 * 
		 * int min = Integer.MAX_VALUE;
		 * 
		 * for (int[] row : matrix) { for (int num : row) { if (num < min) { min = num;
		 * } } }
		 * 
		 * System.out.println("Minimum number: " + min);
		 */

	}

}
