	class Exp3{  
	 int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n){  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation(){System.out.println(rollno+" "+name);}//method  
	  
	 public static void main(String args[]){  
	  Exp3 s1=new Exp3();  
	  Exp3 s2=new Exp3();  
	  
	  s1.insertRecord(111,"Deva");  
	  s2.insertRecord(222,"Alai");  
	  
	  s1.displayInformation();  
	  s2.displayInformation();  
	  
	 }  
	}  
