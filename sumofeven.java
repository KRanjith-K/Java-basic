import java.util.Scanner;

public class sumofeven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        if(n>=0){
            for (int i = 0; i <= n; i++) {
                if( i % 2 == 0){
                 sum = sum + i;
                 
                }
                
            }
            System.out.print(sum);
        }
        else{
            System.err.println("Invalid Input");
        }
        scan.close();
    }
}
