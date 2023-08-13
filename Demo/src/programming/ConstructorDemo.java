package programming;

public class ConstructorDemo {
	
	//Default
	public ConstructorDemo()
	{
		System.out.println("I am in the  constructor");
	}
	
	//Parameterize constructor
		public ConstructorDemo(int a, int b)
		{
			System.out.println("I am in the Parameterize constructor");
		}
		
	public ConstructorDemo(String str)
	{
			System.out.println("I am in the Parameterize constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Constructor is special method or block of code we used to initialize the
		 * object and constructor is called when we create the object of the class.
		 * and name of constructor should be always the class name and it's not return value.
		 */
		/*
		 * SearchContext is the topmost interface in Selenium API which has two methods
		 * - findElement() and findElements(). Selenium WebDriver interface has many
		 * abstract methods like get(String url), quit(), close(), getWindowHandle(),
		 * getWindowHandles(), getTitle() etc.
		 */
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(2,3);
		//ConstructorDemo strcd = new ConstructorDemo("Hello");
		
		//compiler will called implict Constructor if (there is no constructor define )you have not define constructor block
		//whenever you create an object constructor is called


	}

}
