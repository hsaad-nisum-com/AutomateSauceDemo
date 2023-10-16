package PageObjectModel;
import Utils.GenericUtils;
import org.openqa.selenium.WebDriver;
public class PageObjectManager {
    //this class is initiating the objects

    public GenericUtils genericUtil;
    public WebDriver driver;
    public LoginPage login;
    public LogOut logout;
    public ProductPurchase productPurchase;


    //constructor
    public  PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage getLogin(){
        login = new LoginPage(driver);
        return login;
    }

    public GenericUtils getGenericUtil(){
        genericUtil= new GenericUtils(driver);
        return genericUtil;
    }
    public LoginPage getLoginPage(){
        login = new LoginPage(driver);
        return login;
    }

    public LogOut logOut(){
        logout = new LogOut(driver);
        return logout;
    }
    public ProductPurchase getProductPurchase(){
        productPurchase = new ProductPurchase(driver);
        return productPurchase;
    }
}
