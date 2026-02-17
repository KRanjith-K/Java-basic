
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double sum = num1+num2+num3;
        double avg = sum/3;

        System.out.println(avg);
    }
}
