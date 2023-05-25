package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.step.TaskAcction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class FormValidationDefinition {

    private String user;
    private String password;

    private String required;

    private String url;

    private String email;

    private String pass;

    private String conPass;

    private String minimum;
    private String number;
    private String ip;
    private String date1;
    private String date2;


    @Steps
    TaskAcction taskAcction;

    @Given("i enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }


    @When("i proceded with my authentication")
    public void iProcededWithMyAuthentication() {
        try{
            taskAcction.openPage();
            taskAcction.singIn(user,password);

        }catch (NullPointerException ex){
            System.out.println("NUllField");
        }
    }

    @And("go to the main view of the page")
    public void goToTheMainViewOfThePage() {
        try{
            taskAcction.comprobateInsert();
        }catch (NullPointerException ex){
            System.out.println("No botton");
        }
    }

    @And("enter submenu form validations")
    public void enterSubmenuFormValidations() {
        try{
            taskAcction.goToSubmenu();
        }catch (NullPointerException ex){
            System.out.println("NullBotton");
        }
    }

    @And("check the title of form on the screen")
    public void checkTheTitleOfFormOnTheScreen() {
        try{
            taskAcction.titleSpecific();
        }catch (NullPointerException ex){
            System.out.println("NullBottom");
        }
    }

    @And("fill all fields")
    public void fillAllFields(io.cucumber.datatable.DataTable dataTable) {
        required = dataTable.cell(1,0);
        url= dataTable.cell(1,3);
        email= dataTable.cell(1,4);
        pass= dataTable.cell(1,6);
        conPass= dataTable.cell(1,6);
        minimum= dataTable.cell(1,7);
        number= dataTable.cell(1,9);
        ip= dataTable.cell(1,10);
        date1= dataTable.cell(1,11);
        date2= dataTable.cell(1,12);
        taskAcction.fieldAllFields(required,url,email,pass,conPass,minimum,number,ip,date1,date2);
    }

    @And("clic button validate")
    public void clicButtonValidate() throws InterruptedException {

        try {
            taskAcction.Validation();
        }catch (NullPointerException ex){
            System.out.println("NullBotton");
        }

        Thread.sleep(2000);

    }

    @Then("file required will be empty")
    public void fileRequiredWillBeEmpty()  {
        assert(taskAcction.ConfirmValidation());

    }
}
