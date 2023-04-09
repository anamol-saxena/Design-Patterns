package BuilderPattern;

import java.time.LocalDate;
import java.util.List;

public class Student {

    private int rollNo;
    private String name;
    private LocalDate dob;
    private List<String> subjects;

    public Student (StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.dob = studentBuilder.dob;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString () {
        return "Student details : name - "+this.name+", roll no. - "+this.rollNo+" and subjects - "+this.subjects;
    }
}
