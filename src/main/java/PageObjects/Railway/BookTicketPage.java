package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage {
    //Locators
    private final By ddlDepartDate = By.xpath("//select[@name='Date']");
    private final By ddlDepartStation = By.xpath("//select[@name='DepartStation']");
    private final By ddlArriveStation = By.xpath("//select[@name='ArriveStation']");
    private final By ddlSeatType = By.xpath("//select[@name='SeatType']");
    private final By ddlTicketAmount = By.xpath("//select[@name='TicketAmount']");
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookSuccessfully = By.xpath("//div[@id='content']/h1");

    //Elements
    protected Select getDdlDepartDate(){ return new Select(Constant.WEBDRIVER.findElement(ddlDepartDate)); }
    protected Select getDdlDepartStation(){ return new Select(Constant.WEBDRIVER.findElement(ddlDepartStation));}
    protected Select getDdlArriveStation(){ return new Select(Constant.WEBDRIVER.findElement(ddlArriveStation)); }
    protected Select getDdlSeatType(){ return new Select(Constant.WEBDRIVER.findElement(ddlSeatType)); }
    protected Select getDdlTicketAmount(){ return new Select(Constant.WEBDRIVER.findElement(ddlTicketAmount)); }
    protected WebElement getBtnBookTicket(){ return Constant.WEBDRIVER.findElement(btnBookTicket); }
    protected WebElement getLblBookSuccessfully(){ return Constant.WEBDRIVER.findElement(btnBookTicket); }

    //Methods
    public void open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
    }

    public void bookTicket(String departDate, String departStation, String arriveStation, String seatType, String ticketAmount){
        try {
            this.getDdlDepartDate().selectByVisibleText(departDate);
            this.getDdlDepartStation().selectByVisibleText(departStation);
            this.getDdlArriveStation().selectByVisibleText(arriveStation);
            this.getDdlSeatType().selectByVisibleText(seatType);
            this.getDdlTicketAmount().selectByVisibleText(ticketAmount);
            this.getBtnBookTicket().click();
        }catch (Exception e){
            System.out.println("Cannot chose an option in book ticket form!");
        }
    }

    public String getSuccessMessage(){
        try{
            return this.getLblBookSuccessfully().getText();
        }catch (Exception e){
            return "";
        }
    }

    public String getTicketDepartDate(){
        try{
            return this.getLblBookSuccessfully().getText();
        }catch (Exception e){
            return "";
        }
    }

    public String getTicketDepartStation(){
        try{
            return this.getLblBookSuccessfully().getText();
        }catch (Exception e){
            return "";
        }
    }

    public String getTicketArriveStation(){
        try{
            return this.getLblBookSuccessfully().getText();
        }catch (Exception e){
            return "";
        }
    }

    public String getTicketSeatType(){
        try{
            return this.getLblBookSuccessfully().getText();
        }catch (Exception e){
            return "";
        }
    }

    public String getTicketAmount(){
        try{
            return this.getLblBookSuccessfully().getText();
        }catch (Exception e){
            return "";
        }
    }
}