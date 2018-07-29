//Java final method
	class Exp36{  
	  final void run(){System.out.println("running");}  
	}  
	     
	class Honda extends Exp36{  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  
