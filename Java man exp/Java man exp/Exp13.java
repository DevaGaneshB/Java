//Java parameterized constructor
	class Exp13{  
	    int id;  
	    String name;  
	      
	    Exp13(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Exp13 s1 = new Exp13(111,"Deva");  
	    Exp13 s2 = new Exp13(222,"Alai");  
	    s1.display();  
	    s2.display();  
	   }  
	}  
