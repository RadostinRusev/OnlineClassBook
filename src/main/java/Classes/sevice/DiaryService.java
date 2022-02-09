package Classes.sevice;

import Classes.models.Class;
import Classes.models.Parent;
import Classes.models.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DiaryService {
    private static List<Student> usersDb = Collections.singletonList(new Student("Ivan","parola","ivan@abv.bg",12222d,null));
    private static HashMap<Double,Integer> grades ;

    public static String Put(int mark, double studentID) {
        if(2>mark || 6<mark){
            return "invalid mark";
        }

        final boolean isUserExists = usersDb.stream()
                .anyMatch(u -> u.getStudentID()==studentID);
        if(!isUserExists){
            return "invalid studentID";
        }
        return "success";
    }


}
