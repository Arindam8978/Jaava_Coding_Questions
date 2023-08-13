package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaCodingInterViewQuestions {
	

	public void sumOfDigitInNumber()
	{
		int input, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Interger");
		 input = sc.nextInt();
		for (int i = 1; i <=input; i++) {
			if(i==12)
				continue;
			sum = sum + i;			
		}
		System.out.println("Sum of " + input + " = " +sum);
		
	}
	
	public void ReverseStringWithoutusingPreBulidFunction()
	{
		String reverseString = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String");
		String str = sc.nextLine();
		for (int i = str.length()-1; i >= 0 ; i--) {
			reverseString = reverseString.trim() + str.charAt(i);
			
		}
		System.out.println(reverseString);
		if(reverseString.equalsIgnoreCase(str))
			System.out.println("Palindrom");
		else
			System.out.println("not palindrom");
		
	}
	
	


	public void SecondLargestElement ()
	{

	  
	        int[] arr = {10, 30, 25, 50, 20, 45, 40};

	        int secondLargest = findSecondLargest(arr);
	        System.out.println("Second largest element: " + secondLargest);
	    }
	

public static int findSecondLargest(int[] arr) {
    if (arr == null || arr.length < 2) {
        throw new IllegalArgumentException("Array must contain at least two elements.");
    }
    
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    if (secondLargest == Integer.MIN_VALUE) {
        throw new IllegalArgumentException("Second largest element does not exist in the array.");
    }

    return secondLargest;
}
    
	public void sumOfAllElementInArray()
	{
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();
		 for (int i = 0; i <array.length; i++) {
			sum = sum+array[i];
			 
		}
		 System.out.println("Sum of all the elements in array "+" : " + sum);
	}

	
    public void removeDuplicateElementinArray()
    {
    	 Integer[] arr = new Integer[] {10, 30, 25, 50, 20, 45, 40, 45};
    	 ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
    	 //Object[] distinctArray = al.stream().distinct().toArray();
    	Object[] distinctArray=  Arrays.stream(arr).distinct().toArray();
    	System.out.println("Original Array : "+ Arrays.toString(arr));
    	System.out.println("Array after removing duplicate : " +Arrays.toString(distinctArray));
    	
    	
    	Set<Integer> uniqueElement = new HashSet<Integer>();
    	Arrays.stream(arr).filter(n->!uniqueElement.add(n)).distinct().
    	forEach(duplicate->System.out.println("duplicate element " + duplicate));
 		
    }
    
	public void twoArraysAreEqualOrNot()
	{
		int[] arrOne = new int[] {1,2,3,4,5};
		int[] arrTwo = new int[] {1,2,3,4,5,6};
		
		boolean areEquals = Arrays.equals(arrOne, arrTwo);
		if(areEquals)
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are not equal");
	}
	
    public void mergeTwoSortedArrayIntoASingleSortedArray()
    {
		/*
		 * int[] arr1 = {1, 3, 5, 7, 9}; int[] arr2 = {2, 4, 6, 8, 10}; int[]
		 * mergedArray = mergeSortedArrays(arr1, arr2);
		 * 
		 * System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
		 */
		
		  Integer[] arrOne = new Integer[] {7,2,9,4,5}; Integer[] arrTwo = new
		  Integer[] {9,2,6,4,5,6};
		  
		  ArrayList<Integer> newArrOne = new ArrayList<Integer>(Arrays.asList(arrOne));
		  ArrayList<Integer> newArrTwo = new ArrayList<Integer>(Arrays.asList(arrTwo));
		  Stream<Integer> firstarr = newArrOne.stream().sorted(); 
		  Stream<Integer>	  Secondarr =newArrTwo.stream().sorted(); 
		  Stream<Integer> newArray = Stream.concat(firstarr, Secondarr);
		  Object[]  results=	  newArray.sorted().toArray();/*forEach(s->System.out.print(s +","));*/
		  System.out.println("Merged Sorted Array: " + Arrays.toString(results));
		 
		
    }
	/*
	 * public static int[] mergeSortedArrays(int[] arr1, int[] arr2) { int[]
	 * mergedArray = Arrays.stream(arr1) .concat(Arrays.stream(arr2)) .sorted()
	 * .toArray();
	 * 
	 * return mergedArray; }
	 */
    
	public void missingNumberOfAnArrayOfConsecuitiveNumber()
	{
	     int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10}; // Example array with a missing number 4

	        int missingNumber = findMissingNumber(arr);

	        System.out.println("The missing number is: " + missingNumber);
	}
	   public static int findMissingNumber(int[] arr) {
	        int n = arr.length + 1; // The length of the original array + 1 (since one number is missing)
	        int totalSum = n * (n + 1) / 2;

	        int arraySum = Arrays.stream(arr).sum();

	        int missingNumber = totalSum - arraySum;

	        return missingNumber;
	    }
	
	  public void commanElementBetweenTwoArray()
	  {
			int[] arrOne = new int[] {1,2,3,4,5,7};
			int[] arrTwo = new int[] {1,2,3,4,5,6};
			
			List<Integer> commonElements = findCommanElement(arrOne,arrTwo);
			 System.out.println("Common Elements: " + commonElements);
	  }
	   public static List<Integer> findCommanElement(int [] arr1, int [] arr2 )
	   {
		   List<Integer> comman = new ArrayList<Integer>();
		   for( int arrFirst : arr1 )
		   {
			   for (int arrSecond: arr2)
			   {
				   if(arrFirst ==arrSecond )
				   {
					   comman.add(arrFirst);
					   break;
				   }
			   }
		   }
		   	return comman;
		   
	   }
	  
	   public void countTheFrequenceyOfElementInArray()
	   {
		      int[] arr = {1, 2, 1, 3, 4, 2, 5, 1, 4};

		        Map<Integer, Long> frequencyMap = countFrequency(arr);

		        for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
		            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
		        }
	   }
	      public static Map<Integer, Long> countFrequency(int[] arr) {
	            return Arrays.stream(arr)
	                         .boxed()
	                         .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
	        }
	      
	   public void palindromNumber()
	   {
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();


	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	   }
	   public static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }
	   
	   public void fizzBuzz()
	   {
		  
			 
			        for (int i = 1; i <= 100; i++) {
			            if (i % 3 == 0 && i % 5 == 0) {
			                System.out.println("FizzBuzz");
			            } else if (i % 3 == 0) {
			                System.out.println("Fizz");
			            } else if (i % 5 == 0) {
			                System.out.println("Buzz");
			            } else {
			                System.out.println(i);
			            }
			        }
	   	}
	   
	   public void sumOfAllEvenNumbers()
	   {
		   int sum =0;
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter a number to calculate sum of even numbers : ");
		   int number = sc.nextInt();
		   for(int i=1 ; i<=number; i++)
		   {
			   if(i%2==0)
			   sum = sum+i;
		   }
		   System.out.println("Sum of all even numbers are : " +sum);
			   
	   }
	   		
	   public void leapYearCheck()
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter a year to check Leap Year or not  : ");
		   int yearToCheck = sc.nextInt();
		    if (isLeapYear(yearToCheck)) {
	            System.out.println(yearToCheck + " is a leap year.");
	        } else {
	            System.out.println(yearToCheck + " is not a leap year.");
	        }
			   
	   }
	   public static boolean isLeapYear (int year)
	   {
		   if ((year % 4==0 && year % 100 != 0 ) || (year % 400 ==0))
			   return true;
		   else
			   return false;
		   
	   }
	   
	   public void simpleCalculator()
	   {
		   
		   Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Calculator");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.println("5. Exit");

	        while (true) {
	            System.out.print("Enter your choice (1-5): ");
	            int choice = scanner.nextInt();

	            if (choice == 5) {
	                System.out.println("Exiting the calculator...");
	                break;
	            }

	            if (choice < 1 || choice > 4) {
	                System.out.println("Invalid choice. Please try again.");
	                continue;
	            }

	            System.out.print("Enter the first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter the second number: ");
	            double num2 = scanner.nextDouble();

	            double result = 0;

	            switch (choice) {
	                case 1:
	                    result = num1 + num2;
	                    break;
	                case 2:
	                    result = num1 - num2;
	                    break;
	                case 3:
	                    result = num1 * num2;
	                    break;
	                case 4:
	                    if (num2 == 0) {
	                        System.out.println("Error: Division by zero is not allowed.");
	                        continue;
	                    }
	                    result = num1 / num2;
	                    break;
	            }

	            System.out.println("Result: " + result);
	        }

	        scanner.close();
	    }
	   
	   public void largestAmongestThreeNumbers()
	   {
		   int largest;
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter first Number : ");
		   int num1 = sc.nextInt();
		   
		   System.out.print("Enter second Number : ");
		   int num2 = sc.nextInt();
		   
		   System.out.print("Enter third Number : ");
		   int num3 = sc.nextInt();
		   
		   
		   if(num1>= num2 && num1>=num3)
			   largest= num1;
		   else if (num2>= num1 && num2>=num3) 
			   largest =num2;
		   else
			   largest = num3;
		   System.out.println("The largest number is: " + largest);
		   sc.close();
		   
	   }
	   
	   public void reverseNumberUsingWhileLoop()
	   {
		   int reverse = 0;
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter a Number : ");
		   int num = sc.nextInt();
		   
		   while(num!=0)
		   {
			   int lastDigit = num %10;
			   reverse = reverse * 10 + lastDigit;
			   num = num /10;
		   }
		   System.out.println("The reverse fo the number is : " +reverse);
		   
	   }
	   
	   public void arrayCumilativeSum()
	   {
		   int [] arr = new int [] {1,2,3};
		   
		   int sum=0;
		   for (int i=0;i < arr.length; i++)
		   {
			   sum+=arr[i];
			   arr[i]=sum;
		   }
		   System.out.println("Cumulative Sum of the Array:");
	        for (int s : arr) {
	            System.out.print(s + " ");
	        }
	   }
	   
	   public void stream ()
	   {
		   Integer [] arr = new Integer [] {5,2,3};
		   ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		   al.stream().sorted().forEach(s->System.out.println(s));
		   //System.out.println(arr);
		   
		   
	   }
	   
	   public void calculateFactorialUsingRecursive()
	   { 
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter an Integer :");
		   int number = sc.nextInt();
		   int factorial = calculateFactorial(number);
		   System.out.println("Factorial of " +number +" is " +factorial );
		   
		   
	   }
	   public static int calculateFactorial(int n)
	   {
		   if(n==0)
			   return 1;
		   
		   return n * calculateFactorial(n-1);
		   
	   }
	   
	   @Test
	   public void reverseStringUsingRecursion()
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter a String :");
		   String str = sc.nextLine();
		   String reverse = reverseString(str);
		   System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reverse);
		   
		   
	   }
	   public static String reverseString(String str)
	   {
		   if(str.isEmpty() || str.length()==1)
		   return str;
		   
		return reverseString(str.substring(1)) + str.charAt(0);
	   }
	   

	   




    
}





