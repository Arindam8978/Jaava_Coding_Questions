package programming;

public class StaticVariable {

	String name;  // this are instance variable
	String address;
	//static String city= "Bangalore"; //static variables are class variable bangalore is common city so i put into static variable
	//static int i=0; // static variable are shared so it'll increment there last count and won't start form 0 again.
	static String city;
	static int i; 
	
	static {    // static block 
		city = "Bangalore";
		i=0;
	}
	
	StaticVariable(String name, String address)
	{
		this.name = name; // this refer to the current class instance
		this.address= address; //local variable
		i++;
		System.out.println(i);
		
		
		
	}
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	public static void getCity()
	{
		System.out.println(city); // static method will only call static variable
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable sv = new StaticVariable("Bob","Martaili");
		StaticVariable sv1 = new StaticVariable("Bob","JayaNagar");
		//StaticVariable sv1 = new StaticVariable("Dore","JayaNagar","Bangalore");
		sv.getAddress();
		sv1.getAddress();
		StaticVariable.getCity(); // when we put method name as static then no need to create the object 
		StaticVariable.i=2;
		sv.address="pune";
		
		
	}

}
