import java.util.ArrayList;
import java.util.List;

public class MailOrFemaleCheck implements FilterClass<List<PersonClass>>  {


    public boolean test(List<PersonClass> personClasses) {
        return false;
    }

    public List<PersonClass> check(List<PersonClass> personClasses) {

        List<PersonClass> listOfMale = new ArrayList<PersonClass>();

        for (PersonClass personClass: personClasses) {
            if (personClass.getSex().toLowerCase().equals("male"))
            {
                listOfMale.add(personClass);
            }
        }

        return listOfMale;
    }
}
