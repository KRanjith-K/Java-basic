import java.util.Scanner;

public class allprime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n >= 2) {
            
            for (int num = 2; num <= n; num++) {
                boolean isPrime = true;
                
                
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                
                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        } else {
            System.out.println("No prime numbers");
        }
        
        scan.close();
    }
}
