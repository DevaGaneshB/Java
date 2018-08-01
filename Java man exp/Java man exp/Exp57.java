//Object cloning
	class Exp57 implements Cloneable{  
	int rollno;  
	String name;  
	  
	Exp57(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
	Exp57 s1=new Exp57(101,"amit");  
	  
Exp57 s2=(Exp57)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  
	}  
