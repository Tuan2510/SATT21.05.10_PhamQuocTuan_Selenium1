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
        LoginPage loginPage = new LoginPage();

        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        homePage.loggingOut();

        String actualMsg = homePage.getPageTitle();
        String expectedMsg = Constant.HOME_PAGE_TITLE;

        Assert.assertFalse(homePage.isDisplayedTabLogout(),"Tab Logout is not disappear after logging out");
        Assert.assertEquals(actualMsg, expectedMsg, "Error that user cannot logging out.");
    }
}
