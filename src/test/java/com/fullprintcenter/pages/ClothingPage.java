package com.fullprintcenter.pages;


import com.fullprintcenter.utilities.BrowserUtils;
import com.fullprintcenter.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class ClothingPage extends BasePage {

    private WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(3));

    public void goToClothingPages() {
        for (int i = 1; i <38 ; i++) {
            Driver.get().get("https://fullprintcenter.com/collections/clothing?page="+i);
            verifyProductsOnCurrentPage(i);
        }
    }

    public void verifyProductsOnCurrentPage(int pageNumber) {
        for (int i = 1; i < 21; i++) {
            String expectedProductTitle="";
            String actualProductTitle="";
            try {
                WebElement product = Driver.get().findElement(By.xpath(
                        "(//a[@class='product-card__heading'])["+i+"]"));
                wait.until(webDriver -> product.isDisplayed());
                expectedProductTitle= BrowserUtils.getElementText(product).toLowerCase().trim();
                System.out.println("expectedProductTitle =" + expectedProductTitle);
                WebElement productLink = Driver.get().findElement(By.xpath(
                        "(//div[@class='mt5']//a)["+i+"]"));
                productLink.click();
                WebElement text=Driver.get().findElement(By.cssSelector(".product__title"));
                wait.until(webDriver -> text.isDisplayed());
                actualProductTitle=BrowserUtils.getElementText(text).toLowerCase().trim();
                System.out.println("actualProductTitle =" + actualProductTitle);
                assertEquals(expectedProductTitle,actualProductTitle);
                WebElement closeBtn = Driver.get().findElement(By.id("ModalClose-8702053548197"));
                closeBtn.click();
            } catch (Exception e) {
                System.out.println("Page Number: "+pageNumber+", expectedProductTitle ="+i+" =" + expectedProductTitle);
            }
        }
    }
}

