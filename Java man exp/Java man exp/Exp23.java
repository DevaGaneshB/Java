//The this keyword can be passed as argument in the constructor call.
class B{  
  Exp23 obj;  
  B(Exp23 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of Exp23 class  
  }  
}  
  
class Exp23{  
  int data=10;  
  Exp23(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   Exp23 a=new Exp23();  
  }  
}  