package com.varadinov.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By webSiteTitle = By.id("title");
    private final By dynamicIdPageLink = By.xpath("//a[@href='/dynamicid']");
    private final By classAttributePageLink = By.xpath("a[href='/classattr']");
    private final By hiddenLayersPageLink = By.xpath("a[href='/hiddenlayers']");

    public void navitgateToPage (By locator){
        driver.findElement(locator).click();
    }

    public String getTitleText() {
        return driver.findElement(webSiteTitle).getText();
    }

    // Method to navigate to the DynamicIDPage
    public DynamicIDPage navigateToDynamicIDPage() {
        click(dynamicIdPageLink);  // Click the link or button
        return new DynamicIDPage(driver);  // Return an instance of the next page
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
