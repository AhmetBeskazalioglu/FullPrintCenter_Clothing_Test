package com.fullprintcenter.pages;

import com.fullprintcenter.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='header__icons__customer']/a[contains(.,'Log in')]")
    private WebElement loginButton;

    public void clickLoginButton() {
        loginButton.click();
    }
}
