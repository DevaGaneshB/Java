//Creating multiple objects by one type only
	class Exp6{  
	 int length;  
	 int width;  
	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	  
	 void calculateArea(){System.out.println(length*width);}  
	  
	 public static void main(String args[]){  
	  Exp6 r1=new Exp6(),r2=new Exp6();//creating two objects  
	    
	  r1.insert(11,5);  
	  r2.insert(3,15);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
	}  
