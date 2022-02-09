package Classes.test.model;

import Classes.models.Student;
import Classes.sevice.DiaryService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiaryModel {

    int grade;
    double studentID;
    String message;


    public void  Input(){
   message= DiaryService.Put(this.grade,this.studentID);
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


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}


