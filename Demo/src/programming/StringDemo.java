package programming;

public class StringDemo {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		// String - in java point of view string is a one of the prebuilt class.
		// How to declare string in java.
		// 1.string literal 
		// 2.by creating the object of the string.
		
		String a = "hello"; //string literal
		String b = "hello"; // in this case one more string class object won't create because 
							// it's contains a same value so when it's check in the object pull
							// same string is available so it's refer to object a string to object b
							//b object variable is refer to the original object 
							// but in the below case it's will create two separate object
		
		String a1 = new String("hello"); 	//by creating the object of the string Class.
		String b1 = new String("hello");    // string class create new object every time in memory. 
											//and string literal will not if we declare like 		String a = "hello"; //string literal
																								//String b = "hello";
		
		
		System.out.println(a.equals(b)); //return true- .equal() check the content comparison
		System.out.println(a==b);//return true-  == check the reference comparison
		
		System.out.println(a==a1);//return false-  == the reference is different for both the variable.
		System.out.println(a.equals(a1));//return true-  == the content is same for both the variable.

		System.out.println(a1==b1);//return false- references are different as they are defined with string class.
		
		String abc = " javatraning";
		
		System.out.println(abc.charAt(2));
		System.out.println(abc.replace("h", "i"));
		System.out.println(abc.indexOf("a"));
		System.out.println(abc.substring(3, 5));
		System.out.println(abc.concat("hello "));
		System.out.println(abc.trim());
		String arr[] = abc.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		abc.concat("world");
		System.out.println(abc); //here will print javatraning the original contant can't be concatenet
		String s = abc.concat("world");
		System.out.println(s); // if we concat and store into another variable then it'll work.
	}

}
