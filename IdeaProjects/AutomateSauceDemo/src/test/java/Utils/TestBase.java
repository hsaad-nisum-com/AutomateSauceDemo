package Utils;
import PageObjectModel.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.network.Network;
import org.openqa.selenium.devtools.v115.network.model.Request;
import org.openqa.selenium.devtools.v115.network.model.Response;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Optional;
import java.util.Properties;
public class TestBase {
    public WebDriver driver;
    Logger log = loggerHelper.getLogger(TestBase.class);
    public WebDriver WebDriverManager() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/global.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String url = prop.getProperty("Dev1URL");
        String browser_properties = prop.getProperty("browser");
        String browser_maven = System.getProperty("browser");

        String browser = browser_maven != null ? browser_maven : browser_properties;


        if (driver == null) {
            if (browser.equalsIgnoreCase("Chrome")) {
                ChromeOptions option = new ChromeOptions();
                option.setHeadless(false); //To run the script into headless mode change it to true

                driver = new ChromeDriver(option);
                driver.manage().window().maximize();


                if (browser.equalsIgnoreCase("firefox")) {
                    driver = new FirefoxDriver();
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.get(url);

            }
        }
        return driver;
    }
}
