//Understanding the problem without this keyword
	class Exp18{  
	    int id;  
	    String name;  
	      
	    Exp18(int id,String name){  
	    id = id;  
	    name = name;  
	}  
	    void display(){System.out.println(id+" "+name);}  
	  
	    public static void main(String args[]){  
	    Exp18 s1 = new Exp18(111,"Deva");  
	    Exp18 s2 = new Exp18(321,"Alai");  
	    s1.display();  
	    s2.display();  
	    }  
	}  
