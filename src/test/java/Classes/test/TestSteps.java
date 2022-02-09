package Classes.test;

import Classes.models.Class;
import Classes.models.Parent;
import Classes.models.Student;
import Classes.sevice.ParentService;
import Classes.test.model.CheckGradeModel;
import Classes.test.model.DiaryModel;
import Classes.test.model.RegisterModel;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestSteps {

    private static List<Student> usersDb = Collections.singletonList(new Student("Ivan","parola","ivan@abv.bg",12222d,null));


    RegisterModel registerModel;
    DiaryModel diaryModel;
    CheckGradeModel checkGradeModel;
    @Given("^Open Parent register screen$")
    public void open_Parent_register_screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerModel= new RegisterModel();
    }

    @When("^Въведе валидно потребителско име: \"([^\"]*)\"$")
    public void InputName(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerModel.setUsername(username);
    }

    @When("^въведе валидна потребителска парола: \"([^\"]*)\"$")
    public void InputPassowrd(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerModel.setPassword(password);
    }

    @When("^Въведе elektronna poshta : \"([^\"]*)\"$")
    public void InputEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       registerModel.setEmail(email);
    }

    @When("^Въведе telefonen nomer : \"([^\"]*)\"$")
    public void InputNumber(String number) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerModel.setNumber(number);
    }

    @When("^Въведе studentsko id : \"([^\"]*)\"$")
    public void InputStudentID(String studentid) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       registerModel.setStudentID(Double.parseDouble(studentid));
    }

    @When("^натисне бутона за вход в системата$")
    public void PressRegisterButton() throws Throwable {
        registerModel.clickRegisterButton();
    }

    @Then("^Вижда съобщение за: \"([^\"]*)\"\\.$")
    public void SeeMessage(String expectedMessage) throws Throwable {
      //  registerModel.getMessage().equals(message);
        assertEquals(expectedMessage,registerModel.getMessage());
    }

    @Given("^Open Online dairy$")
    public void open_Online_dairy() throws Throwable {
        diaryModel = new DiaryModel();
    }

    @When("^въведе валидна ocenka: \"([^\"]*)\"$")
    public void InputGrade(String arg1) throws Throwable {
        diaryModel.setMark(Integer.parseInt(arg1));
    }

    @When("^Въведе валидно студенско ид име: \"([^\"]*)\"$")
    public void InputStudentIDValid(String arg1) throws Throwable {
        diaryModel.setStudentID(Double.parseDouble(arg1));
    }
    @When("^натисне бутона за вход в системата ocenka$")
    public void PressLoginButton() throws Throwable {
        diaryModel.Input();
    }



    @Then("^Вижда съобщение за ocenka: \"([^\"]*)\"\\.$")
    public void SeetMessage(String arg1) throws Throwable {
        assertEquals(diaryModel.getMessage(),arg1);
    }


    @Given("^Open Check screen$")
    public void open_Check_screen() throws Throwable {
       checkGradeModel = new CheckGradeModel();
    }

    @When("^Въведе валидно потребителско име: \"([^\"]*)\" za check$")
    public void InputValidUsername(String username) throws Throwable {
     checkGradeModel.getParent().setUsername(username);
    }

    @When("^въведе валидна потребителска парола: \"([^\"]*)\" za check$")
    public void InputValidPassowrd(String password) throws Throwable {
        checkGradeModel.getParent().setPassowrd(password);
    }

    @When("^Въведе telefonen nomer : \"([^\"]*)\" za check$")
    public void InputTelefoneNumber(String numer) throws Throwable {

        checkGradeModel.getParent().setNumber(numer);
    }

    @When("^Въведе studentsko id : \"([^\"]*)\" za check$")
    public void въведе_studentsko_id_za_check(String studentID) throws Throwable {
        checkGradeModel.getParent().setStudentID(Double.parseDouble(studentID));
    }

    @When("^Mockvane na ocenka : \"([^\"]*)\" , \"([^\"]*)\"$")
    public void mockvane_na_ocenka(String studentID, String grade) throws Throwable {
        checkGradeModel.getClasses().setGrade(Double.parseDouble(studentID),Integer.parseInt(grade));
    }



    @When("^натисне бутона за вход в системата za check$")
    public void натисне_бутона_за_вход_в_системата_za_check() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        checkGradeModel.Checkgrade();
    }

    @Then("^Вижда съобщение за: \"([^\"]*)\"\\. za check$")
    public void вижда_съобщение_за_za_check(String arg1) throws Throwable {
       assertEquals(checkGradeModel.getMessage(),arg1);
    }


}
