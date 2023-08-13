package programming;

public class Final {
	
	final void getData() // if we declare method as final so we cannot override that method
	{
		
	}
	//packages - is set of classes and interfaces
	//java.lang- is default package and it's come in bulid with java compiler that's why we are not specifically mention that package
	//java.util- all the collection, interface come with util package
	/*
	 * class A can use the Class B directly by creating object if both class A and
	 * class B belong to same package if both class are belong to other package then
	 * we need to import the package name with class name
	 */
	/*
	 * public - variables/method as public : then you will have access accross all
	 * the packages
	 *  private-you can not access method or variable out side the class
	 * of same package 
	 * protected-variables/method as protected:you can access those
	 * in sub class only (other packages). */
	/*
	 * Default-access method any where only in the package
	 * 
	 * Default specfire example - void getData() {
	 * 
	 * }
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		//class name as final thats means you cannot extents that class

		final int i=8;   //final means constant variables any class should not alter the value it's should not change
	}

}
