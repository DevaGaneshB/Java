import java.util.*;
 public class Ques63 {
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = sc.nextInt();  
		System.out.print("Input the second number: ");
		int b = sc.nextInt(); 
		System.out.println("Result: "+result(a, b));
    }
	public static int result(int x, int y)
     {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
     }
}