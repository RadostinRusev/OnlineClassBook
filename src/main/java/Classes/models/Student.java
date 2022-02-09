package Classes.models;

import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    public Double StudentID;

    /**
     * 
     */
    public Set<Class> classStudents;

    public Student(String username, String password, String email, Double studentID, Set<Class> classStudents) {
        super(username, password, email);
        StudentID = studentID;
        this.classStudents = classStudents;
    }


    /**
     * @return
     */
    public double getStudentID() {
        return this.StudentID;
    }

    /**
     * @param studentID 
     * @return
     */
    public void setStudentID(double studentID) {
        this.StudentID=studentID;
    }

}