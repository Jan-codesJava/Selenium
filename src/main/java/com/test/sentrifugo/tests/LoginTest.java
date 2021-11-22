package com.test.sentrifugo.tests;

import com.test.sentrifugo.TestBase;
import com.test.sentrifugo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validateSuperAdmin(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("EM01", "sentifugo");
    Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");

    }


    @Test
    public void validateManagement(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("EM02", "sentifugo");
        Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");
    }

    @Test
    public void validateManager(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("EM03", "sentifugo");
        Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");

    }
}
