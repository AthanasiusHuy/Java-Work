import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("num1", 10);
        map.put("num2", 20);
        map.put("num3", 30);
        System.out.println(map);
        String s = "num4";
        boolean isFound = map.containsKey(s);
        if (isFound) {
            System.out.println("Key found !");
        } else {
            System.out.println("Key not found !");
        }

    }
}