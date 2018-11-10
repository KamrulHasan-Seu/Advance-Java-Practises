import java.util.List;

public class FilterAtLeastage30 implements FilterClass<PersonClass> {


    public boolean test(PersonClass personClass) {
        if (personClass.getAge() >= 30) {
            return true;
        }
        return false;
    }

    public PersonClass check(PersonClass personClass) {
        return null;
    }


}
