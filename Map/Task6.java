import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("num1", 1);
        map.put("num2", 2);
        map.put("num3", 3);
        Map<String, Integer> copy = new HashMap<>(map);
        System.out.println(map);
        System.out.println(copy);
    }
}
