package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10 extends TestBase{
    @Test
    public void TC10(){
        System.out.println("TC10 - User can't create account with an already in-use email");
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();

        homePage.open();
        homePage.gotoRegisterPage();
        registerPage.register(Constant.USERNAME, Constant.PASSWORD2,Constant.PASSWORD2,Constant.PID);

        String actualMsg = registerPage.getMessageError();
        String expectedMsg = "This email address is already in use.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
    }
}
