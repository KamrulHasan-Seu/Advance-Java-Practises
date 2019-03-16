import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer,String> list = new HashMap<Integer, String>();

        list.put(101,"Shamim");
        list.put(102,"Kamrul");
        list.put(103,"Rajon");
        list.put(104,"Sovon");

        System.out.println(list.get(102));
    }
}
