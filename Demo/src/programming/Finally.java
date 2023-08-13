package programming;

import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finally f = new Finally();
		f.alldata();
	}
	
	public int getData()
	{
		try
		{
			return 1;
		}
		catch(Exception ex)
		{
			return 2;
		}
		finally
		{
			System.out.println("i am the finally block");
			System.exit(0);
		}
		
	}
	
	public int alldata()
	{
		 try {
		     System.out.println("I am in try block");
		     int x = 10/0;
		     System.out.println("Result: " +x);
		     return 0;
		  }
		  catch(ArithmeticException ae)
		  {
		    System.out.println("I am in catch block");
		    return 40;
		  }
		 finally {
		     System.out.println("I am in finally block");	
		    // return 50;
		     System.exit(0);
		  }
		
	}

}
