package com.test_project.steps;

import com.test_project.pages.AddUserPage;
import com.test_project.pages.ContactListLoginPage;
import com.test_project.pages.ContactListUserPage;
import com.test_project.utility.ConfigurationReader;
import com.test_project.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Ui_steps {

    @Given("Im on login page and I click on SignUp button")
    public void imOnLoginPageAndIClickOnSignUpButton() {
        new ContactListLoginPage().signUpButton.click();
    }

    @When("i pass random firstName,LastName,Email,password in textFields and hit submit")
    public void iPassRandomFirstNameLastNameEmailPasswordInTextFieldsAndHitSubmit() {
        AddUserPage.createUser();
    }

    @Then("i should see logout button")
    public void iShouldSeeLogoutButton() {
        Assert.assertTrue(new ContactListUserPage().logoutButton.isDisplayed());
        System.out.println("AddUserPage.newUserUI = " + AddUserPage.newUserUI);
    }



}
