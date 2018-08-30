import java.io.*;
import java.util.ArrayList;

public class ReaderClass {

    private InputStream inputStream;
    private ArrayList<PersonClass> arrayList = new ArrayList<PersonClass>();

    public ArrayList<PersonClass> getAllPerson() {
        try {
            inputStream = new FileInputStream("persons.csv");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            bufferedReader.readLine();

            String lines;

            while ((lines = bufferedReader.readLine()) != null) {
                String[] token = lines.split(",");

                String name = token[0];
                String sex = token[1];
                int age = Integer.parseInt(token[2]);

                PersonClass personClass = new PersonClass(name, sex, age);
                arrayList.add(personClass);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayList;
    }
}
