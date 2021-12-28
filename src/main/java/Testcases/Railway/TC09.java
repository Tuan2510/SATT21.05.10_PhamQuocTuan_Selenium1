package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.ChangePasswordPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends TestBase{
    @Test
    public void TC09(){
        System.out.println("TC09 - User can't change password when \"New Password\" and \"Confirm Password\" are different.");
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD).gotoChangePasswordPage();
        ChangePasswordPage changePasswordPage = new ChangePasswordPage();
        changePasswordPage.changePassword(Constant.PASSWORD,"a123:\"/{}!@$\\","b456:\"/{}!@$\\");

        String actualMsg = changePasswordPage.getMessageError();
        String expectedMsg = "Password change failed. Please correct the errors and try again.";
        String actualConfirmPasswordErrorMsg = changePasswordPage.getMessageError();
        String expectedConfirmPasswordErrorMsg = "The password confirmation does not match the new password.";

        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");
        Assert.assertEquals(actualConfirmPasswordErrorMsg, expectedConfirmPasswordErrorMsg, "Confirm error message is not displayed as expected.");
    }
}
