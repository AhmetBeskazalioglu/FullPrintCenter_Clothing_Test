package com.fullprintcenter.tests.categories.clothing;

import com.fullprintcenter.tests.TestBase;
import com.fullprintcenter.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class Clothing_Test extends TestBase {

    @Test
    public void test1(){

        extentLogger = report.createTest("Clothing Test 1");

        extentLogger.info("go to "+ ConfigurationReader.get("url")+" web page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Verify that login is successful");


    }
}
