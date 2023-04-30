package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    private By _FirstName= By.id("FirstName");
    private By _Lastname= By.id("LastName");
    private By _Email = By.id("Email");
    private By _Password =By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");

    public void filldetailsforregistration(){
        //Type First Name
        typeText(_FirstName, "TestFirstname");
        //Type Last name
        typeText(_Lastname, "TestLastName");
        //Type Email address
        typeText(_Email, "Testmail+" + timestamp() + "@gmail.com");
        //Type password
        typeText(By.id("Password"), "Test1234");
        //Type confirm password
        typeText(By.id("ConfirmPassword"), "Test1234");
        //click on register submit button
        clickOnElement(By.name("register-button"));
    }
}
