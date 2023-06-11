import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println(color);
        List<String> color2 = new ArrayList<>();
        color2.add("green");
        color2.add("cyan");
        for (String s : color) {
            color2.add(s);
        }
        System.out.println(color2);
    }
}
