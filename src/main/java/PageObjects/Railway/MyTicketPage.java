package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTicketPage {
    //locators
    private final By btnCancelTicket = By.xpath("//input[@value='Cancel']");

    //elements
    protected WebElement getBtnCancelTicket(){
        return Constant.WEBDRIVER.findElement(btnCancelTicket);
    }

    //methods
    public void clickCancelButton(){
        this.getBtnCancelTicket().click();
    }

    public void clickOKAlert(){
        Alert al = Constant.WEBDRIVER.switchTo().alert();
        al.accept();
    }
}
