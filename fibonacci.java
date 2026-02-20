
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        
        while( b <= N){
            System.out.print(b + " ");
             
            int next = a + b;
            a = b;
            b = next;

        }
        scan.close();
    }
}
