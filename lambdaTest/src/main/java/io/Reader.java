package io;

import model.Person;
import model.Sex;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader {
    public List<Person> readPersonList() {
        List<Person> personList = new ArrayList<>();
        InputStream inputStream;

        {
            try {
                inputStream = new FileInputStream("persons.csv");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                bufferedReader.readLine();

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] tokens = line.split("\\,");

                    String name = tokens[0];
                    Sex sex = Sex.valueOf(tokens[1].toUpperCase());
                    int age = Integer.parseInt(tokens[2]);

                    Person person = new Person(name, sex, age);
                    personList.add(person);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return personList;
    }
}
