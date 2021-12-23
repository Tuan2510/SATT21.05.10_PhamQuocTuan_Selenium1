package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05 extends TestBase{
    @Test
    public void TC05(){
        System.out.println("TC05 - System shows message when user enters wrong password several times ");
        HomePage homePage = new HomePage();
        homePage.open();

        LoginPage loginPage = new LoginPage();
        loginPage.logins(Constant.USERNAME, Constant.INVALID_PASSWORD,4);
        String actualMsg = loginPage.getLoginErrorMsg();
        String expectedMsg = "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
    }
}
