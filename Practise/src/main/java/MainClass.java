import filter.FilterClass;
import person.PersonClass;
import reader.ReaderClass;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ReaderClass readerClass = new ReaderClass();
        PersonClass personClass = new PersonClass();
        List<PersonClass> readerClassAllPerson = readerClass.getAllPerson();

        FilterClass<List<PersonClass>> filterClass = (List<PersonClass>) ->

        {
            System.out.println("Hello .................");
            for (PersonClass x : readerClassAllPerson) {
                System.out.println(x);
            }
            ;

        }
        filterClass.test(readerClassAllPerson);
    }
}

