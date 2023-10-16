package Utils;
import com.github.javafaker.Faker;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GenericUtils {
    WebDriver driver;
    WebDriverWait wait;

    Logger log = loggerHelper.getLogger(GenericUtils.class);
    public GenericUtils(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.wait = wait;
    }
    private final By loginModal = By.cssSelector("div > div.ant-modal-content > div");

    public void waitForLoginModal(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loginModal));
        log.info("Login modal opened");
    }
}
