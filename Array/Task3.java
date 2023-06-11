import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println("Enter index to get color: ");
        int choice = scanner.nextInt();
        System.out.println(color.get(choice - 1));
        
    }
}
