//Example of Method Overloading by changing data type of argument
	class Exp8{  
	  void sum(int a,int b){System.out.println(a+b);}  
	  void sum(double a,double b){System.out.println(a+b);}  
	  
	  public static void main(String args[]){  
	  Exp8 obj=new Exp8();  
	  obj.sum(10.5,10.5);  
	  obj.sum(20,20);  
	  
	  }  
	}  
