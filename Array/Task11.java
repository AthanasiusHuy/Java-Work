import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        System.out.println(color);
        List<String> color2 = new ArrayList<>();
        color2.add("green");
        List<String> joinlist = new ArrayList<>(color);
        joinlist.addAll(color2);
        System.out.println(joinlist);
    }
}
