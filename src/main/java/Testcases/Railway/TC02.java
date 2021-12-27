package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends TestBase{
    @Test
    public void TC02(){
        System.out.println("TC02 - User can't login with blank \"Username\" textbox");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.BLANK_USERNAME, Constant.PASSWORD);

        String actualMsg = loginPage.getLoginErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
    }
}
