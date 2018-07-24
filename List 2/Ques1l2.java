import java.util.Scanner;
public class Ques1l2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.printf("Enter temprature in F\n");
double fh=sc.nextDouble();
double cel=((fh-32*5)/9);
System.out.println(fh + " degree Fahrenheit is equal to " + cel + " in Celsius");
}
}