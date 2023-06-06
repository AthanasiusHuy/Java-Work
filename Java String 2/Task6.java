import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("Enter the sequence: ");
        String seq = scanner.nextLine();
        int result = str.compareTo(seq);

        if (result == 0) {
            System.out.println("String is equal to sequence.");
        } else if (result < 0) {
            System.out.println("String comes before sequence.");
        } else {
            System.out.println("String comes after sequence.");
        }
    }
}
