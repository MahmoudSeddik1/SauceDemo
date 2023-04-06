package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StartPage {
    WebDriver driver;
    @FindBy(xpath = "//span[@class='title']")
        WebElement Title;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
        WebElement CartBtn;
    @FindBy(linkText = "Sauce Labs Backpack")
        WebElement SauceLabsBackpackLink;
    @FindBy(linkText = "Facebook")
        WebElement FacebookIcon;
    private By AddtoCartBtn = By.xpath("//button[text()='Add to cart']");
    private By RemovefromCartBtn = By.xpath("//button[text()='Remove']");




    public StartPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public String getTitle(){
        return Title.getText();
    }
    public void checkItemButtons(){
        int item_Nu= driver.findElements(AddtoCartBtn).size();
       for(int i = 0;i<item_Nu-1;i++){
           driver.findElements(AddtoCartBtn).get(i).click();

       }
    }
    public ShoppinCartPage goToCart(){
        CartBtn.click();
        return new ShoppinCartPage(driver);

    }
    public SauceBackpackPage clickSauceBackpack(){
        SauceLabsBackpackLink.click();
        return new SauceBackpackPage(driver);
    }
    public void AddItemToCart(){
        driver.findElements(AddtoCartBtn).get(0).click();
    }
    public void clickFBicon(){
        FacebookIcon.click();
    }
    public String getNewTabTitle(){
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.getTitle();

    }

}
