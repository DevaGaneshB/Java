//The this keyword can be used to invoke current class method (implicitly).
	class Exp21{  
	  void m(){  
	  System.out.println("method is invoked");  
	  }  
	  void n(){  
	  this.m();//no need because compiler does it for you.  
	  }  
	  void p(){  
	  n();//complier will add this to invoke n() method as this.n()  
	  }  
	  public static void main(String args[]){  
	  Exp21 s1 = new Exp21();  
	  s1.p();  
	  }  
	}  
