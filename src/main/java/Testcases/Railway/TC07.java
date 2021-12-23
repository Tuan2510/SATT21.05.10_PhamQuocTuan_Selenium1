package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.GeneralPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 extends GeneralPage{
    @Test
    public void TC07(){
        System.out.println("TC07 - User can create new account");
        HomePage homePage = new HomePage();
        homePage.open();

        homePage.gotoRegisterPage();
        RegisterPage registerPage = new RegisterPage();
        registerPage.register("6@gmail.com",Constant.PASSWORD,Constant.PASSWORD,Constant.PID);

        String actualMsg = registerPage.getMessage();
        String expectedMsg = "Registration Confirmed! You can now log in to the site.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error that user cannot register an account.");
    }
}
