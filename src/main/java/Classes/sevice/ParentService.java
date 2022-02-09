package Classes.sevice;

import Classes.models.Parent;
import Classes.models.Student;

import java.util.Collections;
import java.util.List;

public class ParentService {
    private static List<Parent> ParentsDB = Collections.singletonList(new Parent("Petur", "parola", "petur@abv.bg", 12222d, "08888888"));
    private static List<Student> usersDb = Collections.singletonList(new Student("Ivan","parola","ivan@abv.bg",12222d,null));

    public static String RegisterParentService(final String username, final String email,final Double studentID,final String number,final String password) {

        if ((null == password || password.isBlank()) || (null == username) || username.isBlank()) {
            return "invalid username or password";
        }
        if(null == email){
            return "Email invalid";
        }
        final boolean isUserExists = usersDb.stream()
                .anyMatch(u -> u.getStudentID()==studentID);
        if(!isUserExists){
            return "No such student";
        }
        if(number.length()!=10){
            return  "Invalid number";
        }

        return "Success";
    }
}
