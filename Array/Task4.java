import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println(color);
        System.out.println("Enter new color at the first position: ");
        color.set(0, scanner.nextLine());
        System.out.println(color);
    }
}
