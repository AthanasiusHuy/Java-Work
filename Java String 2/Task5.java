import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("Enter the sequence: ");
        String seq = scanner.nextLine();
        boolean isTrue = str.contains(seq);
        if (isTrue) {
            System.out.println("String contain sequence");
        } else {
            System.out.println("String not contain sequence");
        }
    }
}