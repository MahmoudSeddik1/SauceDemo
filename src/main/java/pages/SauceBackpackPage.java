package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceBackpackPage {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement ItemTitle;
    @FindBy(xpath ="//div[@class='inventory_details_desc_container']/button")
    WebElement ItemBtn;
    public SauceBackpackPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    public String getItemTitle(){
        return ItemTitle.getText();
    }
    public String getBtnText(){
        return ItemBtn.getText();
    }
    public void clickItemBtn(){
        ItemBtn.click();
    }
}
