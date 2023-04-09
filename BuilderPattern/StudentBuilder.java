package BuilderPattern;

import java.time.LocalDate;
import java.util.List;

public abstract class StudentBuilder {

    int rollNo;
    String name;
    LocalDate dob;
    List<String> subjects;

    public StudentBuilder setRollNo (int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName (String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setDob (LocalDate date) {
        this.dob = date;
        return this;
    }
    abstract public StudentBuilder setSubjects ();

    public Student build () {
        return new Student(this);
    }
}
