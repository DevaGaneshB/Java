//Java static method
	//Program of changing the common property of all objects(static field).  
	  
	class Exp17{  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change(){  
	     college = "RIT";  
	     }  
	  
	     Exp17(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    Exp17.change();  
	  
	    Exp17 s1 = new Exp17 (111,"Deva");  
	    Exp17 s2 = new Exp17 (222,"Alai");  
	    Exp17 s3 = new Exp17 (333,"Dilipan");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  
