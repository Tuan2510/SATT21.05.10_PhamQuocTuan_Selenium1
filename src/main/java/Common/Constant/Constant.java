package Common.Constant;

import org.openqa.selenium.WebDriver;

public class Constant {

    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL = "http://www.railway.somee.com/";//192.168.171.127:8082";http://www.raillog.somee.com/

    public static final String USERNAME = "1@gmail.com";

    public static final String PASSWORD = "25102000";
    public static final String PASSWORD2 = "251020000";
    public static final String INVALID_PASSWORD = "!@#$%^&*()";

    public static final String PID = "00000000";
    public static final String BLANK_PID = "";

    public static final String DEPART_DATE = "1/7/2022";
    public static final String DEPART_FROM = "Nha Trang";
    public static final String ARRIVE_AT = "Sài Gòn";
    public static final String SEAT_TYPE = "Soft seat with air conditioner";
    public static final String TICKET_AMOUNT = "5";

    public static final String BOOK_TICKET_PAGE_TITLE = "Safe Railway - Book Ticket";
    public static final String LOGIN_PAGE_TITLE = "Safe Railway - Login";
    public static final String HOME_PAGE_TITLE = "Safe Railway - Selenium Test";
}
