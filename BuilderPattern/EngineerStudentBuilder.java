package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> list = new ArrayList<>();
        list.add("DSA");
        list.add("ML");
        list.add("AI");
        this.subjects = list;
        return this;
    }
}
