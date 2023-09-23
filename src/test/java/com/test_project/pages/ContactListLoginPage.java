package com.test_project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactListLoginPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement loginTextField;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement passwordTextField;

    @FindBy (xpath = "//*[@id=\"submit\"]")
    public WebElement loginSubmitButton;

    @FindBy (xpath = "//*[@id=\"signup\"]")
    public WebElement signUpButton;

}
