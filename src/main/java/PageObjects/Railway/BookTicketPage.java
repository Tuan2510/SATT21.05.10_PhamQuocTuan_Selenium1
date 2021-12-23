package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookTicketPage {
    //Locators

    //Elements

    //Methods
    public BookTicketPage open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
