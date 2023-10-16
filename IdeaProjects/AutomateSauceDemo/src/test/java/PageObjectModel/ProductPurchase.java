package PageObjectModel;
import Utils.loggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ProductPurchase {
    //testing branch
    public WebDriver driver;
    Logger log = loggerHelper.getLogger(ProductPurchase.class);

    //constructor
    public ProductPurchase(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private final By firstProduct = By.xpath("(//button[normalize-space()='Add to cart'])[1]");
    private final By secondProduct = By.xpath("(//button[normalize-space()='Add to cart'])[2]");
    private final By thirdProduct = By.xpath("(//button[normalize-space()='Add to cart'])[3]");
    private final By addToCartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");
    private final By cartPageTitle = By.xpath("//span[@class='title']");
    private final By checkoutButton = By.id("checkout");
    private final By continueButton = By.id("continue");
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By finishButton = By.id("finish");
    private final By backHomeButton = By.id("back-to-products");


    public void selectProductsToBuy(){
        driver.findElement(firstProduct).click();
        driver.findElement(secondProduct).click();
        driver.findElement(thirdProduct).click();
    }
    public void clickOnAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }
    public void verifyUserOnCartPage()
    {
        String cartPage_title = driver.findElement(cartPageTitle).getText();
        Assert.assertEquals(cartPage_title,"Your Cart");
        log.info("User is on the Cart page");
    }
    public void clickOnCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public void verifyUserOnCheckoutPage()
    {
        String checkoutPage_title = driver.findElement(cartPageTitle).getText();
        Assert.assertEquals(checkoutPage_title,"Checkout: Your Information");
        log.info("User is on the Checkout page");
    }
    public void clickOnContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void verifyUserOnOverviewPage()
    {
        String Overview_title = driver.findElement(cartPageTitle).getText();
        Assert.assertEquals(Overview_title,"Checkout: Overview");
        log.info("User is on the Overview page");
    }
    public void enterYourInformation(){
        driver.findElement(firstNameField).sendKeys("Test-FirstName");
        driver.findElement(lastNameField).sendKeys("Test-LastNme");
        driver.findElement(postalCodeField).sendKeys("Test-PostalCode");
    }
    public void clickOnFinishButton(){
        driver.findElement(finishButton).click();
    }
    public void verifyUserOnCompletePage()
    {
        String completePage_title = driver.findElement(cartPageTitle).getText();
        Assert.assertEquals(completePage_title,"Checkout: Complete!");
        log.info("User is on the Complete page");
    }
    public void clickOnBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }

}
