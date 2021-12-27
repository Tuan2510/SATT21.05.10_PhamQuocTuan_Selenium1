package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11 extends TestBase{
    @Test
    public void TC11(){
        System.out.println("TC11 - User can't create account while password and PID fields are empty");
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();

        homePage.open();
        homePage.gotoRegisterPage();
        registerPage.register(Constant.USERNAME, Constant.BLANK_PASSWORD,Constant.BLANK_PASSWORD,Constant.BLANK_PID);

        String actualMsg = registerPage.getMessageError();
        String expectedMsg = "There're errors in the form. Please correct the errors and try again.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
    }
}
