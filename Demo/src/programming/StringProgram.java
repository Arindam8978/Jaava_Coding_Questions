package programming;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringProgram {
	
	@Test
	public void reverseEachString()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String reverseWord="";
		 String [] words=str.split("\\s");  
		 for(String w :words)
		 {
			 StringBuilder sb =new StringBuilder(w);
			 sb.reverse();
			 reverseWord += sb.toString()+ " ";
		 }
		 System.out.println(reverseWord);
				
	}

}
