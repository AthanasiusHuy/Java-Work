import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chart number: ");
        int n = scanner.nextInt();
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}