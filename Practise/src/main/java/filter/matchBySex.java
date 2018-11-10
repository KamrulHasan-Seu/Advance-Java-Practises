package filter;

import filter.FilterClass;
import person.PersonClass;
import person.Sex;

import java.util.ArrayList;
import java.util.List;

public class matchBySex implements FilterClass<List<PersonClass>> {

    private List<PersonClass> personClassList = new ArrayList<>();

    public List<PersonClass> test(List<PersonClass> personClasses) {
        for (PersonClass z : personClasses) {
            if (z.getSex().equals(Sex.Female)) {
                personClassList.add(z);
            }
        }
        return personClassList;
    }
}
