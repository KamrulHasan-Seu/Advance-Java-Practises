import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<student> list = new LinkedList<student>();


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
