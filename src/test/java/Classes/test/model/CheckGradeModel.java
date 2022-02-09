package Classes.test.model;

import Classes.models.Class;
import Classes.models.Parent;
import Classes.sevice.DiaryService;

public class CheckGradeModel {

    private static Parent parent = new Parent();

    private static Class classes = new Class();

    String message;

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
        message= diaryService.Check(parent,classes);
    }
}
