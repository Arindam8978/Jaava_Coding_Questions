package programming;

import java.util.*;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//can accept duplicate value
		//ArrayList,LinkedList,vector - implementing list interface
		//Array have fixed size where ArrayList can grow dynamically
		//you can access and insert any value in any index
		
		java.util.ArrayList<String> a =new java.util.ArrayList<String>();//Creating arraylist 
		a.add("Arindam");
		a.add("Java");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Good");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Java"));
		System.out.println(a.indexOf("Arindam"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
		
		

	}

}
