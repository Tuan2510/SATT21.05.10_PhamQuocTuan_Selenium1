package PageObjects.Railway;

import Common.Constant.Constant;
import Common.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimeTablePage extends GeneralPage{
    //locators
    private final By lnkCheckPrice = By.xpath("//table[@class='MyTable WideTable']//tr//td[text()='Đà Nẵng']//following-sibling::td[text()='Sài Gòn']//following-sibling::td//a[text()='check price']");

    //elements
    protected WebElement getLnkCheckPrice(){
        return Constant.WEBDRIVER.findElement(lnkCheckPrice);
    }

    //methods
    public void gotoTicketPrice(){
        try {
            WebElement linkCheckPrice = this.getLnkCheckPrice();
            Utils utils = new Utils();
            utils.scrollDownToElement(linkCheckPrice);
            linkCheckPrice.click();
        }catch (Exception e){
            System.out.println("Unable to get 'Check Price' link");
        }
    }

}
