package Classes.test.model;

import Classes.models.Student;
import Classes.sevice.DiaryService;

import java.util.Collections;
import java.util.List;

public class DiaryModel {

    int mark;
    double studentID;
    String message;


    public void  Input(){
   message= DiaryService.Put(this.mark,this.studentID);
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public double getStudentID() {
        return studentID;
    }

    public void setStudentID(double studentID) {
        this.studentID = studentID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


