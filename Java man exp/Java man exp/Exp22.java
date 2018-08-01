//this keyword can be passed as an argument in the method.
	class Exp22{  
	  void m(Exp22 obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  
	  }  
	    
	  public static void main(String args[]){  
	  Exp22 s1 = new Exp22();  
	  s1.p();  
	  }  
	}  
