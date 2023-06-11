import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println(color);
        color.remove(2);
        System.out.println(color);
    }
}
