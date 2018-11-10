import java.util.ArrayList;

public class Main {

    public Main() {
        ArrayList<product> arraylist = new ArrayList<product>();
        product prod = new product("Milk", 50);
        arraylist.add(prod);

        System.out.println(arraylist);
    }

    public static void main(String[] args) {


        //product prod1 = new product("Milk2",250);

        new Main();


    }
}
