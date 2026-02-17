
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int num1 = a;
        int num2 = b;

        while ( b != 0) { 
            int reminder = a % b;
            a = b;
            b = reminder;
        }

        System.out.println("GDC of " + num1 + " and " + num2 + " = " + a);
        scan.close();

    }
}
