package programming;

//one try can be followed by multiple catch block
//catch should be an immediate block for try

public class ExceptionDemo {
	
	public void getData()
	{
		
		try {
			/*
			 * int a=7,b=0, c; c = a/b;
			 */		
			int arr[]= new int[5];
			System.out.println(arr[7]);
		}
		catch(ArithmeticException et)
		{
			System.out.println("I catch the ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException et)
		{
			System.out.println("I catch the ArrayIndexOutOfBoundsException");
		}
		
		
		catch(Exception e)
		{
			System.out.println("I catch the Exception");
		}
		finally
		{
			System.out.println("delete Cookies");
			/*
			 * finally block will always execute irrespective of execption throw or not, if
			 * there is error in line no 13 then also finally block will execute in any
			 * condition mean it'll always execute if the scripts got failed or passed
			 */
			//we can write finally block with only with try block also
			//there is only to finally block won't execute if we stop the JVM forcefully means click on terminate
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionDemo ed = new ExceptionDemo();
		ed.getData();
	}

}
