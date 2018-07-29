//Simple Example of Aggregation
	class Exp27{  
	 int square(int n){  
	  return n*n;  
	 }  
	}  
	  
	class Circle{  
	 Exp27 op;//aggregation  
	 double pi=3.14;  
	    
	 double area(int radius){  
	   op=new Exp27();  
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
	   return pi*rsquare;  
	 }  
	  
	     
	 }
	 class main{   
	 public void main(String args[]){  
	   Circle c=new Circle();  
	   double result=c.area(5);  
	   System.out.println(result);  
	 }  
	}  
