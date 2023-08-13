package programming;

public class ChildDemo extends ParentDemoInheritance{
	
	String name ="QAClickAcademy";


	public ChildDemo()
	{
	super();// this should be always be at first line
	System.out.println("child class construtor");

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name);
	}


	public void getData()
	{
	super.getData();
	System.out.println("I am in child class");
	}
	
	//function overriding - both have method same name, same signature, same parameters
	// but when we run it then it'll give the preference to the local call
	  public void methodOverriding() {
	  System.out.println(" I am child class method for method overriding");
	  }
	 
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub



	ChildDemo cd = new ChildDemo();

	cd.getStringdata();
	cd.getData();
	cd.methodOverriding(); // function overriding
	}



}
