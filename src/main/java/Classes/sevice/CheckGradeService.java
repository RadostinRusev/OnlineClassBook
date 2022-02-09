package Classes.sevice;

import Classes.models.Class;
import Classes.models.Parent;
import Classes.models.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CheckGradeService {

    private static List<Student> usersDb = Collections.singletonList(new Student("Ivan","parola","ivan@abv.bg",12222d,null));
    private static HashMap<Double,Integer> grades;
    public static String Check(Parent parent, Class sas) {
        Double studentID= parent.getStudentID();
        grades= sas.getGrades();
        if(grades.get(studentID)!=null){
            return "success";
        }

        return "failed";
    }
}

