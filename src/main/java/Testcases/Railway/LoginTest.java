package Testcases.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
//    @Test
//    public void TC01(){
//        System.out.println("TC01 - User can log into Railway with valid username and password");
//        HomePage homePage = new HomePage();
//        homePage.open();
//
//        LoginPage loginPage = new LoginPage();
//        String actualMsg = loginPage.login(Constant.USERNAME, Constant.PASSWORD).getWelcomeMessage();
//        String expectedMsg = "Welcome " + Constant.USERNAME;
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected.");
//    }
//
//    @Test
//    public void TC02(){
//        System.out.println("TC02 - User can't login with blank \"Username\" textbox");
//        HomePage homePage = new HomePage();
//        homePage.open();
//
//        LoginPage loginPage = new LoginPage();
//        String actualMsg = loginPage.getLoginErrorMsg(Constant.BLANK_USERNAME, Constant.PASSWORD);
//        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
//    }
//
//    @Test
//    public void TC03(){
//        System.out.println("TC03 - User cannot log into Railway with invalid password ");
//        HomePage homePage = new HomePage();
//        homePage.open();
//
//        LoginPage loginPage = new LoginPage();
//        String actualMsg = loginPage.getLoginErrorMsg(Constant.USERNAME, Constant.INVALID_PASSWORD);
//        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
//    }

//    @Test
//    public void TC04(){
//        System.out.println("TC04 - User is redirected to Book ticket page after logging in ");
//        HomePage homePage = new HomePage();
//        homePage.open();
//
//        LoginPage loginPage = new LoginPage();
//        String actualMsg = loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD).getLoginErrorMsg();
//        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
//    }

//    @Test
//    public void TC05(){
//        System.out.println("TC05 - System shows message when user enters wrong password several times ");
//        HomePage homePage = new HomePage();
//        homePage.open();
//
//        LoginPage loginPage = new LoginPage();
//        loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD);
//        loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD);
//        loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD);
//        String actualMsg = loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD).getLoginErrorMsg();
//        String expectedMsg = "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
//    }

//    @Test
//    public void TC06(){
//        System.out.println("TC06 - User is redirected to Home page after logging out ");
//        HomePage homePage = new HomePage();
//        homePage.open();
//
//        LoginPage loginPage = new LoginPage();
//        loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD);
//
//        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
//    }
}
