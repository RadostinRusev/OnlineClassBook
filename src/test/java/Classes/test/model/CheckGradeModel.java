package Classes.test.model;

import Classes.models.Class;
import Classes.models.Parent;
import Classes.sevice.CheckGradeService;
import Classes.sevice.DiaryService;
import cucumber.api.java.cs.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckGradeModel {

    private static Parent parent = new Parent();

    private static Class classes = new Class();

    private static String grade;

    String message;

    public static String getGrade() {
        return grade;
    }

    public static void setGrade(String grade) {
        CheckGradeModel.grade = grade;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Parent getParent() {
        return parent;
    }

    public static void setParent(Parent parent) {
        CheckGradeModel.parent = parent;
    }

    public static Class getClasses() {
        return classes;
    }

    public static void setClasses(Class classes) {
        CheckGradeModel.classes = classes;
    }

    public void Checkgrade(){
        DiaryService diaryService = new DiaryService();
        message= CheckGradeService.Check(parent,classes,grade);
    }
   /* public List<Integer> IntegerToList(Integer e){
        grade.add(e);
        return grade;
    }*/

}
