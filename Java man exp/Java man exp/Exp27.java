class Operation{  
 int square(int n){  
  return n*n;  
 }  
}  
  
class Exp27{  
 Operation op;//aggregation  
 double pi=3.14;  
    
 double area(int radius){  
   op=new Operation();  
   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
   return pi*rsquare;  
 }  
  
     
    
 public static void main(String args[]){  
  Exp27 c=new Exp27();  
   double result=c.area(5);  
   System.out.println(result);  
 }  
}  