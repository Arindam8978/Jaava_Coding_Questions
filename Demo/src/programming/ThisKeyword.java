package programming;

public class ThisKeyword {
	
	int a =2;
	
	public void getData()
	{
		int a=3;
		int c = a+this.a;
		System.out.println(c);
		System.out.println(a);
		System.out.println(this.a);
		//this keyword refer to the current object - and object scope lies in class level
		// and this refer to the global level

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ThisKeyword t = new ThisKeyword();
		t.getData();

	}

}
