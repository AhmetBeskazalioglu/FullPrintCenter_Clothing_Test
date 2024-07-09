package com.fullprintcenter.clothing.pages;

import com.fullprintcenter.clothing.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
