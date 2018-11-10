package filter;

import filter.FilterClass;
import person.PersonClass;

import java.util.ArrayList;
import java.util.List;

public class MatchAge implements FilterClass<List<PersonClass>> {

    private List<PersonClass> personClass2 = new ArrayList<>();

    public List<PersonClass> test(List<PersonClass> personClasses) {

        for (PersonClass p : personClasses) {

            if (p.getAge() > 30) {
                personClass2.add(p);
            }

        }

        return personClass2;
    }
}
