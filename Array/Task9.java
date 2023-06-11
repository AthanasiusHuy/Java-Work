import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println(color);
        Collections.swap(color, 0,2);
        System.out.println(color);
    }
}
