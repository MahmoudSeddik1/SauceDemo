package pages;

import jdk.jshell.spi.ExecutionControlProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppinCartPage {
    WebDriver driver;
    @FindBy(xpath = "//button[text()='Remove']")
    WebElement RemoveBtn;
    By ItemName = By.xpath("//div[@class='inventory_item_name']");
    By QuantityBox = By.xpath("//div[@class='cart_quantity']");


    public ShoppinCartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    public String getItemName_SingleItem(){
       return driver.findElements(ItemName).get(0).getText();
    }
    public void ChangeQuantity(){
          driver.findElements(QuantityBox).get(0).sendKeys("2");
    }
    public String getBtnName(){
        return RemoveBtn.getText();
    }
    public void clickRemove(){
        RemoveBtn.click();
    }
    public boolean checkforEmptyList(){

           try {
               if (RemoveBtn.isDisplayed()) {
                   return false;
               } else {
                   return true;
               }
           }catch(Exception e){
               return true;
           }

    }
}
