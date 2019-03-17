package csv.demo;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

import java.io.BufferedReader;
import java.io.File;
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
    private Button clear = new Button("Clear",new Icon(VaadinIcon.CLOSE_CIRCLE));

    public CsvReader() {

        readFromCsv();

        filterText.setPlaceholder("filter by First Name...");
        filterText.addValueChangeListener(e -> updateList());
        filterText.setValueChangeMode(ValueChangeMode.EAGER);

        buttonLayout.add(filterText,clear);
        buttonLayout.setVerticalComponentAlignment(Alignment.END,clear);
        add(buttonLayout, grid);

        double averageOfFinalGrade = Math.round(gradesList.stream()
                .mapToDouble(Grades::getFinalGrade).average().orElse(0.0));

        grid.addColumn(Grades::getFirstName).setHeader("First Name").setFooter("Total Students: " + gradesList.size());
        grid.addColumn(Grades::getLastName).setHeader("Last Name");
        grid.addColumn(Grades::getSsn).setHeader("Serial No");
        grid.addColumn(Grades::getTest1).setHeader("Test 1");
        grid.addColumn(Grades::getTest2).setHeader("Test 2");
        grid.addColumn(Grades::getTest3).setHeader("Test 3");
        grid.addColumn(Grades::getTest4).setHeader("Test 4");
        grid.addColumn(Grades::getFinalGrade).setHeader("FinalGrade").setFooter("Average: " + averageOfFinalGrade);
        grid.addColumn(Grades::getGrade).setHeader("Total Grade");
        grid.setItems(gradesList);

        clear.addClickListener(e -> filterText.clear());

        grid.addThemeVariants(GridVariant.LUMO_WRAP_CELL_CONTENT,
                GridVariant.MATERIAL_COLUMN_DIVIDERS, GridVariant.LUMO_ROW_STRIPES);

    }

    private void updateList() {
        grid.setItems(gradesList.stream().filter(s -> s.getFirstName().toLowerCase()
                .contains(filterText.getValue().toLowerCase())));
    }


    public List<Grades> readFromCsv() {
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(
                    new File("src/main/resources/grades.csv").getAbsoluteFile()));

            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(", ");

                if (fields.length > 0) {
                    Grades grades = new Grades();
                    grades.setFirstName(fields[0].replace(Character.toString('"'),""));
                    grades.setLastName(fields[1].replace(Character.toString('"'),""));
                    grades.setSsn(fields[2].replace(Character.toString('"'),""));
                    grades.setTest1(Double.parseDouble(fields[3]));
                    grades.setTest2(Double.parseDouble(fields[4]));
                    grades.setTest3(Double.parseDouble(fields[5]));
                    grades.setTest4(Double.parseDouble(fields[6]));
                    grades.setFinalGrade(Double.parseDouble(fields[7]));
                    grades.setGrade(fields[8].replace(Character.toString('"'),""));

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