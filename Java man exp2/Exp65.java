//call by value in java
	class Exp65{  
	 int data=50;  
	  
	 void change(int data){  
 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){  
	   Exp65 op=new Exp65();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  
