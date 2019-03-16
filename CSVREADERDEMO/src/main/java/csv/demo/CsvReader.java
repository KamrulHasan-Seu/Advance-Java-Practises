package csv.demo;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Route
public class CsvReader extends VerticalLayout {
    private Grid<Grades> grid = new Grid<>();
    private List<Grades> gradesList = new ArrayList<>();
    private HorizontalLayout buttonLayout = new HorizontalLayout();
    private TextField filterText = new TextField("Search...");
    private Button clear = new Button("Clear");

    public CsvReader() {
        String filePath = "G:\\All ADVANCE JAVA\\CSVREADERDEMO\\src\\main\\java\\csv\\demo\\grades.csv";
        readFromCsv(filePath);

        filterText.setPlaceholder("filter by name...");
        filterText.addValueChangeListener(e -> updateList());
        filterText.setValueChangeMode(ValueChangeMode.EAGER);

        buttonLayout.add(filterText,clear);
        add(buttonLayout, grid);
        grid.setColumns("firstName","lastName","ssn","test1","test2","test3","test4","finalGrade","grade");
        grid.setItems(gradesList);

        clear.addClickListener(e -> filterText.clear());

    }

    private void updateList() {
        grid.setItems(gradesList.stream().filter(s -> s.getFirstName().contains(filterText.getValue())));
    }


    public List<Grades> readFromCsv(String filePath) {
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));

            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(", ");

                if (fields.length > 0) {
                    Grades grades = new Grades();
                    grades.setFirstName(fields[0]);
                    grades.setLastName(fields[1]);
                    grades.setSsn(fields[2]);
                    grades.setTest1(Double.parseDouble(fields[3]));
                    grades.setTest2(Double.parseDouble(fields[4]));
                    grades.setTest3(Double.parseDouble(fields[5]));
                    grades.setTest4(Double.parseDouble(fields[6]));
                    grades.setFinalGrade(Double.parseDouble(fields[7]));
                    grades.setGrade(fields[7]);

                    gradesList.add(grades);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return gradesList;
    }
}