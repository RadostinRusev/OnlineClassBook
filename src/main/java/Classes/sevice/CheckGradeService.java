package Classes.sevice;

import Classes.models.Class;
import Classes.models.Parent;
import Classes.models.Student;

import java.lang.reflect.Type;
import java.util.*;

public class CheckGradeService {

    private static List<Student> usersDb = Collections.singletonList(new Student("Ivan","parola","ivan@abv.bg",12222d,null));
    private static HashMap<Double,List<Integer>> grades;
    private static List<Integer> temp = new ArrayList<>();
    private static int grade = 3;

    public static String Check(Parent parent, Class sas,String lista) {
        Double studentID= parent.getStudentID();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(lista.split(",")));
        ArrayList<Integer> integers = new ArrayList<>();
        for (String s : list) {
            integers.add(Integer.parseInt(s));
        }

        final boolean isUserExists = usersDb.stream()
                .anyMatch(u -> u.getStudentID()==studentID);
        if(isUserExists){
        if(integers.size()>10){
            return "too much grades";
        }
            return "success";
        }

        return "failed";
    }



}

