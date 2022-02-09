package Classes.models;
import  Classes.models.*;
import java.util.*;

/**
 * 
 */
public class Class {

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }

    public Set<Parent> getParents() {
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public HashMap<Double, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Double, Integer> grades) {
        this.grades = grades;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * Default constructor
     */
    public Class() {
    }

    /**
     * 
     */
    public HashMap<Double,Integer> grades;

    /**
     * 
     */
    public Subject subject;

    /**
     * 
     */
    public Set<Student> student;
    public Set<Parent> parents;
    /**
     * 
     */
    public Teacher teacher;

    /**
     *

    /**
     * @param studentID 
     * @return
     */
    public int getGrade(double studentID) {

        return grades.get(studentID);
    }

    /**
     * @param studentID 
     * @param grade 
     * @return
     */
    public void setGrade(double studentID, int grade) {
if(grades==null){
    grades = new HashMap<>();
}
       grades.put(studentID,grade);
    }

    /**
     * @return
     */
    public String getSubjectID() {

        return subject.subjectID;
    }

    /**
     * @param subjectID 
     * @return
     */
    public void setSubjectID(String subjectID) {
        subject.subjectID = subjectID;
    }

    /**
     * @return
     */
    public String getSubjectName() {

        return subject.subjectName;
    }

    /**
     * @param subjectName 
     * @return
     */
    public void setSubjectName(String subjectName) {

        subject.subjectName=subjectName;
    }

}