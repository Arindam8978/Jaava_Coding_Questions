package programming;

public class ReverseString {
	public static void main(String[] args)
	{
		String s = "hey";
		String actualString="";
		for(int i = s.length()-1; i>=0; i--)
		{
			//System.out.println(s.charAt(i));
			actualString = actualString+ s.charAt(i);
		}
		if(s.equals(actualString))
			System.out.println("String is palindrom");
		else
			System.out.println("String is not palindrom");
	}

}
