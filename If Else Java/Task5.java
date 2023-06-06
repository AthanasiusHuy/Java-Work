import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mark: ");
        int mark = scanner.nextInt();
        if (mark < 25) {

            System.out.println("GRADE F");
        } else if (mark >= 25 && mark < 45) {

            System.out.println("GRADE E");
        } else if (mark >= 45 && mark < 50) {

            System.out.println("GRADE D");
        } else if (mark >= 50 && mark < 60) {

            System.out.println("GRADE C");
        } else if (mark >= 60 && mark < 80) {

            System.out.println("GRADE B");
        } else if (mark >= 80) {

            System.out.println("GRADE A");
        }
    }
}
