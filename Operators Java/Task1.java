import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 5;
        int width = 7;
        int perimeter = 2 * length + 2 * width;
        int area = length * width;
        System.out.println("PERIMETER: " + perimeter + " " + "AREA: " + area);

    }
}