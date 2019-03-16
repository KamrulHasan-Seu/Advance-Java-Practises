import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Bangladesh");
        name.add("India");
        name.add("pakistan");
        name.add("Nepal");
        System.out.println(name);

        name.addFirst("Australia");
        name.addLast("Japan");
        System.out.println(name);


        System.out.println(name.getFirst());
    }
}
