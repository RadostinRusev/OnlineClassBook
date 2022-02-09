package Classes.sevice;

import Classes.models.Class;
import Classes.models.Parent;
import Classes.models.Student;

import java.util.*;

public class CheckGradeService {

    private static List<Student> usersDb = Collections.singletonList(new Student("Ivan","parola","ivan@abv.bg",12222d,null));
    private static HashMap<Double,List<Integer>> grades;
    private static List<Integer> temp = new ArrayList<>();
    public static String Check(Parent parent, Class sas) {
        Double studentID= parent.getStudentID();

        grades= sas.getGrades();
        if(grades.get(studentID)!=null){
            return "success";
        }

        return "failed";
    }

}

