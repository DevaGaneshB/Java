import java.util.Scanner;
public class Ques2l2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.printf("Enter length in inches\n");
double inch=sc.nextDouble();
double met=(inch*0.0254);
System.out.println(inch + " inch is equal to " + met + " meters");
}
}