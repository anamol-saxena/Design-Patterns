package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> list = new ArrayList<>();
        list.add("Finance");
        list.add("Operations");
        list.add("HR");
        this.subjects = list;
        return this;
    }
}
