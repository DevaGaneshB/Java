//Java Deserialization
	import java.io.*;  
	class Depersist{  
	 public static void main(String args[])throws Exception{  
	    
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
	  Depersist s=(Depersist)in.readObject();  
	  System.out.println("gffgh");  
	  
	  in.close();  
	 }  
	}  
