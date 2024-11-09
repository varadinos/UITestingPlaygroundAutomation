package com.varadinov.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicIDPage extends BasePage{

    private final By dynamicIDButton = By.cssSelector(".btn.btn-primary");

    public DynamicIDPage(WebDriver driver) {
        super(driver);
    }

    public void clickDynamicIDButton() {
        click(dynamicIDButton);
    }
}
