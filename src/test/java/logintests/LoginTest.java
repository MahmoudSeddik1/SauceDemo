package logintests;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTests{
    @Test(priority = 0)
    public void Login_Successful(){
        var startPage = loginPage.login("problem_user","secret_sauce");
        assertEquals(startPage.getTitle(),"Products");
    }
    @Test(priority = 1)
    public void Login_Failure(){
        loginPage.login("problem_user","WRONGPASSWORD");
        assertEquals(loginPage.getError(),"Epic sadface: Username and password do not match any user in this service");
    }
}
