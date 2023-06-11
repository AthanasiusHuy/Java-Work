import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        Collections.sort(color);
        System.out.println(color);
    }
}
