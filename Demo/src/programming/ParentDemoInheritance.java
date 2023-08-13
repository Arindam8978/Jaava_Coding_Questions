package programming;

public class ParentDemoInheritance {
	
	String name= "Rahul";

	public ParentDemoInheritance()
	{
	System.out.println("Parent class construtor");

	}
	public void getData()
	{
	System.out.println(" I am parent class");
	}

	//function overriding - both have method same name, same signature, same parameters
	// but when we run it then it'll give the preference to the local call
	public void methodOverriding()
	{
	System.out.println(" I am parent class method for method overriding");
	}

	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	}

}
