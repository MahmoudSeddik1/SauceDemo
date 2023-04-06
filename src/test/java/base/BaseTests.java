package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    protected SoftAssert softAssert;
    protected WebDriverWait wait;
    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\12378\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client"); //To enable the WebSocket
        driver = new ChromeDriver(getChromeOptions());
        loginPage = new LoginPage(driver);
        softAssert = new SoftAssert();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
       @AfterTest
     public void closeAll(){
       driver.quit();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://www.saucedemo.com/");
    }

    public ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("useAutomationExtension", false);
        options.setExperimentalOption("prefs", prefs);
        return options;
    }

}
