package csv.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Grades {
    private String firstName;
    private String lastName;
    private String ssn;
    private double test1;
    private double test2;
    private double test3;
    private double test4;
    private double finalGrade;
    private String grade;
}
