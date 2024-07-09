package com.fullprintcenter.tests.categories.clothing;

import com.fullprintcenter.pages.LoginPage;
import com.fullprintcenter.tests.TestBase;
import com.fullprintcenter.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Clothing_Test extends TestBase {

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    LoginPage loginPage = new LoginPage();

    @Test
    public void test1(){



        extentLogger = report.createTest("Clothing Test 1");

        extentLogger.info("go to "+ ConfigurationReader.get("url")+" web page");
        driver.get(ConfigurationReader.get("url"));
        //extentLogger.info("log in with "+ConfigurationReader.get("email")+" credential");
        //loginPage.clickLoginButton();
        //loginPage.login(ConfigurationReader.get("email"), ConfigurationReader.get("password"));
        //extentLogger.info("Verify that login is successful");
        //loginPage.verifyLogin();
        extentLogger.info("Navigate to 'Clothing' category");
        loginPage.navigateToVerticalMenu("Clothing");

    }
}
