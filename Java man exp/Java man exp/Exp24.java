
//Example of this keyword that you return as a statement from the method

class A{  
A getA(){  
return this;  
}  
void msg(){System.out.println("Hello java");}  
}  
class Exp24{  
public static void main(String args[]){  
new A().getA().msg();  
}  
}  