import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<Integer,String>();
        hash.put(101,"kamrul");
        hash.put(102,"Shamim");
        hash.put(103,"Raju");

        System.out.println(hash.get(101));
        System.out.println(hash.get("kamrul"));
        System.out.println(hash.get(103));
    }
}
