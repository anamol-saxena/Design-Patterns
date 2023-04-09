package BuilderPattern;

import java.time.LocalDate;

public class Department {

    public static void main(String[] args) {
        StudentBuilder studentEng = new EngineerStudentBuilder();
        StudentBuilder studentMba = new MBAStudentBuilder();

        Student s1 = studentEng.setName("eng1").setDob(LocalDate.now()).setRollNo(1).setSubjects().build();
        Student s2 = studentMba.setName("mba1").setSubjects().setDob(LocalDate.now()).setRollNo(2).build();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
