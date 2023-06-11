import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("num1", 10);
        map.put("num2", 20);
        map.put("num3", 30);
        map.clear();
        System.out.println(map);
    }
}
