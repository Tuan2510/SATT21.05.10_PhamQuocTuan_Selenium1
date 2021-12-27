package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    //locators
    private final By txtEmail = By.xpath("//input[@id='email']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By txtPid = By.xpath("//input[@id='pid']");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By lblInformation = By.xpath("//div[@id='content']");
    private final By lblMessageError = By.xpath("//p[@class='message error']");

    //elements
    protected WebElement getTxtEmail(){
        return Constant.WEBDRIVER.findElement(txtEmail);
    }
    protected WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(txtPassword);
    }
    protected WebElement getTxtConfirmPassword(){
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }
    protected WebElement getTxtPid(){
        return Constant.WEBDRIVER.findElement(txtPid);
    }
    protected WebElement getBtnRegister(){
        return Constant.WEBDRIVER.findElement(btnRegister);
    }
    protected WebElement getLblInformation(){
        return Constant.WEBDRIVER.findElement(lblInformation);
    }
    protected WebElement getLblMessageError(){
        return Constant.WEBDRIVER.findElement(lblMessageError);
    }

    //methods
    public void register(String email, String password, String confirmPassword, String pid){
        //submit login credentials
        this.getTxtEmail().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
        this.getTxtPid().sendKeys(pid);
        this.getBtnRegister().click();
    }

    public String getMessage(){
        try{
            return this.getLblInformation().getText();
        }catch (Exception e){
            return "";
        }
    }

    public String getMessageError(){
        try{
            return this.getLblMessageError().getText();
        }catch (Exception e){
            return "";
        }
    }

}
