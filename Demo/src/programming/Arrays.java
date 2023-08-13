package programming;

import java.util.Iterator;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array - A container which store multiple values of same data type;
		
		int a[] = new int[5]; // Declare an array and allocates memory for the values 
		a[0]=2;
		a[1]=8;
		a[2]=15;
		a[3]=25;
		a[4]=59; //initilazed values into that array
		
		int b[] = {1,2,3,4,5,6,7,8,9,89};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]); // retrieve value present in the array
		}
		

	}



	public static List<Integer> asList(Integer[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}



	public static Object stream(int[][] matrix) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
