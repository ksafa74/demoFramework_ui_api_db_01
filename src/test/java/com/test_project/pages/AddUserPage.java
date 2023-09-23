package com.test_project.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class AddUserPage extends BasePage {

    public static String firstName;
    public static String lastName;
    public static String emailAddress;
    public static String password;


    @FindBy (id = "firstName")
    public WebElement firstNameField;

    @FindBy (id = "lastName")
    public WebElement lastNameTextField;

    @FindBy (id = "email")
    public WebElement emailTextField;

    @FindBy (id = "password")
    public WebElement passwordTextField;

    @FindBy (id = "submit")
    public WebElement submitButton;

    @FindBy (id = "cancel")
    public WebElement cancelButton;

    public static void createUser(){

        Map<String,String> newUser = new HashMap<>();
        newUser.put("name",new Faker().name().firstName());
        newUser.put("lastName",new Faker().name().lastName());
        newUser.put("emailAddress",new Faker().internet().emailAddress());
        newUser.put("password",new Faker().internet().password());

        new AddUserPage().firstNameField.sendKeys(newUser.get("name"));
        new AddUserPage().lastNameTextField.sendKeys(newUser.get("lastName"));
        new AddUserPage().emailTextField.sendKeys(newUser.get("emailAddress"));
        new AddUserPage().passwordTextField.sendKeys(newUser.get("password"));
        new AddUserPage().submitButton.click();

        firstName =newUser.get("name");
        lastName = newUser.get("lastName");
        emailAddress = newUser.get("emailAddress");
        password =newUser.get("password");
    }

}
