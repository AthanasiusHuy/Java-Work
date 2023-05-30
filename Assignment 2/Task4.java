import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chart number: ");
        int a = scanner.nextInt();
        System.out.println("Enter multiply number: ");
        int b = scanner.nextInt();
        int c = 0;
        for (int i = 1; i <= b; i++){
            c = a * i;
            System.out.println(a + " x " + i + " = " + c);
        }
    }
}