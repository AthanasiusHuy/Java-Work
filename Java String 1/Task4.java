import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        LocalDateTime clock = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedClock = clock.format(myFormat);
        System.out.println("Current Time: " + formattedClock);
    }
}
