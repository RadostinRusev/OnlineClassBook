package Classes.test.model;

import Classes.sevice.ParentService;

public class RegisterModel {
    private String username;
    private String password;
    private String message;
    private String email;
    private String number;
    private Double studentID;



    public void clickRegisterButton() {
        message = ParentService.RegisterParentService(username,email,studentID,number,password);

    }

    public String getMessage() {
        return message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getStudentID() {
        return studentID;
    }

    public void setStudentID(Double studentID) {
        this.studentID = studentID;
    }
}
