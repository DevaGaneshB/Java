class Employee{  
 float salary=40000;  
}  
class Exp25 extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Exp25 p=new Exp25();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  