package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test (priority=1)
	public void evenOdd()
	{
		List<Integer> myList =  Arrays.asList(4,7,9,56,87,1,0,3);	
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		numbers.stream().filter(n->n%2 ==0).forEach(n->System.out.println(n));
		myList.stream().sorted().forEach(s->System.out.println(s)); // sort the array
	}
	
	public void startWithone()
	{
		List<Integer> myList =  Arrays.asList(14,17,9,56,87,11,0,3);	
		myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(s->System.out.println(s));  // first convert into string then use startwith
	}

	public void duplicateInteger()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(23,54,54,78,78));
		HashSet<Integer> set = new HashSet<Integer>();
		//numbers.stream().filter(s->!set.add(s)).forEach(s->System.out.println(s));  //duplicateInteger
		//numbers.stream().findFirst().ifPresent(s->System.out.println(s)); // print the first element into the list
		long count = numbers.stream().count();  // find the count of integer into the list
		System.out.println(count);
		
	}
	
	public void maxValue()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(23,54,55,78,88));
		int max = numbers.stream().max(Integer::compare).get();
		System.out.println(max);
	}
	public void repeatedCharacter()
	{
		String input = "Java Hungry Blog Alive is Awesome";

        Character result = input.chars() // Stream of String       
                                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                .entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() > 1L)
                                .map(entry -> entry.getKey())
                                .findFirst()
                                .get();
        System.out.println(result);
	}

	public void sortandprintintoDesc()
	{
		List<Integer> myList =  Arrays.asList(4,7,9,56,87,1,0,3);
		myList.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));
	}
	
	@Test(priority=0)
	public void minarray()
	{

        Integer[] arr  = new Integer [] {4,6,2,8,9};
        int[] arrs = {1,2,3,4};
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));

        
        
        int min = Arrays.stream(arrs).min().orElseThrow(()-> new IllegalArgumentException("Array is Empty"));
        System.out.println("Minium" + " " +min);

	}
	
	

}
