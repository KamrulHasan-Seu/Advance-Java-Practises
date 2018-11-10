package filter;

import model.Person;
import model.Sex;

public class MaleFilter implements Filter<Person> {
    @Override
    public boolean test(Person p) {
        if (p.getSex().equals(Sex.MALE))
            return true;
        else
            return false;
    }
}
