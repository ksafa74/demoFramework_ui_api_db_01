package com.test_project.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddUserPage extends BasePage {


    public static Map<String,String> newUserUI;

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
        newUserUI = new LinkedHashMap<>();

        newUserUI.put("name",new Faker().name().firstName());
        newUserUI.put("lastName",new Faker().name().lastName());
        newUserUI.put("emailAddress",new Faker().internet().emailAddress());
        newUserUI.put("password",new Faker().internet().password());

        new AddUserPage().firstNameField.sendKeys(newUserUI.get("name"));
        new AddUserPage().lastNameTextField.sendKeys(newUserUI.get("lastName"));
        new AddUserPage().emailTextField.sendKeys(newUserUI.get("emailAddress"));
        new AddUserPage().passwordTextField.sendKeys(newUserUI.get("password"));
        new AddUserPage().submitButton.click();


    }

}
