import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timeformat {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        String fTime = formattedTime.format(time);
        System.out.println(fTime);
    }
}
