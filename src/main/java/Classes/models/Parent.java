package Classes.models;

import java.util.*;

/**
 * 
 */
public class Parent extends User {

    /**
     * Default constructor
     */


    /**
     * 
     */
    public double StudentID;

    /**
     * 
     */
    public String number;

    public Parent(String username, String password, String email, double studentID, String number) {
        super(username, password, email);
        StudentID = studentID;
        this.number = number;
    }

    public Parent() {
    }

    /**
     * 
     */

    /**
     * @return
     */
    public double getStudentID() {

        return StudentID;
    }

    /**
     * @param studentID 
     * @return
     */
    public void setStudentID(double studentID) {
        this.StudentID = studentID;
    }

    /**
     * @return
     */
    public Student getStudent() {

        return null;
    }

    /**
     * @param student 
     * @return
     */
    public void setStudent(Student student) {

    }

    /**
     * @return
     */
    public String getNumber() {
       return this.number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(String number) {
        this.number = number;
    }

}