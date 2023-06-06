import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String org = "Java Exercises";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        char character = org.charAt(index);
        System.out.println("Character at index "+ index + " is " + character);
    }
}