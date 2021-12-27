package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.BookTicketPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import PageObjects.Railway.RegisterPage;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.print.Book;

public class TC14 extends TestBase {
    @Test
    public void TC14(){
        System.out.println("TC14 - User can book many tickets at a time");
        HomePage homePage = new HomePage();
        BookTicketPage bookTicketPage = new BookTicketPage();
        homePage.open();

        homePage.gotoLoginPage();
        LoginPage loginPage = new LoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD).gotoBookTicketPage();
        bookTicketPage.bookTicket(Constant.DEPART_DATE,Constant.DEPART_FROM, Constant.ARRIVE_AT,Constant.SEAT_TYPE,Constant.TICKET_AMOUNT);

        String actualMsg = bookTicketPage.getSuccessMessage();
        String expectedMsg = "Ticket booked successfully!";
        String actualDepartDate = "";
        String expectedDepartDate = Constant.DEPART_DATE;

        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected.");

    }
}
