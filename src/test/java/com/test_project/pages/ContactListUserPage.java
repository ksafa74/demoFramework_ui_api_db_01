package com.test_project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactListUserPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"logout\"]")
    public WebElement logoutButton;
}
