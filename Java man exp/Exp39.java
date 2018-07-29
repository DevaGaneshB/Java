//Java Runtime Polymorphism
	class Exp39{  
	int getRateOfInterest(){return 0;}  
	}  
	  
	class SBI extends Exp39{  
	int getRateOfInterest(){return 8;}  
	}  
	  
	class ICICI extends Exp39{  
	int getRateOfInterest(){return 7;}  
	}  
	class AXIS extends Exp39{  
	int getRateOfInterest(){return 9;}  
	}  
	  
	class Test3{  
	public static void main(String args[]){  
	Exp39 b1=new SBI();  
	Exp39 b2=new ICICI();  
	Exp39 b3=new AXIS();  
	System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
	System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  
	}  
	}  
