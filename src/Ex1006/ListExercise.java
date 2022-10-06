package Ex1006;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;// = new ArrayList<>();

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김경록");
    }
    public List<String> getStudents(){
        return students;

    }
}
