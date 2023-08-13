package programming;

public class CallByValue {
	/*
	 * int data=50;
	 * 
	 * void change(int data){ data=data+100;//changes will be in the local variable
	 * only }
	 * 
	 * public static void main(String args[]){ CallByValue op=new CallByValue();
	 * 
	 * System.out.println("before change "+op.data); op.change(500);
	 * System.out.println("after change "+op.data);
	 * 
	 * }
	 */ 
	
	int data=50;  
	  
	 void change(CallByValue op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	 
	 void chance (int data)
	 {
		 data= data+100;
	 }
	     
	    
	 public static void main(String args[]){  
		 CallByValue op=new CallByValue();  
	  
	   System.out.println("before change "+op.data);  
	   //op.change(op);//passing object  
	   op.chance(500);
	   System.out.println("after change "+op.data);  
	  
	 }  


}
