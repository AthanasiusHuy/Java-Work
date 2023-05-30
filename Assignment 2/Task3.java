import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        System.out.println("Greatest Common Divisor: " + gcd);
        
    }
}
