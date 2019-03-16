import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(20);
        number.add(10);
        number.add(30);

        System.out.println("using nirmal format:"+number);

        number.add(3,50);
        System.out.println("using index"+number);

        number.add(4,40);
        System.out.println(" ");
        System.out.println("Using Foreach loop:");
        for (int x:number
             ) {
            System.out.print(x +" ");

        }
        System.out.println(" ");
        System.out.print("Using Iterator:");
        Iterator itr = number.iterator();

        while (itr.hasNext()){
            System.out.print(" "+itr.next());
        }

        System.out.println("Removing number");
        number.remove(4);
        System.out.println(number);

        //size

        int size = number.size();
        System.out.println("SIze:"+size);

        //Empty or NOt

        boolean b = number.isEmpty();
        System.out.println("Empty or Not:"+b);

        //Contains

        boolean x = number.contains(30);
        System.out.println("Contains or Not:"+x);

        //sort
        System.out.println("Before sorting:"+ number);
        Collections.sort(number);
        System.out.println("After sorting:"+number);

        //reverse sort
        Collections.reverse(number);
        System.out.println("After Reverse :"+number);

        //remove data
        number.add(40);
        number.remove(3);
        System.out.println(number);

        ArrayList<student> list = new ArrayList<student>();


        student s1 = new student("kamrul","Cse",101);
        student s2 = new student("Raju","Bba",102);
        student s3 = new student("Shamim","Pharmacy",103);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (student s:list) {
            System.out.println(s.name+" "+s.dept+" "+s.id);
        }
    }
}
