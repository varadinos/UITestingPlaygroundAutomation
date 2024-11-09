package com.varadinov.testing.tests;

import com.varadinov.testing.pages.DynamicIDPage;
import com.varadinov.testing.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicIDTest extends BaseTest {

    @Test
    public void testDynamicIDButtonClick() {
        HomePage homePage = new HomePage(driver);
        DynamicIDPage dynamicIDPage = homePage.navigateToDynamicIDPage();
        dynamicIDPage.clickDynamicIDButton();
    }




}
