package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookTicketPage {
    //Locators
    private final By ddlDepartDate = By.xpath("//select[@name='Date']/option[@value='3']");
    private final By ddlDepartStation = By.xpath("//select[@name='DepartStation']/option[text()='Nha Trang']");
    private final By ddlArriveStation = By.xpath("//select[@name='ArriveStation']/option[text()='Sài Gòn']");
    private final By ddlSeatType = By.xpath("//select[@name='SeatType']/option[text()='Soft seat with air conditioner']");
    private final By ddlTicketAmount = By.xpath("//select[@name='TicketAmount']/option[text()='5']");
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookSuccessfully = By.xpath("//div/h1");

    //Elements
    protected WebElement getDdlDepartDate(){ return Constant.WEBDRIVER.findElement(ddlDepartDate); }
    protected WebElement getDdlDepartStation(){ return Constant.WEBDRIVER.findElement(ddlDepartStation); }
    protected WebElement getDdlArriveStation(){ return Constant.WEBDRIVER.findElement(ddlArriveStation); }
    protected WebElement getDdlSeatType(){ return Constant.WEBDRIVER.findElement(ddlSeatType); }
    protected WebElement getDdlTicketAmount(){ return Constant.WEBDRIVER.findElement(ddlTicketAmount); }
    protected WebElement getBtnBookTicket(){ return Constant.WEBDRIVER.findElement(btnBookTicket); }
    protected WebElement getLblBookSuccessfully(){ return Constant.WEBDRIVER.findElement(btnBookTicket); }

    //Methods
    public BookTicketPage open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }

    public BookTicketPage changePassword(String departDate, String departStation, String arriveStation, String seatType, String ticketAmount){
        //submit login credentials
        this.getDdlDepartDate().sendKeys(departDate);
        this.getDdlDepartStation().sendKeys(departStation);
        this.getDdlArriveStation().sendKeys(arriveStation);
        this.getDdlSeatType().sendKeys(seatType);
        this.getDdlTicketAmount().sendKeys(ticketAmount);
        this.getBtnBookTicket().click();

        return this;
    }

    public String getSuccessMessage(){
        return this.getLblBookSuccessfully().getText();
    }


}
