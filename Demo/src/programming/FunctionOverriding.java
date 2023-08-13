package programming;

public class FunctionOverriding extends FunctionOverloading{

	
	public void getData()
	{
	System.out.println("i am in method overriding");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverriding fn = new FunctionOverriding();
		fn.getData();
		
	}

}
