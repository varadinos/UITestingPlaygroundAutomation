package com.varadinov.testing.tests;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.varadinov.testing.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void testTitleText() {
        HomePage homePage = new HomePage(driver);
        //Expected title
        String expectedTitle = "UI Test Automation\n" +
                "Playground";

        //Get actual title
        String actualTitle = homePage.getTitleText();

        //Verify if actual title matches expected title
        Assert.assertEquals(actualTitle, expectedTitle, "Title text did not match the expected title!");
    }

}
