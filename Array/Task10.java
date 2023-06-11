import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");
        for (int i = 0; i < color.size(); i++ ){
            String s = color.get(i);
            System.out.println("At position " + i + " is color " + s);
        }
    }
}
