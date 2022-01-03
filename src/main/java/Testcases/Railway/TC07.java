package Testcases.Railway;

import Common.Constant.Constant;
import Common.Utils.Utils;
import PageObjects.Railway.GeneralPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 extends TestBase{
    @Test
    public void TC07(){
        System.out.println("TC07 - User can create new account");
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        Utils utils = new Utils();

        homePage.open();
        homePage.gotoRegisterPage();
        registerPage.register(utils.randomEmailAddressByTime(),Constant.PASSWORD2,Constant.PASSWORD2,Constant.PID);

        String actualMsg = registerPage.getMessage();
        String expectedMsg = "Thank you for registering your account.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error that user cannot register an account.");
    }
}
