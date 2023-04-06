package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement loginBtn;
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement ErrorMsg;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public StartPage login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
        return new StartPage(driver);

    }
    public StartPage loginPredefined(){
        usernameField.sendKeys("problem_user");
        passwordField.sendKeys("secret_sauce");
        loginBtn.click();
        return new StartPage(driver);

    }
    public String getError(){
        return ErrorMsg.getText();
    }


}
