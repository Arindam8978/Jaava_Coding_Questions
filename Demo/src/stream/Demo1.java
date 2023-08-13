package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	

	public void stream() {
		// TODO Auto-generated method stub

		java.util.ArrayList<String>names =new java.util.ArrayList<String>();
		names.add("Adarsh");
		names.add("Hari");
		names.add("Adam");
		names.add("Ram");
		names.add("Lakshman");
		int count=0;
		
		for (int i = 0; i < names.size(); i++) {
			
			String actual= names.get(i);
			if (actual.contains("A"))
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
	
	public void StreamFilte()
	{
		java.util.ArrayList<String>names =new java.util.ArrayList<String>();
		names.add("Adarsh");
		names.add("Hari");
		names.add("Adam");
		names.add("Ram");
		names.add("Lakshman");
		//there is no life of intermediate operation if there is no terminal operation
		//terminal operation will execute only if inter operation (filter) return true
		//we can ceate stream 
		//how to use filter in stream API
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Long d = Stream.of("Adarsh","Hari","Adam","Ram","Lakshman").filter(s->
		{
			s.startsWith("A");
			return false;
		}).count();
		System.out.println(d);
	}
	
	public void forEach()

	{
		java.util.ArrayList<String>names =new java.util.ArrayList<String>();
		names.add("Adarsh");
		names.add("Hari");
		names.add("Adam");
		names.add("Ram");
		names.add("Lakshman");
		
		for (int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
	//	we can use that one with stream using foreach 
		//print the name length greater than 4
		
		System.out.println("<------------------------------------->");
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("<------------------------------------->");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
	}

	
	public void streamMap()
	{
		//print name with have last letter as "a" with Uppercase
		Stream.of("Adarsh","Hari","Adama","Rama","Lakshman").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		System.out.println("<------------------------------------------->");
		
		//print name with Uppercase
		Stream.of("Adarsh","Hari","Adama","Rama","Lakshman").map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		
		System.out.println("<------------------------------------------->");
		
		//print name which have first letter as a with Uppercase and sorted
		//and convert array to list
		List<String> names = Arrays.asList("Aearsh","Abhikeet","Adama","Rama","Lakshman");
				names.stream().filter(s->s.startsWith("A")).sorted()
				.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	public void mergeTwostream()
	{
		//merging two different List and sort them then print
		java.util.ArrayList<String>names =new java.util.ArrayList<String>();
		names.add("Adarsh");
		names.add("Hari");
		names.add("Auru");
		System.out.println("<------------------------------------------->");
		
		List<String> names1 = Arrays.asList("Aearsh","Abhikeet","Adama","Rama","Lakshman");
		
		Stream<String> newStream= Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		
		//check if the name present then it'll return true else false
		//boolean flag=	newStream.sorted().anyMatch(s->s.equalsIgnoreCase("Adama"));
	//Assert.assertTrue(flag);
	//System.out.println(flag);
		
	}
	
	
	public void streamCollect()
	{
		
		List<String> ls = Stream.of("Aearsh","Abhikeet","Adama","Rama","Lakshman").filter(s->s.endsWith("a"))
				.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));   // convert the array into list and use collect
		
		//print unique number form array
		//sort the array and print the 3 index
		
		List<Integer> Values = Arrays.asList(3,2,2,6,8,5,9); // convert the array into list
		Values.stream().distinct().forEach(s->System.out.println(s));
		
		System.out.println("<----------------------------------------->");
		
		  List<Integer> sortValue =Values.stream().distinct().sorted().collect(Collectors.toList());
		  System.out.println(sortValue.get(2));
		 
	}
	@Test
	public void reverseString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String reverseString = sb.reverse().toString();
		System.out.println(reverseString);
	}
	
	
	public void HashMap()
	{
		String [] str = new String [] {"hello", "Hi"};
		java.util.HashMap<Integer,String> map = new java.util.HashMap<Integer,String>();
		
		for (int i=0; i<str.length;i++)
		{
			map.put(i, str[i]);
		}
		
		for (Integer key : map.keySet())
		{
			System.out.println(key+" => " + map.get(key));
		}
	}
	
	public void HashMapStringandNumber()
	{
		String[] names = {"Alice", "Bob", "Charlie", "David"};
        int[] numbers = {100, 200, 300, 400};
        
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], numbers[i]);
        }
        
        // Printing the HashMap
        for (String name : map.keySet()) {
            int number = map.get(name);
            System.out.println(name + ": " + number);
        }

	}

	public void repeated()
	{
		  String str = "employee";
	        int count=0;
	        for(int i=0;i<str.length();i++)
	        {
	            for(int j=0;j<str.length();j++)
	            {
	                if(str.charAt(i)==str.charAt(j))
	                {
	                count++;    
	                }
	                
	            }

                System.out.println("Duplicate element found" +str.charAt(i));
                System.out.println("count is " +count);
                count=0;
	        }
	        
	}
	
	public void duplicateUsingStream()
	{
	       String inputString = "Hello, World!";

	        Map<Character, Long> charCounts = inputString.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        charCounts.entrySet().stream()
	                .filter(entry -> entry.getValue() > 1)
	                .forEach(entry -> System.out.println("Character '" + entry.getKey() +
	                        "' occurs " + entry.getValue() + " times."));
	        
	   
	}
	
	public void duplicateInCharArrayUsingStream()
	{
		char[] charArray = {'A', 'B', 'C', 'B', 'A', 'D', 'E', 'D'};

        Map<Character, Long> charCounts = new String(charArray)
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        charCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Character '" + entry.getKey() +
                        "' occurs " + entry.getValue() + " times."));
	}
	
	
	public void SortTheArray()
	{ 
		Integer [] arr = new Integer [] {4,7,3,7,1,2,8};
		
		//convert array to arraylist
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
		
		// convert array to list
		List<Integer> list = Arrays.asList(arr);
		list.stream().sorted().forEach(s->System.out.println(s));
		
	}
	
	
	public void UpperCase()
	{ 
		String [] arr = new String [] {"Arindam","Das","Deepak","Das","iwill","do","it","soon"};
		
		//convert array to arraylist
		ArrayList<String> a = new ArrayList<String>(Arrays.asList(arr));
		
		// convert array to list
		List<String> list = Arrays.asList(arr);
		a.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	
	public void startprinting()
	{
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <=i; j++) {
				
				System.out.print("*");
				
				
			}
			System.out.println();
			
		}
	}
	
	@Test(priority=0)
	public void minelemenntinarray()
	{
		/*Integer [] a = {4,6,1,7};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
		list.stream().min(a);*/
		int[] numbers = {5, 2, 9, 1, 7};

		/*
		 * OptionalInt min = Arrays.stream(numbers) .max();
		 * 
		 * if (min.isPresent()) { System.out.println("Minimum: " + min.getAsInt()); }
		 * else { System.out.println("No minimum element found."); }
		 */
		
		 int min = Arrays.stream(numbers)
	                .max()
	                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));

	        System.out.println("Minimum: " + min);
	}
		
	
	public void minelementin2darray()
	{
		int[][] array = {{4, 5, 2}, {9, 3, 1}, {8, 7, 6}};

	final	int[] min = {Integer.MAX_VALUE};

		Arrays.stream(array)
		        .flatMapToInt(Arrays::stream)
		        .forEach(num -> {
		            if (num < min[0]) {
		                min[0] = num;
		            }
		        });

		System.out.println("Minimum element: " + min[0]);

	}
	@Test(priority=3)
	public void reverse()
	{
		String results="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        String [] words= str.split(" ");
        
        for(String w : words)
        {
            StringBuffer sb = new StringBuffer(w);
            sb.reverse();
           results+= sb.toString()+" ";
            
        }
        System.out.println(results);
		
	}
	@Test(priority=2)
	public void reverseOrderPosition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		StringBuilder reversedSentence = new StringBuilder();

		for(int i = words.length-1 ; i>=0 ; i--)
		{
			reversedSentence.append(words[i]).append(" ");
			reversedSentence.toString().trim();
		}
		System.out.println("Reverse sentence :"+reversedSentence);
		
	}
	@Test(priority=1)
	public void reverseOrderPositionWithReverseEachWords()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		String[] words = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            String reversedWord = reverseString(word);
            reversedSentence.append(reversedWord).append(" ");
            reversedSentence.toString().trim();
        }
        System.out.println(reversedSentence);
		
	}
	
	 public static String reverseString(String str) {
	        StringBuilder reversedStr = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversedStr.append(str.charAt(i));
	        }
	        return reversedStr.toString();
	        
	    }
	 
	 
		
	
	
	
}
