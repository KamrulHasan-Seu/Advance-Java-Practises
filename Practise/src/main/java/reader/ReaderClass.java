package reader;

import person.PersonClass;
import person.Sex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderClass {

    public List<PersonClass> getAllPerson() {
        InputStream inputStream;
        List<PersonClass> list = new ArrayList<PersonClass>();
        {
            try {

                inputStream = new FileInputStream("persons.csv");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                bufferedReader.readLine();

                String line;
                while ((line = bufferedReader.readLine()) != null) {

                    String[] token = line.split(",");
                    String name = token[0];
                    Sex sex = Sex.valueOf(token[1]);
                    int age = Integer.parseInt(token[2]);

                    PersonClass person = new PersonClass(name, sex, age);
                    list.add(person);
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        return list;
    }
}


