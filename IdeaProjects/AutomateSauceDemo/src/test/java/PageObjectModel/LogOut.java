package PageObjectModel;
import Utils.loggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LogOut {
    //testing branch
    public WebDriver driver;
    Logger log = loggerHelper.getLogger(LogOut.class);

    //constructor
    private final By productPageTitle = By.xpath("//span[@class='title']");
    private final By menuButton = By.id("react-burger-menu-btn");
    private final By logoutButton = By.id("logout_sidebar_link");
    private final By verifyLoginPage = By.xpath("//h4[normalize-space()='Accepted usernames are:']");

    public LogOut(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
//
//    public void logout(){
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");
//
//    }
    public void verifyUserOnMainPage() throws InterruptedException {
        String P_title = driver.findElement(productPageTitle).getText();
        Assert.assertEquals(P_title,"Products");
        log.info("User is on the Main page");
        Thread.sleep(700);
    }
    public void clickOnMenuIcon(){
        driver.findElement(menuButton).click();
    }
    public void clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
        String verifyLogin = driver.findElement(verifyLoginPage).getText();
        Assert.assertEquals(verifyLogin,"Accepted usernames are:");
        log.info("User is on the Login page");
    }
}
