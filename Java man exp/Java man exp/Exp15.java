//Program of counter without static variable
	class Exp15{  
	int count=0;//will get memory when instance is created  
	  
	Exp15(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
	Exp15 c1=new Exp15();  
	Exp15 c2=new Exp15();  
	Exp15 c3=new Exp15();  
	  
	 }  
	}  
