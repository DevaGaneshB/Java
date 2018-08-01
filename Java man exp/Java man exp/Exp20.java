//Where to use this() constructor call?
	class Exp20{  
	    int id;  
	    String name;  
	    String city;  
	      
	    Exp20(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    Exp20(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	    public static void main(String args[]){  
	    Exp20 e1 = new Exp20(111,"Deva");  
	    Exp20 e2 = new Exp20(222,"Alai","Chennai");  
	    e1.display();  
	    e2.display();  
	   }  
	}  
