import java.util.Scanner;
public class Ques3l2 {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = sc.nextInt();

        int fD = num % 10;
        int rN = num / 10;
        int SD = rN % 10;
        rN = rN/ 10;
        int tD = rN % 10;

        int sum = tD + SD + fD;

        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}