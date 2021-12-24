package PageObjects.Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.Constant.Constant;
public class GeneralPage {
    //locators
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By tabBookTicket = By.xpath("//div[@id='menu']//a[@href='/Page/BookTicketPage.cshtml']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By pageTitle = By.xpath("//div[@id='content']/h1");
    private final By tabRegister = By.xpath("//div[@id='menu']//a[@href='/Account/Register.cshtml']");
    private final By tabChangePassword = By.xpath("//div[@id='menu']//a[@href='/Account/ChangePassword.cshtml']");

    //elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }
    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }
    protected WebElement getTabBookTicket(){
        return Constant.WEBDRIVER.findElement(tabBookTicket);
    }
    protected WebElement getLblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getTitle(){ return Constant.WEBDRIVER.findElement(pageTitle); }
    protected WebElement getTabRegister(){ return Constant.WEBDRIVER.findElement(tabRegister); }
    protected WebElement getTabChangePassword(){ return Constant.WEBDRIVER.findElement(tabChangePassword); }

    //methods
    public String getWelcomeMessage(){
        return this.getLblWelcomeMessage().getText();
    }
    public void loggingOut(){
        this.getTabLogout().click();
    }
    public String getPageTitle(){
        return this.getTitle().getText();
    }

    public LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new LoginPage();
    }
    public BookTicketPage gotoBookTicketPage(){
        this.getTabBookTicket().click();
        return new BookTicketPage();
    }
    public BookTicketPage gotoRegisterPage(){
        this.getTabRegister().click();
        return new BookTicketPage();
    }
    public ChangePasswordPage gotoChangePasswordPage(){
        this.getTabChangePassword().click();
        return new ChangePasswordPage();
    }


}
