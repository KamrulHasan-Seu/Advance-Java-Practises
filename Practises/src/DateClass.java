import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
public class DateClass {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date); //to see current date without any format

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String CurrentDate =  sdf.format(date);
        System.out.println(CurrentDate);

    }
}
