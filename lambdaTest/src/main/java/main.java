import filter.Filter;
import filter.MaleFilter;
import io.Reader;
import model.Person;
import model.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
//        Reader reader = new Reader();
//        List<Person> showAllList = new ArrayList<Person>();
//
//        showAllList = reader.readPersonList();
//
//        //showAllList.forEach(System.out::println);
//
//
//        Filter<Person> maleFilter = new MaleFilter();
////        for (Person p : reader.readPersonList()) {
////            if (maleFilter.test(p)) {
////                System.out.println(p);
////            }
////        }
//
//
//        /*Filter<Person> femaleFilter = person -> {
//            if(person.getSex().equals(Sex.FEMALE))
//            {
//                if(person.getAge() > 30)
//                {
//                    return true;
//                }
//            }
//
//            return false;
//        };*/
//
//        List<Person> femalePerson = reader.readPersonList().stream()
//                .filter(person -> person.getSex().equals(Sex.FEMALE))
//                .collect(Collectors.toList());
//
//        femalePerson.forEach(System.out::println);
//
//        /*for (Person p: reader.readPersonList()) {
//            if(femaleFilter.test(p)) {
//                System.out.println(p);
//            }
//
//        }*/
        Reader reader = new Reader();
        Filter<Person> maleFilter = new Filter<Person>() {
            @Override
            public boolean test(Person person) {
                if (person.getSex().equals(Sex.MALE)) {
                    return true;

                }
                return false;
            }
        };

        for (Person p : reader.readPersonList()) {
            if (maleFilter.test(p)) {
                System.out.println(p);
            }
        }
    }
}
