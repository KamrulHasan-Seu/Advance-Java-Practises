import java.util.HashSet;

public class HashSetClass  {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();

        list.add("Shamim");
        list.add("Kamrul");
        list.add("Rajon");

        for (String x: list) {
            System.out.println(x);
        }
    }
}
