package com.fullprintcenter.pages;

import com.fullprintcenter.utilities.BrowserUtils;
import com.fullprintcenter.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='header__icons__customer']/a[contains(.,'Log in')]")
    private WebElement loginButton;

    @FindBy(xpath = "//span[.='SHOP BY']")
    private WebElement shopBy;

    @FindBy(xpath = "//ul[@class='vertical-menu__items unstyle-ul']//span[.='Clothing']")
    private WebElement clothingButton;

    public void clickLoginButton() {
        loginButton.click();
    }

    public void navigateToVerticalMenu(String menu) {
        try {
            shopBy.click();
            WebElement menuButton = Driver.get().findElement(By.xpath(
                    "//ul[@class='vertical-menu__items unstyle-ul']//span[.='" + menu + "']"));
            menuButton.click();
        } catch (Exception e) {
            WebElement menuButton = Driver.get().findElement(By.xpath(
                    "//ul[@class='vertical-menu__items unstyle-ul']//span[.='" + menu + "']"));
            menuButton.click();
        }
    }
}
