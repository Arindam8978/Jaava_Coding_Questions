package programming;

import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int a =5, b=4; int temp =0; temp =a; a=b; b=temp;
		 * 
		 * System.out.println(a); System.out.println(b);
		 * 
		 * //swap without using temp variable //a=a+b; // 9 //b=a-b; //5 //a=a-b; //4
		 */		
		
		int a[] = {4,6,5,9,1};
		int temp;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j<a.length; j++) {
				
				if(a[i]>a[j])
				{
					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
			
		}
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		// Alternative way
		Integer[] numbers = new Integer[] {9,8 ,4,1, 2, 3 };
		List<Integer> list = Arrays.asList(numbers);
		list.stream().sorted().forEach(s->System.out.println(s));
		
		
		
		

	}

}