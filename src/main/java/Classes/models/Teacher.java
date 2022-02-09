package Classes.models;

import java.util.*;

/**
 * 
 */
public class Teacher extends User {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    /**
     * 
     */
    public double teacherID;

    /**
     * 
     */
    public Class classStudents;

    /**
     * 
     */
    public Subject subject;

    /**
     * @return
     */
    public double getTeacherID() {
        return  teacherID;
    }

    /**
     * @param teacherID 
     * @return
     */
    public void setTeacherID(double teacherID) {
        this.teacherID = teacherID;
    }

    /**
     * @return
     */
    public String getSubject() {
        return subject.subjectName;
    }

    /**
     * @param subject 
     * @return
     */
    public void setSubject(String subject) {
        this.subject.subjectName=subject;
    }

}