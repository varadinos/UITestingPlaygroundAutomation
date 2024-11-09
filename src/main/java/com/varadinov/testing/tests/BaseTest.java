package com.varadinov.testing.tests;

import com.varadinov.testing.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    private WebDriverManager webDriverManager = new WebDriverManager();

    @BeforeMethod
    public void setUp() {
        driver = webDriverManager.initializeDriver();
        driver.get("http://uitestingplayground.com");
    }

    @AfterMethod
    public void tearDown() {
        webDriverManager.quitDriver();
    }


}
