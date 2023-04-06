package socialmediatests;

import base.BaseTests;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class SocialMedia extends BaseTests {
    @Test
    public void FacebookIconValidation(){
        var startPage = loginPage.loginPredefined();
        startPage.clickFBicon();

        assertEquals(startPage.getNewTabTitle(),"Sauce Labs | Facebook");

    }
}
