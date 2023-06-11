import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("yellow");
        color.add("blue");

        List<String> color2 = new ArrayList<>();
        color2.add("red");
        color2.add("yellow");
        color2.add("blue");

        List<String> color3 = new ArrayList<>();
        color3.add("green");

        boolean check = color.equals(color2);
        boolean check2 = color.equals(color3);
        System.out.println(check + " " + check2);
        
    }

}
