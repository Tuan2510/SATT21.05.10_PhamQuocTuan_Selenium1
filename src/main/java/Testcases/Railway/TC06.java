package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.GeneralPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06 extends TestBase{
    @Test
    public void TC06(){
        System.out.println("TC06 - User is redirected to Home page after logging out ");
        HomePage homePage = new HomePage();
        homePage.open();
        //login
        LoginPage loginPage = new LoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        //logout
        GeneralPage generalPage = new GeneralPage();
        generalPage.loggingOut();
        //get title
        String actualMsg = generalPage.getPageTitle();
        String expectedMsg = "Welcome to Safe Railway";

        Assert.assertEquals(actualMsg, expectedMsg, "Error that user cannot logging out.");
    }
}
