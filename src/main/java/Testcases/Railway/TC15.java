package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15 extends TestBase{
    @Test
    public void TC15(){
        System.out.println("TC15 - \"Ticket price\" page displays with ticket details after clicking on \"check price\" link in \"Train timetable\" page");
        HomePage homePage = new HomePage();

        homePage.open();
        homePage.gotoTimeTable();


        String actualMsg = "";
        String expectedMsg = "Welcome " + Constant.USERNAME;

        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected.");
    }
}
