import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(-20);
        arrayList.add(50);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(-6);

        System.out.println("Before Sorting: "+ arrayList);

        Collections.sort(arrayList);
        /*
        Asscending Order Sort
         */
        System.out.println("Ascending sort: "+arrayList);
        /*
        Descending Sort
         */
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("Descendin Sort: "+ arrayList);

    }
}
