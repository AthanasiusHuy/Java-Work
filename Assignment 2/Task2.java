import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month you want to know the days of: ");
        int month = scanner.nextInt();
        int count = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            count = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            count = 30;
        } else if (month == 2){
            count = 28;
        }
        System.out.println(count + " days");
    }
}