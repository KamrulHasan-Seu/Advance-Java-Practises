import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        //adding number in the ArrayList
        array.add(25);
        array.add(10);
        array.add(15);

         array.add(3,5);//insert number in the array by index
        array.add(4,20);

        /*
        printout arraylist By simple Method
         */
        System.out.println(array);

      /*
      printout arraylist by for each loop
       */
        for (int x:array) {
            System.out.println(x);
        }
        /*
        For removing item from ArrayList
         */
        array.remove(2);//by selecting index

        System.out.println("Removing 2nd index: "+array);

        /*
        Printing size
         */

        System.out.println("Size is: "+array.size());
        /*
        Set method use
         */
        int replace = array.set(3,50);
        System.out.println("After Replacing: "+array);
        /*
        get method
         */
        int x = array.get(2);
        System.out.println(x+"in the following index");


        /*
        Removing all number from ArrayList
         */
        array.removeAll(array);
        System.out.println("After removing all: "+array);
    }
}
