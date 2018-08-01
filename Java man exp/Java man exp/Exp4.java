//Another Example of Object and Class
	class Exp4{  
	 int length;  
	 int width;  
	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	  
	 void calculateArea(){System.out.println("Area="+length*width);}  
	  
	 public static void main(String args[]){  
	  Exp4 r1=new Exp4();  
	  Exp4 r2=new Exp4();  
	  
	  r1.insert(11,5);  
	  r2.insert(3,15);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
	}  
