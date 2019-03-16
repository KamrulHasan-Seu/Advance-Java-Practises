import java.text.DecimalFormat;
import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        double x = 3.566768796;
        System.out.println(x);

        System.out.printf("%.2f",x);

        System.out.println("");
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println(dc.format(x));

    }
}
