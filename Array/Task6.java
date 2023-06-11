import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println("Enter color to find: ");
        String find = scanner.nextLine();
        boolean isFound = color.contains(find);
        if (isFound) {
            System.out.println("Color Found !");
        } else {
            System.out.println("Color Not Found !");
        }
    }
}
