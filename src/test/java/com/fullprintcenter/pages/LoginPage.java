package com.fullprintcenter.pages;

import com.fullprintcenter.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BasePage{

    @FindBy(id ="CustomerEmail")
    private WebElement emailInput;

    @FindBy(id ="CustomerPassword")
    private WebElement passwordInput;

    @FindBy(xpath ="//span[.='Sign in']")
    private WebElement signInButton;

    @FindBy(css = "h1")
    private WebElement accountPageText;



    public void login(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public void verifyLogin(){
        String expected = "Account";
        String actual = BrowserUtils.getElementText(accountPageText);
        assertEquals(actual,expected);
    }
}
