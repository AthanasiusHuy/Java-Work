import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("num1", 10);
        map.put("num2", 20);
        map.put("num3", 30);
        System.out.println(map);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
    }
}