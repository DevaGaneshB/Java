//Program of counter by static variable
	class Exp16{  
	static int count=0;//will get memory only once and retain its value  
	  
	Exp16(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
	Exp16 c1=new Exp16();  
	Exp16 c2=new Exp16();  
	Exp16 c3=new Exp16();  
	  
	 }  
	}  
