//Java Copy Constructor
	class Exp14{  
	    int id;  
	    String name;  
	    Exp14(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    Exp14(Exp14 s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Exp14 s1 = new Exp14(111,"Deva");  
	    Exp14 s2 = new Exp14(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
