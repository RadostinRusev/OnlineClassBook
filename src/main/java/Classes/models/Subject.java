package Classes.models;

import java.util.*;

/**
 * 
 */
public class Subject {

    /**
     * Default constructor
     */
    public Subject() {
    }

    /**
     * 
     */
    public String subjectID;

    /**
     * 
     */
    public String subjectName;



    /**
     * @return
     */
    public String getsubjectID() {
        return this.subjectID;
    }

    /**
     * @param subjectID 
     * @return
     */
    public void setsubjectID(String subjectID) {
        this.subjectID=subjectID;
    }

    /**
     * @return
     */
    public String getsubjectName() {
        return this.subjectName;
    }

    /**
     * @param subjectName
     * @return
     */
    public void setsubjectName(String subjectName) {
        this.subjectName=subjectName;
    }

}