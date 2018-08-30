import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        ReaderClass readerClass = new ReaderClass();
        PersonClass person = null;
//        for (PersonClass x :readerClass.getAllPerson()) {
//
//            System.out.println(x);
//
//            person = x;
//
//        }
        ArrayList<PersonClass> array = new ArrayList<PersonClass>();

        FilterClass<List<PersonClass>> mailOrFemaleCheck = new MailOrFemaleCheck();

        List<PersonClass> p = mailOrFemaleCheck.check(readerClass.getAllPerson());

        for (PersonClass s: p) {
            System.out.println(s);
        }




    }

}
