package programming;

public class ChildDemoSuper extends ParentDemoSuper {
	
	String name = "Deepak";
	public ChildDemoSuper()
	{
		super(); // whenever you use a super constructor in child constructor it should always be the first line in the child constructor
		System.out.println("Child class constructor");
	}
	
	public void getStringData()
	{
		System.out.println(name); // normal name it's refer to the child class variable
									// when there is same variable declare then we use super keyword		
		System.out.println(super.name); //super keyword is actually refer to the parent class
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemoSuper cd = new ChildDemoSuper();
		cd.getStringData();
		cd.getData();
		
	}

}
