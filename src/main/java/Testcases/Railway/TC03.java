package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 extends TestBase{
    @Test
    public void TC03(){
        System.out.println("TC03 - User cannot log into Railway with invalid password ");
        HomePage homePage = new HomePage();
        homePage.open();

        LoginPage loginPage = new LoginPage();
        loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD);
        String actualMsg = loginPage.getLoginErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
    }
}
