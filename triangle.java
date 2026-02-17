import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Triangle is equilater");
        }
        else if(side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("Triangle is Isoceles");
        }
        else{
            System.out.println("triangle is scalene");
        }
        scan.close();
    }
}
