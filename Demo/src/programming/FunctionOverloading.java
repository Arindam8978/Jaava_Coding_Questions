package programming;

public class FunctionOverloading {
	//function overloading
	//either argument count should be different or
	//argument data type should be different

	
	public void getData()
	{
	System.out.println("i am in method overloading");	
	}
	
	
	public void getData(int a)
	{
	System.out.println(a);	
	}
	public void getData(String a)
	{
		System.out.println(a);		
	}
	public void getData(int a, int b)
	{
		System.out.println(a);	
		System.out.println(b);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading function = new FunctionOverloading();
		function.getData(2);
		function.getData(3);
		function.getData(4, 5);
	}

}
