import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println("Enter new color: ");
        color.add(0, scanner.nextLine());
        System.out.println(color);
    }
}
